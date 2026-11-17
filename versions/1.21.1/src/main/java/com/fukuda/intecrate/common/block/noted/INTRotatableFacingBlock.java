package com.fukuda.intecrate.common.block.noted;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class INTRotatableFacingBlock extends Block {
    public static final EnumProperty<Direction> FACING = DirectionalBlock.FACING;

    public INTRotatableFacingBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        // Standard DirectionalBlock placement (like Barrels, Hay Bales, Pistons)
        return this.defaultBlockState().setValue(FACING, context.getClickedFace());
    }
}