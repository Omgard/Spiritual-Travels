package com.omgard.ritecraft.init;

import com.omgard.ritecraft.Main;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
	
	//This is the old registrer, moved to Registration.java
	//public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);
	
	
	// Items
	public static final RegistryObject<Item> SILVER_INGOT = Registration.ITEMS.register("silver_ingot", 
			() -> new Item(new Item.Properties().group(Main.TAB)));

	static void register() {}
}
