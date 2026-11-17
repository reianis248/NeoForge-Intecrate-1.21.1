package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.food.FourSliceCakeBlock;
import com.fukuda.intecrate.common.block.registry.food.DecoCakeBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class IntecrateBlockStateProvider extends BlockStateProvider {
    public IntecrateBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Intecrate.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        fourSliceCakeBlock(DecoCakeBlocks.PLAIN_CAKE.get());
        fourSliceCakeBlock(DecoCakeBlocks.SWEET_BERRY_CAKE.get());
        fourSliceCakeBlock(DecoCakeBlocks.GLOW_BERRY_CAKE.get());
        fourSliceCakeBlock(DecoCakeBlocks.CHORUS_FRUIT_CAKE.get());
        fourSliceCakeBlock(DecoCakeBlocks.CARROT_CAKE.get());
        fourSliceCakeBlock(DecoCakeBlocks.HONEY_CAKE.get());
    }

    private void cakeBlock(Block block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();

        getVariantBuilder(block).forAllStates(state -> {
            int bites = state.getValue(CakeBlock.BITES);
            String modelName = bites == 0 ? name : name + "_slice" + bites;
            String parentName = bites == 0 ? "block/cake" : "block/cake_slice" + bites;

            ModelFile model = models().withExistingParent(modelName, mcLoc(parentName))
                    .texture("particle", modLoc("block/cake/" + name + "_side"))
                    .texture("bottom", modLoc("block/cake/" + name + "_bottom"))
                    .texture("top", modLoc("block/cake/" + name + "_top"))
                    .texture("side", modLoc("block/cake/" + name + "_side"))
                    .texture("inside", modLoc("block/cake/" + name + "_inner"));

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .build();
        });
    }
    private void fourSliceCakeBlock(Block block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();

        getVariantBuilder(block).forAllStates(state -> {
            int bites = state.getValue(FourSliceCakeBlock.SLICES);

            // If bites is 4 (the breaking state), fallback to slice3 for datagen so it doesn't crash
            int modelBites = Math.min(bites, 3);
            String modelName = modelBites == 0 ? name : name + "_slice" + modelBites;
            ModelFile model = models().getExistingFile(modLoc("block/cake/" + modelName));

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .build();
        });
    }
}