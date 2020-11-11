package com.omgard.ritecraft.init;

import java.util.function.Supplier;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.objects.blocks.BlueberryBushBlock;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;


public class ModBlocks {
	
		// Blocks
	    public static final RegistryObject<Block> SILVER_ORE = registerWithItem("silver_ore", () ->
	            new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
	    public static final RegistryObject<Block> SILVER_BLOCK = registerWithItem("silver_block", () ->
	            new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3, 10).sound(SoundType.METAL)));
	    public static final RegistryObject<Block> DARK_GRASS_BLOCK = registerWithItem("dark_grass_block", () ->
	    		new Block(Block.Properties.create(Material.EARTH).hardnessAndResistance(3, 10).sound(SoundType.WET_GRASS)));
	    public static final RegistryObject<BushBlock> BLUEBERRY_BUSH_BLOCK = registerWithItem("blueberry_bush_block", () -> new BlueberryBushBlock(Block.Properties.from(Blocks.SWEET_BERRY_BUSH)));
	    
	    
	    static void register() {}


	    // Registration methods
	    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
	        return Registration.BLOCKS.register(name, block);
	    }

	    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
	        RegistryObject<T> ret = registerNoItem(name, block);
	        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(Main.TAB)));
	        return ret;
	    }
	    

	}