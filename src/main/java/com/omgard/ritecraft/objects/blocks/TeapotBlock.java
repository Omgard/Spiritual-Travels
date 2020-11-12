package com.omgard.ritecraft.objects.blocks;

import com.omgard.ritecraft.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.datafix.fixes.ChunkPaletteFormat.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class TeapotBlock extends Block {

	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	public static final IntegerProperty LEVEL = BlockStateProperties.LEVEL_0_3;

	public TeapotBlock(Properties properties) {
		super(properties);
		//this.setDefaultState(this.stateContainer.getBaseState().
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
	}

	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		ItemStack itemstack = player.getHeldItem(handIn);
		if (itemstack.isEmpty()) {
			return ActionResultType.PASS;
		} else {
			int i = state.get(LEVEL);
			Item item = itemstack.getItem();
			if (item == Items.WATER_BUCKET && i == 0) {
				if (!worldIn.isRemote) {
					if (!player.abilities.isCreativeMode) {
						player.setHeldItem(handIn, new ItemStack(Items.BUCKET));
					}
					worldIn.setBlockState(pos, state.with(LEVEL, Integer.valueOf(1)));
					worldIn.playSound((PlayerEntity) null, pos, SoundEvents.ITEM_BUCKET_EMPTY, SoundCategory.BLOCKS,
							1.0F, 1.0F);
				}
				return ActionResultType.SUCCESS;

			} else if (item == ModItems.TEA_LEAVES.get() && i == 1) {
				if (!worldIn.isRemote) {
					if (!player.abilities.isCreativeMode) {
						player.setHeldItem(handIn, ItemStack.EMPTY);
					}
					worldIn.setBlockState(pos, state.with(LEVEL, Integer.valueOf(2)));
					// play sound
				}
				return ActionResultType.SUCCESS;

			} else if ((item == ModItems.BLUEBERRY.get() || item == ModItems.DARKROOT.get()) && i == 2) {

				if (!worldIn.isRemote) {
					if (!player.abilities.isCreativeMode) {
						player.setHeldItem(handIn, ItemStack.EMPTY);
					}
					worldIn.setBlockState(pos, state.with(LEVEL, Integer.valueOf(3)));
					// play sound
				}
				return ActionResultType.SUCCESS;

			} else return ActionResultType.PASS;
		}
	}
}
