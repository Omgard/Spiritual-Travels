package com.omgard.ritecraft.world.dimension.projectedforest;

import java.util.Random;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.omgard.ritecraft.init.ModBiomes;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

public class ProjectedForestBiomeProvider extends BiomeProvider {

	private Random rand;

	public ProjectedForestBiomeProvider() {
		super(biomeList);
		rand = new Random();
	}

	private static final Set<Biome> biomeList = ImmutableSet.of(ModBiomes.PROJECTED_FOREST.get());

	@Override
	public Biome getNoiseBiome(int x, int y, int z) {
		return ModBiomes.PROJECTED_FOREST.get();
	}

}
