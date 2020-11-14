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
	public static final RegistryObject<Item> TEA_LEAVES = Registration.ITEMS.register("tea_leaves", ItemBase::new);
	public static final RegistryObject<Item> WARTHOG_TUSK = Registration.ITEMS.register("warthog_tusk", ItemBase::new);
	public static final RegistryObject<Item> BLUEBERRY = Registration.ITEMS.register("blueberry", ItemBase::new);
	public static final RegistryObject<Item> OWL_FEATHER = Registration.ITEMS.register("owl_feather", ItemBase::new);
	public static final RegistryObject<Item> EMPTY_CUP = Registration.ITEMS.register("empty_cup", ItemBase::new);
	public static final RegistryObject<Item> BLUEBERRY_TEA = Registration.ITEMS.register("blueberry_tea", CupOfTea::new);
	public static final RegistryObject<Item> SUNLEAF = Registration.ITEMS.register("sunleaf", ItemBase::new);
	public static final RegistryObject<Item> CHAOS_TEA = Registration.ITEMS.register("chaos_tea", CupOfTea::new);
	public static final RegistryObject<Item> VISION_TEA = Registration.ITEMS.register("vision_tea", CupOfTea::new);
	public static final RegistryObject<Item> MUTATED_INGOT = Registration.ITEMS.register("mutated_ingot", ItemBase::new);
	public static final RegistryObject<Item> MUTATED_BATTLEAXE = Registration.ITEMS.register("mutated_battleaxe", ItemBase::new);
	public static final RegistryObject<Item> DARKROOT = Registration.ITEMS.register("darkroot", ItemBase::new);
	public static final RegistryObject<Item> WARTHOG_SNOUT = Registration.ITEMS.register("warthog_snout", ItemBase::new);
	public static final RegistryObject<Item> ELK_ANTLER = Registration.ITEMS.register("elk_antler", ItemBase::new);
	public static final RegistryObject<Item> MOON_ANTLER = Registration.ITEMS.register("moon_antler", ItemBase::new);
	public static final RegistryObject<Item> LYNX_PAW = Registration.ITEMS.register("lynx_paw", ItemBase::new);
	public static final RegistryObject<Item> OWLS_BEAK = Registration.ITEMS.register("owls_beak", ItemBase::new);
	public static final RegistryObject<Item> GREEN_FOX_EYE = Registration.ITEMS.register("green_fox_eye", ItemBase::new);
	public static final RegistryObject<Item> GOLDEN_LEATHER = Registration.ITEMS.register("golden_leather", ItemBase::new);
	public static final RegistryObject<Item> FOX_TAIL = Registration.ITEMS.register("fox_tail", ItemBase::new);
	public static final RegistryObject<Item> GOLDEN_FOX_TAIL = Registration.ITEMS.register("golden_fox_tail", ItemBase::new);
	public static final RegistryObject<Item> ELK_BONES = Registration.ITEMS.register("elk_bones", ItemBase::new);
	public static final RegistryObject<Item> ELKBONE_CLUB = Registration.ITEMS.register("elkbone_club", ItemBase::new);
	public static final RegistryObject<Item> ACORN = Registration.ITEMS.register("acorn", ItemBase::new);
	public static final RegistryObject<Item> LUCKY_ACORN = Registration.ITEMS.register("lucky_acorn", ItemBase::new);
	public static final RegistryObject<Item> DEER_LEATHER = Registration.ITEMS.register("deer_leather", ItemBase::new);
	public static final RegistryObject<Item> RUINED_ELK_ANTLER = Registration.ITEMS.register("ruined_elk_antler", ItemBase::new);
	public static final RegistryObject<Item> MOON_LEATHER = Registration.ITEMS.register("moon_leather", ItemBase::new);
	
	

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
