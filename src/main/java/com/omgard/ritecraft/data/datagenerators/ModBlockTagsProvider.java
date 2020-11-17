package com.omgard.ritecraft.data.datagenerators;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.init.ModBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;

public class ModBlockTagsProvider extends ForgeBlockTagsProvider {

	public ModBlockTagsProvider(DataGenerator gen) {
		super(gen);
	}
	
	@Override
	public void registerTags() {
		
		// BLOCKS
		// getBuilder(BlockTags.).add(ModBlocks..get());
		// getBuilder(Tags.Blocks.).add(ModBlocks..get());
		
		getBuilder(BlockTags.LOGS).add(ModBlocks.ASTRAL_LOG.get(), ModBlocks.MUTATED_FIR_LOG.get());
		getBuilder(BlockTags.LEAVES).add(ModBlocks.MUTATED_FIR_LEAVES.get(), ModBlocks.ASTRAL_LEAVES.get());
		getBuilder(BlockTags.FENCES).add(ModBlocks.MUTATED_FIR_FENCE.get(), ModBlocks.ASTRAL_FENCE.get());
		getBuilder(BlockTags.PLANKS).add(ModBlocks.ASTRAL_PLANKS.get(), ModBlocks.MUTATED_FIR_PLANKS.get());
		getBuilder(BlockTags.SAPLINGS).add(ModBlocks.MUTATED_FIR_SAPLING.get(), ModBlocks.ASTRAL_SAPLING.get());
		getBuilder(BlockTags.BUTTONS).add(ModBlocks.ASTRAL_BUTTON.get(), ModBlocks.MUTATED_FIR_BUTTON.get());
		getBuilder(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.ASTRAL_PRESSURE_PLATE.get(), ModBlocks.MUTATED_FIR_PRESSURE_PLATE.get());
		getBuilder(Tags.Blocks.DIRT).add(ModBlocks.ASTRAL_DIRT.get(), ModBlocks.DARK_DIRT.get());
		getBuilder(Tags.Blocks.STORAGE_BLOCKS).add(ModBlocks.MUTATED_INGOT_BLOCK.get());
		
		
	}
	
	@Override
	public String getName() {
		return Main.MOD_ID + ": Blocktags";
	}
	
	

}
