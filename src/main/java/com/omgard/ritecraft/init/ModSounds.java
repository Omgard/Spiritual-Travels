package com.omgard.ritecraft.init;

import com.omgard.ritecraft.Main;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;

public class ModSounds {
	
	public static final RegistryObject<SoundEvent> AMBIENT = Registration.SOUNDS.register("entity.warthog_entity.ambient", () -> new SoundEvent(new ResourceLocation(Main.MOD_ID, "entity.warthog_entity.ambient")));

	
	
	
	
	
	static void register() {}
}
