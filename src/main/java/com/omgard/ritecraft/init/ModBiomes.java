package com.omgard.ritecraft.init;

import com.omgard.ritecraft.world.biomes.ExampleBiome;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;

public class ModBiomes {
	
	// Example Biome
	public static final RegistryObject<Biome> EXAMPLE_BIOME = Registration.BIOMES.register("example_biome", () -> new ExampleBiome(new Biome.Builder()
			.surfaceBuilder(SurfaceBuilder.DEFAULT, 
					new SurfaceBuilderConfig(ModBlocks.MUTATED_FIR_LOG.get().getDefaultState(), 
											 Blocks.ACACIA_PLANKS.getDefaultState(), 
											 ModBlocks.MUTATED_FIR_LOG.get().getDefaultState()))
			.precipitation(RainType.SNOW)
			.temperature(0.5F)
			.waterColor(14283911)
			.waterFogColor(11911303)				
			.category(Category.PLAINS)
			.downfall(0.5F)
			.depth(0.125F)
			.parent(null)
			));

	
	
	
	static void register() {}
}
