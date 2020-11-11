package com.omgard.ritecraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.omgard.ritecraft.init.ModItems;
import com.omgard.ritecraft.init.Registration;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MOD_ID)
public class Main 
{

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "ritecraft";
	public static Main instance;
	
	

	public Main() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::doClientStuff);
		
		Registration.register();
		
		
		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
		
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		
	}
	
	private void doClientStuff(final FMLClientSetupEvent event) {
		
	}
	
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
		
	}
	
	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
		
	}
	
	
	
	
	
	
	
	// Custom ItemGroup TAB
		public static final ItemGroup TAB = new ItemGroup("ritecrafttab") {
		
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ModItems.TEA_LEAVES.get());
			}
		};

}