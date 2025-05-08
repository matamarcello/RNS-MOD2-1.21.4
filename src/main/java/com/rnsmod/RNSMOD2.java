package com.rnsmod;

import com.rnsmod.block.ModBlocks;
import com.rnsmod.item.ModItemGroups;
import com.rnsmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RNSMOD2 implements ModInitializer {
	public static final String MOD_ID = "rnsmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
		ModBlocks.initialize();
		ModItemGroups.registerItemGroups();
		}
}