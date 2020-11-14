package com.omgard.ritecraft.data.client;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.init.ModBlocks;

import net.minecraft.block.LogBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
	
	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		
		super(gen, Main.MOD_ID, exFileHelper);
		
	}

	
	@Override
	protected void registerStatesAndModels() {
		simpleBlock(ModBlocks.DARK_DIRT.get());
		simpleBlock(ModBlocks.MUTATED_FIR_PLANKS.get());
		simpleBlock(ModBlocks.MUTATED_FIR_LEAVES.get());
		//simpleBlock(ModBlocks.MUTATED_INGOT_BLOCK.get());
		logBlock((LogBlock) ModBlocks.MUTATED_FIR_LOG.get());
		logBlock((LogBlock) ModBlocks.ASTRAL_LOG.get());
		simpleBlock(ModBlocks.ASTRAL_DIRT.get());
		//fenceBlock(ModBlocks.MUTATED_FIR_FENCE.get(), new ResourceLocation(Main.MOD_ID + ":block/mutated_fir_planks"));
		
		
		
		
		
	} 

}
