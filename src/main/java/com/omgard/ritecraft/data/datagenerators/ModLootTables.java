package com.omgard.ritecraft.data.datagenerators;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.data.ModBaseLootTables;
import com.omgard.ritecraft.init.ModBlocks;

import net.minecraft.data.DataGenerator;

public class ModLootTables extends ModBaseLootTables {

	public ModLootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}

	@Override
	protected void addTables() {
		lootTables.put(ModBlocks.ASTRAL_DIRT.get(), createStandardTable("astral_dirt", ModBlocks.ASTRAL_DIRT.get()));
		
		
	}
	
	@Override
	public String getName() {
		return Main.MOD_ID + ": Loot Tables";
	}

}
