package com.omgard.ritecraft.data.datagenerators;

import java.util.function.Consumer;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.init.ModBlocks;
import com.omgard.ritecraft.init.ModItems;

import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;

public class ModRecipes extends RecipeProvider {

    public ModRecipes(DataGenerator gen) {
		super(gen);
	}
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
    	String tab = "ritecraft";
    	
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.MUTATED_INGOT_BLOCK.get(), 1)
                .patternLine("xxx")
                .patternLine("xxx")
                .patternLine("xxx")
                .key('x', ModItems.MUTATED_INGOT.get())
                .setGroup(tab)
                .addCriterion("mutated_ingot_block", InventoryChangeTrigger.Instance.forItems(ModBlocks.MUTATED_INGOT_BLOCK.get()))
                .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModItems.MUTATED_BATTLEAXE.get(), 1)
        		.patternLine("xxx")
        		.patternLine("xsx")
        		.patternLine(" s ")
        		.key('x', ModItems.MUTATED_INGOT.get())
        		.key('s', Items.STICK)
        		.setGroup(tab)
        		.addCriterion("mutated_ingot", InventoryChangeTrigger.Instance.forItems(ModItems.MUTATED_INGOT.get()))
        		.build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModItems.MUTATED_INGOT.get(), 9)
        		.addIngredient(ModBlocks.MUTATED_INGOT_BLOCK.get())
                .addCriterion("mutated_ingot", InventoryChangeTrigger.Instance.forItems(ModItems.MUTATED_INGOT.get()))
        		.build(consumer, Main.MOD_ID + ":mutated_ingot_from_block");
        
        ShapelessRecipeBuilder.shapelessRecipe(ModItems.MUTATED_INGOT.get(), 1)
		.addIngredient(ModBlocks.MUTATED_ELKSBLOOM.get())
		.addIngredient(Items.IRON_INGOT)
        .addCriterion("mutated_elksbloom", InventoryChangeTrigger.Instance.forItems(ModBlocks.MUTATED_ELKSBLOOM.get()))
		.build(consumer);
    }
    
    @Override
    public String getName() {
    	return Main.MOD_ID + ": Recipes";
    }
}