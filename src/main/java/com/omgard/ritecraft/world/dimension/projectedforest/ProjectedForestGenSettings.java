package com.omgard.ritecraft.world.dimension.projectedforest;

import net.minecraft.world.gen.GenerationSettings;

public class ProjectedForestGenSettings extends GenerationSettings {
	
	public int getBiomeSize() {
		return 4;
	}
	
	public int getRiverSize() {
		return 4;
	}
	
	public int getBiomeId() {
	return -1;
	}
	
	@Override
	public int getBedrockFloorHeight() {
		return 0;
	}
}
