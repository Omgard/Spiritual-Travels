package com.omgard.ritecraft.init;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.world.biomes.ProjectedForestBiome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomes {

	public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, Main.MOD_ID);

	// Projected Forest Biome
	public static final RegistryObject<Biome> PROJECTED_FOREST = BIOMES.register("projected_forest",
			() -> new ProjectedForestBiome(new Biome.Builder()
					.temperature(0.5F).waterColor(0x148877)
					.waterFogColor(0x4F877E)
					.surfaceBuilder(SurfaceBuilder.DEFAULT,
							new SurfaceBuilderConfig(ModBlocks.ASTRAL_GRASS_BLOCK.get().getDefaultState(),
									ModBlocks.ASTRAL_DIRT.get().getDefaultState(),
									ModBlocks.ASTRAL_DIRT.get().getDefaultState()))
					.category(Category.PLAINS)
					.downfall(0.5F)
					.precipitation(RainType.SNOW)
					.parent(null)

			)
		);
	
	public static void registerBiomes() {
		registerBiome(PROJECTED_FOREST.get(), Type.PLAINS, Type.OVERWORLD);
	}
	
	private static void registerBiome(Biome biome, Type... types) {
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 100));
		
	}

	static void register() {
	}
}
