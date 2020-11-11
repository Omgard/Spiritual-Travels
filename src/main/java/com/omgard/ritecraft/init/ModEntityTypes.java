package com.omgard.ritecraft.init;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.data.base.WarthogEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Main.MOD_ID);
	
	// Entity Types
	public static final RegistryObject<EntityType<WarthogEntity>> WARTHOG = ENTITY_TYPES.register("warthog",
            () -> EntityType.Builder.create(WarthogEntity::new, EntityClassification.CREATURE)
                    .size(1.0f, 1.0f) // Hitbox Size
                    .build(new ResourceLocation(Main.MOD_ID, "warthog").toString()));

	
	
	
	
	static void register() {}
}
