package com.avaritia;

import com.avaritia.block.ModBlocks;
import com.avaritia.item.ModItemGroups;
import com.avaritia.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Avaritia implements ModInitializer {
	public static final String MOD_ID = "avaritia";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}