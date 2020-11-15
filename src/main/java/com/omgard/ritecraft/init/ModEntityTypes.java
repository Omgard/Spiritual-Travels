package com.omgard.ritecraft.init;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.objects.entities.WarthogEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class ModEntityTypes {
	
	//public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Main.MOD_ID);
	
	// Entity Types
	public static final RegistryObject<EntityType<WarthogEntity>> WARTHOG = Registration.ENTITY_TYPES.register("warthog",
            () -> EntityType.Builder.<WarthogEntity>create(WarthogEntity::new, EntityClassification.CREATURE)
                    .size(1.0F, 1.0F) // Hitbox Size
                    .build(new ResourceLocation(Main.MOD_ID, "warthog").toString()));
	
	/*public static final RegistryObject<EntityType<BearEntity>> BEAR = Registration.ENTITY_TYPES.register("bear", 
			() -> EntityType.Builder.<BearEntity>create(BearEntity::new, EntityClassification.CREATURE)
            .size(1.0F, 1.0F) // Hitbox Size
            .build(new ResourceLocation(Main.MOD_ID, "bear").toString())); */

	
	
	
	
	static void register() {}
}
