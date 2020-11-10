package com.omgard.ritecraft.init;

import com.omgard.ritecraft.data.base.ItemBase;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
	
	//This is the old registrer, moved to Registration.java
	//public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);
	
	
	// Items
	public static final RegistryObject<Item> SILVER_INGOT = Registration.ITEMS.register("silver_ingot", ItemBase::new);	
	public static final RegistryObject<Item> TEA_LEAVES = Registration.ITEMS.register("tea_leaves", ItemBase::new);	
	public static final RegistryObject<Item> WARTHOG_TUSK = Registration.ITEMS.register("warthog_tusk", ItemBase::new);
	public static final RegistryObject<Item> BLUEBERRY = Registration.ITEMS.register("blueberry", ItemBase::new);
	
	//ARMOR MATERIAL IS FUCKED, somethingsomething enum bad
	// Armor
	//public static final RegistryObject<ArmorItem> WARTHOG_HELMET = Registration.ITEMS.register("warthog_helmet", 
		//			() -> new ArmorItem(ModArmorMaterial.warthog, EquipmentSlotType.HEAD, new Item.Properties().group(Main.TAB)));
			
	//public static final RegistryObject<ArmorItem> WARTHOG_CHESTPLATE = Registration.ITEMS.register("warthog_chestplate", 
			//		() -> new ArmorItem(ModArmorMaterial.warthog, EquipmentSlotType.CHEST, new Item.Properties().group(Main.TAB)));
			
//	public static final RegistryObject<ArmorItem> WARTHOG_LEGGINGS = Registration.ITEMS.register("warthog_leggings", 
	//				() -> new ArmorItem(ModArmorMaterial.warthog, EquipmentSlotType.LEGS, new Item.Properties().group(Main.TAB)));
			
//	public static final RegistryObject<ArmorItem> WARTHOG_BOOTS = Registration.ITEMS.register("warthog_boots", 
	//				() -> new ArmorItem(ModArmorMaterial.warthog, EquipmentSlotType.FEET, new Item.Properties().group(Main.TAB)));

	static void register() {}
}
