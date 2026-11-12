package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.food.CakeBlocks;
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
        cakeBlock(CakeBlocks.PLAIN_CAKE.get());
        cakeBlock(CakeBlocks.SWEET_BERRY_CAKE.get());
        cakeBlock(CakeBlocks.GLOW_BERRY_CAKE.get());
        cakeBlock(CakeBlocks.CHORUS_FRUIT_CAKE.get());
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
}