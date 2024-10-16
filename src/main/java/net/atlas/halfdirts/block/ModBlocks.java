package net.atlas.halfdirts.block;

import net.atlas.halfdirts.Halfdirts;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.CAULDRON;

public class ModBlocks {
    public static final Block DIRT_SLAB = register("dirt_slab", new Block(AbstractBlock.Settings.create().mapColor(MapColor.DIRT_BROWN).strength(0.5F).sounds(BlockSoundGroup.GRAVEL)));

    private static Block register(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Halfdirts.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        Halfdirts.LOGGER.info("Registering Blocks for " + Halfdirts.MOD_ID);
    }
}