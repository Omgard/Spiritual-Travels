package com.omgard.ritecraft.data.client;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.init.ModBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
	
	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		
		super(gen, Main.MOD_ID, exFileHelper);
		
	}

	
	@Override
	protected void registerStatesAndModels() {
		simpleBlock(ModBlocks.SILVER_BLOCK.get());
		simpleBlock(ModBlocks.SILVER_ORE.get());
		
		
	} 

}
