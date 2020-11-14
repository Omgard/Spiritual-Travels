package com.omgard.ritecraft.init;

import java.util.function.Supplier;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.objects.blocks.BlueberryBushBlock;
import com.omgard.ritecraft.objects.blocks.ModBushBlock;
import com.omgard.ritecraft.objects.blocks.ModSaplingBlock;
import com.omgard.ritecraft.objects.blocks.TeapotBlock;
import com.omgard.ritecraft.world.feature.MutatedFirTree;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {

	// Blocks	
	public static final RegistryObject<Block> MUTATED_INGOT_BLOCK = registerWithItem("mutated_ingot_block", () -> new Block(
			Block.Properties.create(Material.IRON).hardnessAndResistance(3, 10).sound(SoundType.METAL)));

	public static final RegistryObject<Block> DARK_DIRT = registerWithItem("dark_dirt",
			() -> new Block(Block.Properties.from(Blocks.DIRT)));
	
	public static final RegistryObject<Block> ASTRAL_DIRT = registerWithItem("astral_dirt",
			() -> new Block(Block.Properties.from(Blocks.DIRT)));

	public static final RegistryObject<Block> DARK_GRASS_BLOCK = registerWithItem("dark_grass_block", () -> new Block //DarkGrassBlock is fucked
			(Block.Properties.from(Blocks.GRASS_BLOCK)));
	
	public static final RegistryObject<Block> ASTRAL_GRASS_BLOCK = registerWithItem("astral_grass_block", () -> new Block //DarkGrassBlock is fucked
			(Block.Properties.from(Blocks.GRASS_BLOCK)));

	public static final RegistryObject<BushBlock> BLUEBERRY_BUSH_BLOCK = registerWithItem("blueberry_bush_block",
			() -> new BlueberryBushBlock(Block.Properties.from(Blocks.SWEET_BERRY_BUSH)));
	
	public static final RegistryObject<Block> TEAPOT = registerWithItem("teapot", ()-> new TeapotBlock(Block.Properties.create(Material.CLAY)));

	public static final RegistryObject<Block> BLUESHROOM = registerWithItem("blueshroom",
			() -> new ModBushBlock(Block.Properties.from(Blocks.BROWN_MUSHROOM)));
	
	public static final RegistryObject<Block> SEESHROOM = registerWithItem("seeshroom",
			() -> new ModBushBlock(Block.Properties.from(Blocks.BROWN_MUSHROOM)));
	
	public static final RegistryObject<Block> STONESHROOM = registerWithItem("stoneshroom",
			() -> new ModBushBlock(Block.Properties.from(Blocks.BROWN_MUSHROOM)));	
	
	public static final RegistryObject<Block> ELKSBLOOM = registerWithItem("elksbloom",
			() -> new ModBushBlock(Block.Properties.from(Blocks.POPPY)));
	
	public static final RegistryObject<Block> MUTATED_ELKSBLOOM = registerWithItem("mutated_elksbloom",
			() -> new ModBushBlock(Block.Properties.from(Blocks.POPPY)));
	
	public static final RegistryObject<Block> MOONWEED = registerWithItem("moonweed",
			() -> new ModBushBlock(Block.Properties.from(Blocks.POPPY)));
	
	public static final RegistryObject<Block> COMMON_BLUELEAF = registerWithItem("common_blueleaf",
			() -> new ModBushBlock(Block.Properties.from(Blocks.POPPY)));

	public static final RegistryObject<Block> MUTATED_FIR_PLANKS = registerWithItem("mutated_fir_planks",
			() -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));

	public static final RegistryObject<Block> MUTATED_FIR_LOG = registerWithItem("mutated_fir_log",
			() -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));
	
	public static final RegistryObject<Block> ASTRAL_LOG = registerWithItem("astral_log",
			() -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));

	public static final RegistryObject<Block> MUTATED_FIR_LEAVES = registerWithItem("mutated_fir_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));

	public static final RegistryObject<Block> MUTATED_FIR_SAPLING = registerWithItem("mutated_fir_sapling",
			() -> new ModSaplingBlock(() ->  new MutatedFirTree(), Block.Properties.from(Blocks.OAK_SAPLING)));

	static void register() {
	}

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