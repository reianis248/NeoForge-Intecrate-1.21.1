package com.fukuda.intecrate.common.block.noted.food;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Supplier;

public class FourSliceCakeBlock extends Block {
    public static final int MAX_SLICES = 3;
    public static final IntegerProperty SLICES = IntegerProperty.create("slices", 0, 3);
    private final Supplier<Item> sliceItem;

    protected static final VoxelShape[] SHAPE_BY_SLICE = new VoxelShape[]{
            Block.box(0.5D, 0.0D, 0.5D, 15.5D, 9.0D, 15.5D),
            Shapes.or(
                    Block.box(0.5D, 0.0D, 0.5D, 15.5D, 9.0D, 8.0D),
                    Block.box(0.5D, 0.0D, 8.0D, 8.0D, 9.0D, 15.5D)
            ),
            Block.box(0.5D, 0.0D, 0.5D, 15.5D, 9.0D, 8.0D),
            Block.box(0.5D, 0.0D, 0.5D, 8.0D, 9.0D, 8.0D)
    };

    public FourSliceCakeBlock(Properties properties, Supplier<Item> sliceItem) {
        super(properties);
        this.sliceItem = sliceItem;
        this.registerDefaultState(this.stateDefinition.any().setValue(SLICES, 0));
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE_BY_SLICE[state.getValue(SLICES)];
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        Item item = stack.getItem();
        if (stack.is(ItemTags.CANDLES) && state.getValue(SLICES) == 0) {
            Block block = Block.byItem(item);
            if (block instanceof CandleBlock) {
                stack.consume(1, player);
                level.playSound(null, pos, SoundEvents.CAKE_ADD_CANDLE, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
                player.awardStat(Stats.ITEM_USED.get(item));
                return ItemInteractionResult.SUCCESS;
            }
        }
        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (level.isClientSide) {
            if (takeSlice(level, pos, state, player, sliceItem.get()).consumesAction()) {
                return InteractionResult.SUCCESS;
            }
            if (player.getItemInHand(InteractionHand.MAIN_HAND).isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }
        return takeSlice(level, pos, state, player, sliceItem.get());
    }

    protected static InteractionResult takeSlice(LevelAccessor level, BlockPos pos, BlockState state, Player player, Item slice) {
        int slices = state.getValue(SLICES);

        // Give the slice item to the player
        ItemStack sliceStack = new ItemStack(slice);
        if (!player.addItem(sliceStack)) {
            player.drop(sliceStack, false);
        }

        level.playSound(null, pos, SoundEvents.CAKE_ADD_CANDLE, SoundSource.BLOCKS, 1.0f, 1.0f); // Or a slice/wool sound of your choice
        level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);

        if (slices < MAX_SLICES) {
            level.setBlock(pos, state.setValue(SLICES, slices + 1), Block.UPDATE_ALL);
        } else {
            level.removeBlock(pos, false);
            level.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    protected BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        return facing == Direction.DOWN && !state.canSurvive(level, currentPos)
                ? Blocks.AIR.defaultBlockState()
                : super.updateShape(state, facing, facingState, level, currentPos, facingPos);
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return level.getBlockState(pos.below()).isSolid();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(SLICES);
    }

    @Override
    protected boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    @Override
    protected int getAnalogOutputSignal(BlockState blockState, Level level, BlockPos pos) {
        int slices = blockState.getValue(SLICES);
        return (4 - slices) * 2;
    }

    @Override
    protected boolean isPathfindable(BlockState state, PathComputationType pathComputationType) {
        return false;
    }
}