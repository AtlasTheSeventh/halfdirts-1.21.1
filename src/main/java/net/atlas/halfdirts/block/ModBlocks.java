package net.atlas.halfdirts.block;

import net.atlas.halfdirts.Halfdirts;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.CAULDRON;

public class ModBlocks {
    public static final Block DIRT_SLAB = register("block_of_silly", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));

    private static Block register(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Halfdirts.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        Halfdirts.LOGGER.info("Registering Blocks for " + Halfdirts.MOD_ID);
    }
}

