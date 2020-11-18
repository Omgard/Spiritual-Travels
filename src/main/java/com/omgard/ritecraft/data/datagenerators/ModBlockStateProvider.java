package com.omgard.ritecraft.data.datagenerators;

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
		simpleBlock(ModBlocks.MUTATED_INGOT_BLOCK.get());
		logBlock((LogBlock) ModBlocks.MUTATED_FIR_LOG.get());
		logBlock((LogBlock) ModBlocks.ASTRAL_LOG.get());
		simpleBlock(ModBlocks.ASTRAL_LEAVES.get());
		simpleBlock(ModBlocks.ASTRAL_DIRT.get());
		simpleBlock(ModBlocks.ASTRAL_PLANKS.get());
		slabBlock(ModBlocks.ASTRAL_SLAB.get(), new ResourceLocation(Main.MOD_ID+":block/astral_planks"), new ResourceLocation(Main.MOD_ID+":block/astral_planks"));
		slabBlock(ModBlocks.MUTATED_FIR_SLAB.get(), new ResourceLocation(Main.MOD_ID+":block/mutated_fir_planks"), new ResourceLocation(Main.MOD_ID+":block/mutated_fir_planks"));
		fenceGateBlock(ModBlocks.ASTRAL_FENCE_GATE.get(), new ResourceLocation(Main.MOD_ID+":block/astral_planks"));
		fenceGateBlock(ModBlocks.MUTATED_FIR_FENCE_GATE.get(), new ResourceLocation(Main.MOD_ID+":block/mutated_fir_planks"));
		doorBlock(ModBlocks.ASTRAL_DOOR.get(), new ResourceLocation(Main.MOD_ID+":block/astral_door_bottom"), new ResourceLocation(Main.MOD_ID+":block/astral_door_top"));
		//doorBlock(ModBlocks.MUTATED_FIR_DOOR.get(), new ResourceLocation(Main.MOD_ID+":block/mutated_fir_door_bottom"), new ResourceLocation(Main.MOD_ID+":block/mutated_fir_door_top"));
		//trapdoorBlock(ModBlocks.ASTRAL_TRAPDOOR.get(), new ResourceLocation(Main.MOD_ID + "block/astral_trapdoor"), true);
		//trapdoorBlock(ModBlocks.MUTATED_FIR_TRAPDOOR.get(), new ResourceLocation(Main.MOD_ID + "block/mutated_fir_trapdoor"), true);
		
		
		
		
		
		
	} 
	
	@Override
	public String getName() {
		return Main.MOD_ID + ": States and Models";
	}

}
