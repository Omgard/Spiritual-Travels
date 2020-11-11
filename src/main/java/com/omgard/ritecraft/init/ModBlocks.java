package com.omgard.ritecraft.init;

import java.util.function.Supplier;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.objects.blocks.BlueberryBushBlock;
import com.omgard.ritecraft.objects.blocks.ModSaplingBlock;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {

	// Blocks
	public static final RegistryObject<Block> SILVER_ORE = registerWithItem("silver_ore",
			() -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2)
					.sound(SoundType.STONE)));

	public static final RegistryObject<Block> SILVER_BLOCK = registerWithItem("silver_block", () -> new Block(
			Block.Properties.create(Material.IRON).hardnessAndResistance(3, 10).sound(SoundType.METAL)));

	public static final RegistryObject<Block> DARK_DIRT = registerWithItem("dark_dirt",
			() -> new Block(Block.Properties.from(Blocks.DIRT)));

	public static final RegistryObject<Block> DARK_GRASS_BLOCK = registerWithItem("dark_grass_block", () -> new Block(
			Block.Properties.create(Material.EARTH).hardnessAndResistance(3, 10).sound(SoundType.WET_GRASS)));

	public static final RegistryObject<BushBlock> BLUEBERRY_BUSH_BLOCK = registerWithItem("blueberry_bush_block",
			() -> new BlueberryBushBlock(Block.Properties.from(Blocks.SWEET_BERRY_BUSH)));

	//public static final RegistryObject<FlowerBlock> BLUESHROOM = registerWithItem("blueshroom",
		//	() -> new FlowerBlock(Effects.NIGHT_VISION, 5, Block.Properties.create(Material.PLANTS)
			//		.doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)));

	public static final RegistryObject<Block> PLAGUE_FIR_PLANKS = registerWithItem("plague_fir_planks",
			() -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));

	public static final RegistryObject<Block> PLAGUE_FIR_LOG = registerWithItem("plague_fir_log",
			() -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));

	public static final RegistryObject<Block> PLAGUE_FIR_LEAVES = registerWithItem("plague_fir_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));

	public static final RegistryObject<Block> PLAGUE_FIR_SAPLING = registerWithItem("plague_fir_sapling",
			() -> new ModSaplingBlock(null, Block.Properties.from(Blocks.OAK_SAPLING)));

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