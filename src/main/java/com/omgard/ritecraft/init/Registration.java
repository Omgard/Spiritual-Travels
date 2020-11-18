package com.omgard.ritecraft.init;

import com.omgard.ritecraft.Main;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
	
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Main.MOD_ID);
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, Main.MOD_ID);
	public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS, Main.MOD_ID);
	public static final DeferredRegister<ModDimension> MOD_DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, Main.MOD_ID);

    public static void register() {
        
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        SOUNDS.register(modEventBus);
        Main.LOGGER.info("Registered Sounds!");        
        BLOCKS.register(modEventBus);
        Main.LOGGER.info("Registered Blocks!");
        ITEMS.register(modEventBus);
        Main.LOGGER.info("Registered Items!");
        ENTITY_TYPES.register(modEventBus);
        Main.LOGGER.info("Registered Entities!");       
        //ModBiomes.BIOMES.register(modEventBus);
        //Main.LOGGER.info("Registered Biomes!");
        MOD_DIMENSIONS.register(modEventBus);
        Main.LOGGER.info("Registered Dimensions!");
        
        ModSounds.register();
        ModBlocks.register();
        ModItems.register();
        ModDimensions.register();
        ModEntityTypes.register();

    }
    
    public static void setRender() {
    	
		RenderTypeLookup.setRenderLayer(ModBlocks.MUTATED_FIR_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.BLUEBERRY_BUSH_BLOCK.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.BLUESHROOM.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.SEESHROOM.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.STONESHROOM.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.ELKSBLOOM.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.MUTATED_ELKSBLOOM.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.MOONWEED.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.COMMON_BLUELEAF.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.ASTRAL_DOOR.get(), RenderType.getCutout());
    	
    }
    
}