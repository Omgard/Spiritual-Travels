package com.omgard.ritecraft.init;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.world.biomes.ExampleBiome;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomes {
	
	public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, Main.MOD_ID);
	
	
	// Example Biome
	public static final RegistryObject<Biome> EXAMPLE_BIOME = BIOMES.register("example_biome", () -> new ExampleBiome(new Biome.Builder()
			.surfaceBuilder(SurfaceBuilder.DEFAULT, 
					new SurfaceBuilderConfig(ModBlocks.SILVER_BLOCK.get().getDefaultState(), 
											 Blocks.ACACIA_PLANKS.getDefaultState(), 
											 ModBlocks.SILVER_BLOCK.get().getDefaultState()))
			.precipitation(RainType.SNOW)
			.temperature(0.5F)
			.waterColor(14283911)
			.waterFogColor(11911303)				
			.category(Category.PLAINS)
			.downfall(0.5F)
			.depth(0.125F)
			.parent(null)));

}
