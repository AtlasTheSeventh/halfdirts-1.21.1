package net.atlas.halfdirts.item;

import net.atlas.halfdirts.Halfdirts;
import net.atlas.halfdirts.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item DIRT = register("dirt", new Item(new Item.Settings()));
    public static final Item DIRT_SLAB = register("dirt_slab", ModBlocks.DIRT_SLAB);

    private static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Halfdirts.MOD_ID, id), item);
    }

    private static Item register(String id, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(Halfdirts.MOD_ID, id), new BlockItem(block, new Item.Settings()));
    }


    public static void registerModItems() {
        Halfdirts.LOGGER.info("Registering Mod Items for " + Halfdirts.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(DIRT);
            entries.add(DIRT_SLAB);
        });
    }
}
