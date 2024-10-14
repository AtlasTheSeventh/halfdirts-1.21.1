package net.atlas.halfdirts;

import net.atlas.halfdirts.block.ModBlocks;
import net.atlas.halfdirts.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Halfdirts implements ModInitializer {
	public static final String MOD_ID = "halfdirts";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}