package com.omgard.ritecraft.data.client;

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
		
		withExistingParent("silver_block", modLoc("block/silver_block"));
		withExistingParent("silver_ore", modLoc("block/silver_ore"));
		
		ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
		
		
		builder(itemGenerated, "silver_ingot");
		
		
		
		
	}
	
	private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
		return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);						
	}
	
	
	@Nonnull
	@Override
	public String getName() {
		return "Item Models: " + modid;
	}

}
