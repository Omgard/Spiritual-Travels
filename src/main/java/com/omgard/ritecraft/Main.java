package com.omgard.ritecraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.omgard.ritecraft.init.ModBlocks;
import com.omgard.ritecraft.init.ModEntityTypes;
import com.omgard.ritecraft.init.ModItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MOD_ID)
public class Main 
{

public static final Logger LOGGER = LogManager.getLogger();
public static final String MOD_ID = "ritecraft";

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
public static final ItemGroup TAB = new ItemGroup("RiteCraftTab") {
	
	@Override
	public ItemStack createIcon() {
		return new ItemStack(Items.STICK.getItem());
	}
};
}