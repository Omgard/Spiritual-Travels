package com.omgard.ritecraft.world.biomes;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;

public class ExampleBiome extends Biome {

	public ExampleBiome(Builder biomeBuilder) { 
		super(new Biome.Builder()				);
				addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BEE, 20, 2, 10));
				
				
				
				;
	}
	


}
