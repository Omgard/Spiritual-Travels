package com.omgard.ritecraft.data;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.data.datagenerators.LangProvider;
import com.omgard.ritecraft.data.datagenerators.ModBlockStateProvider;
import com.omgard.ritecraft.data.datagenerators.ModBlockTagsProvider;
import com.omgard.ritecraft.data.datagenerators.ModItemModelProvider;
import com.omgard.ritecraft.data.datagenerators.ModItemTagsProvider;
import com.omgard.ritecraft.data.datagenerators.ModLootTables;
import com.omgard.ritecraft.data.datagenerators.ModRecipes;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}
    
    //BlockModelProvider

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
    	
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        
        if(event.includeClient()) {
        	gen.addProvider(new LangProvider(gen));
        	gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
            gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
        }
        if(event.includeServer()) {
            gen.addProvider(new ModRecipes(gen));
            gen.addProvider(new ModLootTables(gen)); 
            gen.addProvider(new ModItemTagsProvider(gen));
            gen.addProvider(new ModBlockTagsProvider(gen));
        }

       // ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);
        //gen.addProvider(blockTags);
        //gen.addProvider(new ModItemTagsProvider(gen, blockTags, existingFileHelper));
    }
}
