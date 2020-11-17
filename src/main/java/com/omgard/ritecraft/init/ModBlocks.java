package com.omgard.ritecraft.init;

import java.util.function.Supplier;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.objects.blocks.BlueberryBushBlock;
import com.omgard.ritecraft.objects.blocks.ModBushBlock;
import com.omgard.ritecraft.objects.blocks.ModDoor;
import com.omgard.ritecraft.objects.blocks.ModPressurePlateBlock;
import com.omgard.ritecraft.objects.blocks.ModSaplingBlock;
import com.omgard.ritecraft.objects.blocks.ModTrapDoor;
import com.omgard.ritecraft.objects.blocks.ModWoodButtonBlock;
import com.omgard.ritecraft.objects.blocks.TeapotBlock;
import com.omgard.ritecraft.world.feature.MutatedFirTree;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapDoorBlock;
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

	public static final RegistryObject<Block> DARK_GRASS_BLOCK = registerWithItem("dark_grass_block", () -> new Block(Block.Properties.from(Blocks.GRASS_BLOCK)));	
	public static final RegistryObject<BushBlock> BLUEBERRY_BUSH_BLOCK = registerNoItem("blueberry_bush_block", () -> new BlueberryBushBlock(Block.Properties.from(Blocks.SWEET_BERRY_BUSH)));	
	public static final RegistryObject<Block> TEAPOT = registerWithItem("teapot", ()-> new TeapotBlock(Block.Properties.from(Blocks.FLOWER_POT)));
	
	public static final RegistryObject<Block> BLUESHROOM = registerWithItem("blueshroom", () -> new ModBushBlock(Block.Properties.from(Blocks.BROWN_MUSHROOM)));	
	public static final RegistryObject<Block> SEESHROOM = registerWithItem("seeshroom", () -> new ModBushBlock(Block.Properties.from(Blocks.BROWN_MUSHROOM)));	
	public static final RegistryObject<Block> STONESHROOM = registerWithItem("stoneshroom", () -> new ModBushBlock(Block.Properties.from(Blocks.BROWN_MUSHROOM)));		
	public static final RegistryObject<Block> ELKSBLOOM = registerWithItem("elksbloom", () -> new ModBushBlock(Block.Properties.from(Blocks.POPPY)));	
	public static final RegistryObject<Block> MUTATED_ELKSBLOOM = registerWithItem("mutated_elksbloom", () -> new ModBushBlock(Block.Properties.from(Blocks.POPPY)));	
	public static final RegistryObject<Block> MOONWEED = registerWithItem("moonweed", () -> new ModBushBlock(Block.Properties.from(Blocks.POPPY)));	
	public static final RegistryObject<Block> COMMON_BLUELEAF = registerWithItem("common_blueleaf", () -> new ModBushBlock(Block.Properties.from(Blocks.POPPY)));
	
	public static final RegistryObject<Block> MUTATED_FIR_PLANKS = registerWithItem("mutated_fir_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> MUTATED_FIR_LOG = registerWithItem("mutated_fir_log", () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));	
	public static final RegistryObject<Block> MUTATED_FIR_STAIRS = registerWithItem("mutated_fir_stairs", () -> new StairsBlock(() -> MUTATED_FIR_PLANKS.get().getDefaultState(), Block.Properties.from(Blocks.OAK_PLANKS)));
	public static final RegistryObject<FenceBlock> MUTATED_FIR_FENCE = registerWithItem("mutated_fir_fence", () -> new FenceBlock(Block.Properties.from(Blocks.OAK_FENCE)));	
	public static final RegistryObject<Block> MUTATED_FIR_BUTTON = registerWithItem("mutated_fir_button", () -> new ModWoodButtonBlock(Block.Properties.from(Blocks.OAK_BUTTON)));	
	public static final RegistryObject<Block> MUTATED_FIR_PRESSURE_PLATE = registerWithItem("mutated_fir_pressure_plate", () -> new ModPressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.from(Blocks.OAK_PRESSURE_PLATE)));		
	public static final RegistryObject<Block> MUTATED_FIR_LEAVES = registerWithItem("mutated_fir_leaves", () -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));
	public static final RegistryObject<Block> MUTATED_FIR_SAPLING = registerWithItem("mutated_fir_sapling", () -> new ModSaplingBlock(() ->  new MutatedFirTree(), Block.Properties.from(Blocks.OAK_SAPLING)));	
	public static final RegistryObject<SlabBlock> MUTATED_FIR_SLAB = registerWithItem("mutated_fir_slab", () -> new SlabBlock(Block.Properties.from(MUTATED_FIR_PLANKS.get())));
	public static final RegistryObject<FenceGateBlock> MUTATED_FIR_FENCE_GATE = registerWithItem("mutated_fir_fence_gate", () -> new FenceGateBlock(Block.Properties.from(MUTATED_FIR_PLANKS.get())));
	public static final RegistryObject<DoorBlock> MUTATED_FIR_DOOR = registerWithItem("mutated_fir_door", () -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<TrapDoorBlock> MUTATED_FIR_TRAPDOOR = registerWithItem("mutated_fir_trapdoor", () -> new ModTrapDoor(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

	public static final RegistryObject<Block> ASTRAL_PLANKS = registerWithItem("astral_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));	
	public static final RegistryObject<Block> ASTRAL_GRASS_BLOCK = registerWithItem("astral_grass_block", () -> new Block(Block.Properties.from(Blocks.GRASS_BLOCK)));
	public static final RegistryObject<Block> ASTRAL_LOG = registerWithItem("astral_log", () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));	
	public static final RegistryObject<Block> ASTRAL_LEAVES = registerWithItem("astral_leaves", () -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));
	public static final RegistryObject<FenceBlock> ASTRAL_FENCE = registerWithItem("astral_fence", () -> new FenceBlock(Block.Properties.from(Blocks.OAK_FENCE)));	
	public static final RegistryObject<Block> ASTRAL_BUTTON = registerWithItem("astral_button", () -> new ModWoodButtonBlock(Block.Properties.from(Blocks.OAK_BUTTON)));	
	public static final RegistryObject<Block> ASTRAL_PRESSURE_PLATE = registerWithItem("astral_pressure_plate", () -> new ModPressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.from(Blocks.OAK_PRESSURE_PLATE)));		
	public static final RegistryObject<Block> ASTRAL_SAPLING = registerWithItem("astral_sapling", () -> new ModSaplingBlock(() ->  new MutatedFirTree(), Block.Properties.from(Blocks.OAK_SAPLING)));	
	public static final RegistryObject<Block> ASTRAL_STAIRS = registerWithItem("astral_stairs", () -> new StairsBlock(() -> ASTRAL_PLANKS.get().getDefaultState(), Block.Properties.from(Blocks.OAK_PLANKS)));
	public static final RegistryObject<SlabBlock> ASTRAL_SLAB = registerWithItem("astral_slab", () -> new SlabBlock(Block.Properties.from(ASTRAL_PLANKS.get())));
	public static final RegistryObject<FenceGateBlock> ASTRAL_FENCE_GATE = registerWithItem("astral_fence_gate", () -> new FenceGateBlock(Block.Properties.from(ASTRAL_PLANKS.get())));
	public static final RegistryObject<DoorBlock> ASTRAL_DOOR = registerWithItem("astral_door", () -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<TrapDoorBlock> ASTRAL_TRAPDOOR = registerWithItem("astral_trapdoor", () -> new ModTrapDoor(Block.Properties.from(Blocks.OAK_TRAPDOOR)));
	
	

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