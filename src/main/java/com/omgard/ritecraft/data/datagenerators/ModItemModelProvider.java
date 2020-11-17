package com.omgard.ritecraft.data.datagenerators;

import javax.annotation.Nonnull;

import com.omgard.ritecraft.Main;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;

public class ModItemModelProvider extends ItemModelProvider {
	public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Main.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {

		// Block Items
		withExistingParent("dark_dirt", modLoc("block/dark_dirt"));
		withExistingParent("dark_grass_block", modLoc("block/dark_grass_block"));
		
		withExistingParent("blueshroom", modLoc ("block/blueshroom"));
		withExistingParent("seeshroom", modLoc ("block/seeshroom"));
		withExistingParent("stoneshroom", modLoc ("block/stoneshroom"));
		withExistingParent("elksbloom", modLoc ("block/elksbloom"));
		
		withExistingParent("mutated_elksbloom", modLoc ("block/mutated_elksbloom"));
		withExistingParent("mutated_fir_stairs", modLoc ("block/mutated_fir_stairs"));
		withExistingParent("mutated_fir_log", modLoc("block/mutated_fir_log"));
		withExistingParent("mutated_fir_planks", modLoc("block/mutated_fir_planks"));
		withExistingParent("mutated_fir_leaves", modLoc("block/mutated_fir_leaves"));
		withExistingParent("mutated_fir_slab", modLoc("block/mutated_fir_slab"));
		withExistingParent("mutated_fir_fence", modLoc ("block/mutated_fir_fence_inventory"));
		withExistingParent("mutated_fir_fence_gate", modLoc ("block/mutated_fir_fence_gate"));
		
		withExistingParent("astral_button", modLoc ("block/astral_button_inventory"));
		withExistingParent("astral_leaves", modLoc("block/astral_leaves"));
		withExistingParent("astral_dirt", modLoc("block/astral_dirt"));
		withExistingParent("astral_log", modLoc("block/astral_log"));
		withExistingParent("astral_stairs", modLoc("block/astral_stairs"));
		withExistingParent("astral_slab", modLoc("block/astral_slab"));
		withExistingParent("astral_planks", modLoc("block/astral_planks"));
		withExistingParent("astral_grass_block", modLoc("block/astral_grass_block"));
		withExistingParent("astral_fence", modLoc ("block/astral_fence_inventory"));
		withExistingParent("astral_fence_gate", modLoc ("block/astral_fence_gate"));
		withExistingParent("astral_pressure_plate", modLoc ("block/astral_pressure_plate"));
		//withExistingParent("astral_sapling", modLoc ("block/astral_sapling"));
		//withExistingParent("astral_trapdoor", modLoc("block/astral_trapdoor"));
		//withExistingParent("mutated_fir_trapdoor", modLoc("block/mutated_fir_trapdoor"));
		
		withExistingParent("mutated_ingot_block", modLoc("block/mutated_ingot_block"));

		// Model files
		ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

		// Items
		builder(itemGenerated, "tea_leaves");
		builder(itemGenerated, "warthog_tusk");
		builder(itemGenerated, "blueberry");
		builder(itemGenerated, "owl_feather");
		builder(itemGenerated, "empty_cup");
		builder(itemGenerated, "blueberry_tea");
		builder(itemGenerated, "warthog_helmet");
		builder(itemGenerated, "warthog_chestplate");
		builder(itemGenerated, "warthog_leggings");
		builder(itemGenerated, "warthog_boots");
		builder(itemGenerated, "sunleaf");
		builder(itemGenerated, "chaos_tea");
		builder(itemGenerated, "common_blueleaf");
		builder(itemGenerated, "vision_tea");
		builder(itemGenerated, "mutated_ingot");
		builder(itemGenerated, "mutated_battleaxe");
		builder(itemGenerated, "moonweed");
		builder(itemGenerated, "darkroot");
		builder(itemGenerated, "warthog_snout");
		builder(itemGenerated, "elk_antler");
		builder(itemGenerated, "moon_antler");
		builder(itemGenerated, "lynx_paw");
		builder(itemGenerated, "owls_beak");
		builder(itemGenerated, "green_fox_eye");
		builder(itemGenerated, "golden_leather");
		builder(itemGenerated, "fox_tail");
		builder(itemGenerated, "golden_fox_tail");
		builder(itemGenerated, "elk_bones");
		builder(itemGenerated, "elkbone_club");
		//builder(itemGenerated, "acorn"); missing texture
		builder(itemGenerated, "lucky_acorn");
		builder(itemGenerated, "deer_leather");
		builder(itemGenerated, "ruined_elk_antler");
		builder(itemGenerated, "moon_leather");
		//builder(itemGenerated, "astral_door");
		//builder(itemGenerated, "mutated_fir_door");

	}

	private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
		return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
	}

	@Nonnull
	@Override
	public String getName() {
		return Main.MOD_ID + ": Item Models" ;
	}

}
