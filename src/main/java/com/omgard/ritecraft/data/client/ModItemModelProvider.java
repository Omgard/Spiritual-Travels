package com.omgard.ritecraft.data.client;

import com.omgard.ritecraft.Main;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;

public class ModItemModelProvider extends ItemModelProvider {

	public ModItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
		super(generator, Main.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void registerModels() {
		withExistingParent()
		
	}

}
