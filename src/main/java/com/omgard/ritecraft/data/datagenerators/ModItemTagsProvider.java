package com.omgard.ritecraft.data.datagenerators;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.init.ModItems;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ForgeItemTagsProvider;

public class ModItemTagsProvider extends ForgeItemTagsProvider {

	public ModItemTagsProvider(DataGenerator gen) {
		super(gen);
	}
	
	@Override
	public void registerTags() {
		
		// ITEMS
		// getBuilder(Tags.Items.).add(ModItems..get());
		getBuilder(Tags.Items.INGOTS).add(ModItems.MUTATED_INGOT.get());
	}
	
	@Override
	public String getName() {
		return Main.MOD_ID + ": Itemtags";
	}
	
	

}
