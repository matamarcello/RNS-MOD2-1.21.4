package com.rnsmod;

import com.rnsmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import com.rnsmod.block.ModBlocks;
import com.rnsmod.item.ModItemGroups;
import com.rnsmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class RNSMOD2 implements ModInitializer {
	public static final String MOD_ID = "rnsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.initialize();
		ModBlocks.initialize();
		ModWorldGeneration.generateModWorldGen();
	}}