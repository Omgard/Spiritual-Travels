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
		getBuilder(BlockTags.LEAVES).add(ModBlocks.MUTATED_FIR_LEAVES.get());
		getBuilder(BlockTags.FENCES).add(ModBlocks.MUTATED_FIR_FENCE.get());
		getBuilder(BlockTags.SAPLINGS).add(ModBlocks.MUTATED_FIR_SAPLING.get());
		getBuilder(Tags.Blocks.DIRT).add(ModBlocks.ASTRAL_DIRT.get(), ModBlocks.DARK_DIRT.get());
		getBuilder(Tags.Blocks.STORAGE_BLOCKS).add(ModBlocks.MUTATED_INGOT_BLOCK.get());
		
		
	}
	
	@Override
	public String getName() {
		return Main.MOD_ID + ": Blocktags";
	}
	
	

}
