package com.omgard.spiritualtravels;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.omgard.spiritualtravels.init.ModBlocks;
import com.omgard.spiritualtravels.init.ModEntityTypes;
import com.omgard.spiritualtravels.init.ModItems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("spiritualtravels")
public class Main 
{

public static final Logger LOGGER = LogManager.getLogger();
public static final String MOD_ID = "spiritualtravels";

public Main() {

    FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);       
    FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    
    ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    ModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

    MinecraftForge.EVENT_BUS.register(this);
}

private void setup(final FMLCommonSetupEvent event) {
	
}

private void doClientStuff(final FMLClientSetupEvent event) {
   
}

// Custom ItemGroup TAB
//public static final ItemGroup TAB = new ItemGroup("omgardsTab") {
	
	//@Override
	//public ItemStack createIcon() {
		//return new ItemStack(ModItems.ICON.get());
	//}
//};
}