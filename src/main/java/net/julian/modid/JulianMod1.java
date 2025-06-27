package net.julian.modid;

import net.fabricmc.api.ModInitializer;

import net.julian.modid.block.ModBlocks;
import net.julian.modid.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JulianMod1 implements ModInitializer {
	public static final String MOD_ID = "julian-mod-1";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}