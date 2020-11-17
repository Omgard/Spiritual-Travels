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
		
		// BLOCKS
		// lootTables.put(ModBlocks..get(), createStandardTable("", ModBlocks..get()));
		lootTables.put(ModBlocks.ASTRAL_DIRT.get(), createStandardTable("astral_dirt", ModBlocks.ASTRAL_DIRT.get()));
		lootTables.put(ModBlocks.ASTRAL_PLANKS.get(), createStandardTable("astral_planks", ModBlocks.ASTRAL_PLANKS.get()));
		lootTables.put(ModBlocks.ASTRAL_LOG.get(), createStandardTable("astral_log", ModBlocks.ASTRAL_LOG.get()));
		lootTables.put(ModBlocks.BLUESHROOM.get(), createStandardTable("blueshroom", ModBlocks.BLUESHROOM.get()));
		lootTables.put(ModBlocks.COMMON_BLUELEAF.get(), createStandardTable("common_blueleaf", ModBlocks.COMMON_BLUELEAF.get()));
		lootTables.put(ModBlocks.DARK_DIRT.get(), createStandardTable("dark_dirt", ModBlocks.DARK_DIRT.get()));
		lootTables.put(ModBlocks.ELKSBLOOM.get(), createStandardTable("elksbloom", ModBlocks.ELKSBLOOM.get()));
		lootTables.put(ModBlocks.MOONWEED.get(), createStandardTable("moonweed", ModBlocks.MOONWEED.get()));
		lootTables.put(ModBlocks.MUTATED_ELKSBLOOM.get(), createStandardTable("mutated_elksbloom", ModBlocks.MUTATED_ELKSBLOOM.get()));
		lootTables.put(ModBlocks.MUTATED_FIR_BUTTON.get(), createStandardTable("mutated_fir_button", ModBlocks.MUTATED_FIR_BUTTON.get()));
		lootTables.put(ModBlocks.MUTATED_FIR_FENCE.get(), createStandardTable("mutated_fir_fence", ModBlocks.MUTATED_FIR_FENCE.get()));
		lootTables.put(ModBlocks.MUTATED_FIR_LOG.get(), createStandardTable("mutated_fir_log", ModBlocks.MUTATED_FIR_LOG.get()));
		lootTables.put(ModBlocks.MUTATED_FIR_PLANKS.get(), createStandardTable("mutated_fir_planks", ModBlocks.MUTATED_FIR_PLANKS.get()));
		lootTables.put(ModBlocks.MUTATED_FIR_PRESSURE_PLATE.get(), createStandardTable("mutated_fir_pressure_plate", ModBlocks.MUTATED_FIR_PRESSURE_PLATE.get()));
		lootTables.put(ModBlocks.MUTATED_FIR_SAPLING.get(), createStandardTable("mutated_fir_sapling", ModBlocks.MUTATED_FIR_SAPLING.get()));
		lootTables.put(ModBlocks.MUTATED_FIR_STAIRS.get(), createStandardTable("mutated_fir_stairs", ModBlocks.MUTATED_FIR_STAIRS.get()));
		lootTables.put(ModBlocks.MUTATED_INGOT_BLOCK.get(), createStandardTable("mutated_ingot_block", ModBlocks.MUTATED_INGOT_BLOCK.get()));
		lootTables.put(ModBlocks.SEESHROOM.get(), createStandardTable("seeshroom", ModBlocks.SEESHROOM.get()));
		lootTables.put(ModBlocks.STONESHROOM.get(), createStandardTable("stoneshroom", ModBlocks.STONESHROOM.get()));
		lootTables.put(ModBlocks.TEAPOT.get(), createStandardTable("teapot", ModBlocks.TEAPOT.get()));
		lootTables.put(ModBlocks.ASTRAL_FENCE.get(), createStandardTable("astral_planks", ModBlocks.ASTRAL_FENCE.get()));
		lootTables.put(ModBlocks.ASTRAL_PRESSURE_PLATE.get(), createStandardTable("astral_pressure_plate", ModBlocks.ASTRAL_PRESSURE_PLATE.get()));
		lootTables.put(ModBlocks.ASTRAL_SAPLING.get(), createStandardTable("astral_sapling", ModBlocks.ASTRAL_SAPLING.get()));
		lootTables.put(ModBlocks.ASTRAL_BUTTON.get(), createStandardTable("astral_button", ModBlocks.ASTRAL_BUTTON.get()));
		
	}
	
	@Override
	public String getName() {
		return Main.MOD_ID + ": Loot Tables";
	}

}
