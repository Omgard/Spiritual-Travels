package com.omgard.ritecraft.world.feature;

import java.util.Random;

import com.omgard.ritecraft.init.ModBlocks;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

public class MutatedFirTree extends Tree {

	public static final TreeFeatureConfig MUTATED_FIR_TREE_CONFIG = (new TreeFeatureConfig.Builder(
			new SimpleBlockStateProvider(ModBlocks.MUTATED_FIR_LOG.get().getDefaultState()),
			new SimpleBlockStateProvider(ModBlocks.MUTATED_FIR_LEAVES.get().getDefaultState()),
			new BlobFoliagePlacer(3, 0))).baseHeight(8).heightRandA(5).foliageHeight(5)
					.setSapling((IPlantable) ModBlocks.MUTATED_FIR_SAPLING.get())
					
					.build();
	
	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
		return Feature.NORMAL_TREE.withConfiguration(MUTATED_FIR_TREE_CONFIG);
	}

}
