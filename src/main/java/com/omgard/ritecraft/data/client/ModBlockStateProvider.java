package com.omgard.ritecraft.data.client;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.init.ModBlocks;

import net.minecraft.block.LogBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelFile.ExistingModelFile;

public class ModBlockStateProvider extends BlockStateProvider {
	
	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		
		super(gen, Main.MOD_ID, exFileHelper);
		
	}

	
	@Override
	protected void registerStatesAndModels() {
		simpleBlock(ModBlocks.SILVER_BLOCK.get());
		simpleBlock(ModBlocks.SILVER_ORE.get());
		simpleBlock(ModBlocks.DARK_DIRT.get());
		simpleBlock(ModBlocks.PLAGUE_FIR_PLANKS.get());
		simpleBlock(ModBlocks.PLAGUE_FIR_LEAVES.get());
		logBlock((LogBlock) ModBlocks.PLAGUE_FIR_LOG.get());
		
		
		
		
		
	} 

}
