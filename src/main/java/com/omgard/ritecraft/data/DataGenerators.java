package com.omgard.ritecraft.data;

import com.omgard.ritecraft.Main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		
	}

}
