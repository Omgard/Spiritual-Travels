package com.omgard.ritecraft.data;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.data.client.ModBlockStateProvider;
import com.omgard.ritecraft.data.client.ModItemModelProvider;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
    	
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));

       // ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);
        //gen.addProvider(blockTags);
        //gen.addProvider(new ModItemTagsProvider(gen, blockTags, existingFileHelper));
    }
}
