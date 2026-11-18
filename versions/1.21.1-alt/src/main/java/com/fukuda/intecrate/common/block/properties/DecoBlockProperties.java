package com.fukuda.intecrate.common.block.properties;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class DecoBlockProperties {
    public static BlockBehaviour.Properties crateBlockProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .strength(2.5f)
                .sound(SoundType.WOOD)
                .instrument(NoteBlockInstrument.BASS)
                .ignitedByLava()
                .mapColor(mapColor);
    }
    public static BlockBehaviour.Properties cutoutCrateBlockProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .strength(2.5f)
                .sound(SoundType.WOOD)
                .instrument(NoteBlockInstrument.BASS)
                .ignitedByLava()
                .noOcclusion()
                .mapColor(mapColor);
    }
    public static BlockBehaviour.Properties basketBlockProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .strength(1.98f)
                .sound(SoundType.SCAFFOLDING)
                .instrument(NoteBlockInstrument.BASS)
                .ignitedByLava()
                .mapColor(mapColor);
    }
    public static BlockBehaviour.Properties barrelBlockProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .strength(2.5f)
                .sound(SoundType.WOOD)
                .instrument(NoteBlockInstrument.BASS)
                .ignitedByLava()
                .mapColor(mapColor);
    }
    public static BlockBehaviour.Properties bucketBlockProperties() {
        return BlockBehaviour.Properties.of()
                .strength(3.46f, 1.48f)
                .sound(SoundType.METAL)
                .instrument(NoteBlockInstrument.BASS)
                .mapColor(MapColor.METAL);
    }
    public static BlockBehaviour.Properties boxBlockProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .strength(2.5f)
                .sound(SoundType.WOOD)
                .instrument(NoteBlockInstrument.BASS)
                .ignitedByLava()
                .mapColor(mapColor);
    }
    public static BlockBehaviour.Properties bagBlockProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .strength(0.8f)
                .sound(SoundType.WOOL)
                .instrument(NoteBlockInstrument.BASS)
                .ignitedByLava()
                .mapColor(mapColor);
    }
    public static BlockBehaviour.Properties cakeBlockProperties() {
        return BlockBehaviour.Properties.of()
                .forceSolidOn()
                .noOcclusion()
                .strength(0.5f)
                .sound(SoundType.WOOL)
                .pushReaction(PushReaction.DESTROY);
    }
    public static BlockBehaviour.Properties glowCakeBlockProperties() {
        return BlockBehaviour.Properties.of()
                .forceSolidOn()
                .noOcclusion()
                .strength(0.5f)
                .sound(SoundType.WOOL)
                .lightLevel(state -> 11)
                .pushReaction(PushReaction.DESTROY);
    }
}
