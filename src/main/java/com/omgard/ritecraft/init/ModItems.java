package com.omgard.ritecraft.init;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.objects.items.CupOfTea;
import com.omgard.ritecraft.objects.items.ItemBase;
import com.omgard.ritecraft.util.enums.ModArmorMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

	// Items
	public static final RegistryObject<Item> SILVER_INGOT = Registration.ITEMS.register("silver_ingot", ItemBase::new);
	public static final RegistryObject<Item> TEA_LEAVES = Registration.ITEMS.register("tea_leaves", ItemBase::new);
	public static final RegistryObject<Item> WARTHOG_TUSK = Registration.ITEMS.register("warthog_tusk", ItemBase::new);
	public static final RegistryObject<Item> BLUEBERRY = Registration.ITEMS.register("blueberry", ItemBase::new);
	public static final RegistryObject<Item> BLUESHROOM = Registration.ITEMS.register("blueshroom", ItemBase::new);
	public static final RegistryObject<Item> OWL_FEATHER = Registration.ITEMS.register("owl_feather", ItemBase::new);
	public static final RegistryObject<Item> SEESHROOM = Registration.ITEMS.register("seeshroom", ItemBase::new);
	public static final RegistryObject<Item> STONESHROOM = Registration.ITEMS.register("stoneshroom", ItemBase::new);
	public static final RegistryObject<Item> EMPTY_CUP = Registration.ITEMS.register("empty_cup", ItemBase::new);
	public static final RegistryObject<Item> CUP_OF_TEA = Registration.ITEMS.register("cup_of_tea", CupOfTea::new);
	public static final RegistryObject<Item> SUNLEAF = Registration.ITEMS.register("sunleaf", ItemBase::new);

	// Armor
	public static final RegistryObject<ArmorItem> WARTHOG_HELMET = Registration.ITEMS.register("warthog_helmet",
			() -> new ArmorItem(ModArmorMaterial.WARTHOG, EquipmentSlotType.HEAD,
					new Item.Properties().group(Main.TAB)));

	public static final RegistryObject<ArmorItem> WARTHOG_CHESTPLATE = Registration.ITEMS.register("warthog_chestplate",
			() -> new ArmorItem(ModArmorMaterial.WARTHOG, EquipmentSlotType.CHEST,
					new Item.Properties().group(Main.TAB)));

	public static final RegistryObject<ArmorItem> WARTHOG_LEGGINGS = Registration.ITEMS.register("warthog_leggings",
			() -> new ArmorItem(ModArmorMaterial.WARTHOG, EquipmentSlotType.LEGS,
					new Item.Properties().group(Main.TAB)));

	public static final RegistryObject<ArmorItem> WARTHOG_BOOTS = Registration.ITEMS.register("warthog_boots",
			() -> new ArmorItem(ModArmorMaterial.WARTHOG, EquipmentSlotType.FEET,
					new Item.Properties().group(Main.TAB)));

	static void register() {
	}
}
