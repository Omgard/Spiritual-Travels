package com.omgard.ritecraft.data.datagenerators;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.init.ModBlocks;
import com.omgard.ritecraft.init.ModEntityTypes;
import com.omgard.ritecraft.init.ModItems;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LangProvider extends LanguageProvider
{
    public LangProvider(DataGenerator gen) {
        super(gen, Main.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
    	add("itemGroup." + Main.TAB.getTabLabel(), "Ritecraft");
    	
    	
    	// BLOCKS
    	// add(ModBlocks..get(), "");
    	add(ModBlocks.ASTRAL_DIRT.get(), "Astral Dirt");
    	add(ModBlocks.ASTRAL_GRASS_BLOCK.get(), "Astral Grass block");
    	add(ModBlocks.ASTRAL_LOG.get(), "Astral Log");
    	add(ModBlocks.ASTRAL_STAIRS.get(), "Astral Stairs");
    	add(ModBlocks.ASTRAL_PLANKS.get(), "Astral Planks");
    	add(ModBlocks.ASTRAL_LEAVES.get(), "Astral Leaves");
    	add(ModBlocks.ASTRAL_PRESSURE_PLATE.get(), "Astral Pressure Plate");
    	add(ModBlocks.ASTRAL_SAPLING.get(), "Astral Sapling");
    	add(ModBlocks.ASTRAL_FENCE.get(), "Astral Fence");
    	add(ModBlocks.ASTRAL_BUTTON.get(), "Astral Button");
    	add(ModBlocks.ASTRAL_SLAB.get(), "Astral Slab");
    	add(ModBlocks.ASTRAL_DOOR.get(), "Astral Door");
    	add(ModBlocks.ASTRAL_FENCE_GATE.get(), "Astral Fence Gate");
    	add(ModBlocks.ASTRAL_TRAPDOOR.get(), "Astral Trapdoor");
    	
    	add(ModBlocks.BLUEBERRY_BUSH_BLOCK.get(), "Blueberry Bush");
    	add(ModBlocks.BLUESHROOM.get(), "Blueshroom");
    	add(ModBlocks.COMMON_BLUELEAF.get(), "Common Blueleaf");
    	add(ModBlocks.ELKSBLOOM.get(), "Elksbloom");
    	add(ModBlocks.MOONWEED.get(), "Moonweed");
    	add(ModBlocks.MUTATED_ELKSBLOOM.get(), "Mutated Elksbloom");
    	add(ModBlocks.SEESHROOM.get(), "Seeshroom");
    	add(ModBlocks.STONESHROOM.get(), "Stoneshroom");
    	
    	add(ModBlocks.TEAPOT.get(), "Teapot");
    	add(ModBlocks.DARK_DIRT.get(), "Dark Dirt");
    	add(ModBlocks.DARK_GRASS_BLOCK.get(), "Dark Grass Block");
    	
    	add(ModBlocks.MUTATED_FIR_BUTTON.get(), "Mutated Fir Button");
    	add(ModBlocks.MUTATED_FIR_FENCE.get(), "Mutated Fir Fence");
    	add(ModBlocks.MUTATED_FIR_LEAVES.get(), "Mutated Fir Leaves");
    	add(ModBlocks.MUTATED_FIR_LOG.get(), "Mutated Fir Log");
    	add(ModBlocks.MUTATED_FIR_PLANKS.get(), "Mutated Fir Planks");
    	add(ModBlocks.MUTATED_FIR_PRESSURE_PLATE.get(), "Mutated Fir Pressure Plate");
    	add(ModBlocks.MUTATED_FIR_SAPLING.get(), "Mutated Fir Sapling");
    	add(ModBlocks.MUTATED_FIR_STAIRS.get(), "Mutated Fir Stairs");
    	add(ModBlocks.MUTATED_INGOT_BLOCK.get(), "Mutated Ingot Block");
    	add(ModBlocks.MUTATED_FIR_SLAB.get(), "Mutated Fir Slab");
    	add(ModBlocks.MUTATED_FIR_FENCE_GATE.get(), "Mutated Fir Fence Gate");
    	add(ModBlocks.MUTATED_FIR_TRAPDOOR.get(), "Mutated Fir Trapdoor");
    	add(ModBlocks.MUTATED_FIR_DOOR.get(), "Mutated Fir Door");
    	
    	
    	
    	
    	// ITEMS
    	// add(ModItems..get(), "");
    	add(ModItems.ACORN.get(), "Acorn");
    	add(ModItems.BLUEBERRY.get(), "Blueberry");
    	add(ModItems.BLUEBERRY_TEA.get(), "Blueberry Tea");
    	add(ModItems.CHAOS_TEA.get(), "Chaos Tea");
    	add(ModItems.DARKROOT.get(), "Darkroot");
    	add(ModItems.DEER_LEATHER.get(), "Deer Leather");
    	add(ModItems.ELK_ANTLER.get(), "Elk Antler");
    	add(ModItems.ELK_BONES.get(), "Elk Bones");
    	add(ModItems.ELKBONE_CLUB.get(), "Elkbone Club");
    	add(ModItems.EMPTY_CUP.get(), "Teacup");
    	add(ModItems.FOX_TAIL.get(), "Fox Tail");
    	add(ModItems.GOLDEN_FOX_TAIL.get(), "Golden Fox Tail");
    	add(ModItems.GOLDEN_LEATHER.get(), "Golden Leather");
    	add(ModItems.GREEN_FOX_EYE.get(), "Green Fox Eye");
    	add(ModItems.LUCKY_ACORN.get(), "Lucky Acorn");
    	add(ModItems.LYNX_PAW.get(), "Lynx Paw");
    	add(ModItems.MOON_ANTLER.get(), "Moon Antler");
    	add(ModItems.MOON_LEATHER.get(), "Leather");
    	add(ModItems.MUTATED_BATTLEAXE.get(), "Mutated Battleaxe");
    	add(ModItems.MUTATED_INGOT.get(), "Mutated Ingot");
    	add(ModItems.OWL_FEATHER.get(), "Owl Feather");
    	add(ModItems.OWLS_BEAK.get(), "Owls Beak");
    	add(ModItems.RUINED_ELK_ANTLER.get(), "Ruined Elk Antler");
    	add(ModItems.SUNLEAF.get(), "Sunleaf");
    	add(ModItems.TEA_LEAVES.get(), "Tea Leaves");
    	add(ModItems.VISION_TEA.get(), "Vision Tea");
    	add(ModItems.WARTHOG_BOOTS.get(), "Warthog Boots");
    	add(ModItems.WARTHOG_CHESTPLATE.get(), "Warthog Chestplate");
    	add(ModItems.WARTHOG_HELMET.get(), "Warthog Helmet");
    	add(ModItems.WARTHOG_LEGGINGS.get(), "Warthog Leggings");
    	add(ModItems.WARTHOG_SNOUT.get(), "Warthog Snout");
    	add(ModItems.WARTHOG_TUSK.get(), "Warthog Tusk");
    	
    	// ENTITIES
    	// add(ModEntityTypes..get(), "");
    	add(ModEntityTypes.WARTHOG.get(), "Warthog");
    	
    }
    @Override
    public String getName() {
    	return Main.MOD_ID + ": Languages" ;
    }
}