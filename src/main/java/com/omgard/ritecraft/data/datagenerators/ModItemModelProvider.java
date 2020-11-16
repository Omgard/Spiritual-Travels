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
		withExistingParent("astral_dirt", modLoc("block/astral_dirt"));
		withExistingParent("dark_grass_block", modLoc("block/dark_grass_block"));
		withExistingParent("astral_grass_block", modLoc("block/astral_grass_block"));
		withExistingParent("mutated_fir_log", modLoc("block/mutated_fir_log"));
		withExistingParent("astral_log", modLoc("block/astral_log"));
		withExistingParent("mutated_fir_planks", modLoc("block/mutated_fir_planks"));
		withExistingParent("mutated_fir_leaves", modLoc("block/mutated_fir_leaves"));
		withExistingParent("blueshroom", modLoc ("block/blueshroom"));
		withExistingParent("seeshroom", modLoc ("block/seeshroom"));
		withExistingParent("stoneshroom", modLoc ("block/stoneshroom"));
		withExistingParent("elksbloom", modLoc ("block/elksbloom"));
		withExistingParent("mutated_elksbloom", modLoc ("block/mutated_elksbloom"));
		withExistingParent("mutated_fir_stairs", modLoc ("block/mutated_fir_stairs"));
		
		//pls add texture withExistingParent("mutated_ingot_block", modLoc("block/mutated_ingot_block"));

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
