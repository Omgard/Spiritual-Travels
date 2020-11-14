package com.omgard.ritecraft.init;

import com.omgard.ritecraft.world.dimension.projectedforest.ProjectedForestModDimension;

import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;

public class ModDimensions {
	
	public static final RegistryObject<ModDimension> PROJECTED_FOREST = Registration.MOD_DIMENSIONS.register("projected_forest", () -> new ProjectedForestModDimension());
	
	
	
	
	
	
	
	
	
	static void register() {}
}
