package com.omgard.ritecraft.objects.blocks;

import java.util.stream.Stream;

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
import net.minecraft.state.StateContainer;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class TeapotBlock extends Block {

	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	public static final IntegerProperty LEVEL = BlockStateProperties.LEVEL_0_3;

	private static final VoxelShape SHAPE_N = Stream
			.of(Block.makeCuboidShape(6.5, 0, 5.5, 10, 1, 10.5),
					Block.makeCuboidShape(5.5, 0, 6.5, 6.5, 1, 9.5),
					Block.makeCuboidShape(9.5, 0, 6.5, 10.5, 1, 9.5),
					Block.makeCuboidShape(10.5, 1, 6.5, 11.5, 5, 9.5),
					Block.makeCuboidShape(4.5, 1, 6.5, 5.5, 5, 9.5),
					Block.makeCuboidShape(6.5, 1, 10.5, 9.5, 5, 11.5), Block.makeCuboidShape(6.5, 1, 4.5, 9.5, 5, 5.5),
					Block.makeCuboidShape(5.5, 1, 9.5, 6.5, 5, 10.5),
					Block.makeCuboidShape(9.5, 1, 9.5, 10.5, 5, 10.5),
					Block.makeCuboidShape(9.5, 1, 5.5, 10.5, 5, 6.5),
					Block.makeCuboidShape(5.5, 1, 5.5, 6.5, 5, 6.5),
					Block.makeCuboidShape(7.5, 2, 3.5, 8.5, 4, 4.5), Block.makeCuboidShape(7.5, 3, 2.5, 8.5, 5, 3.5),
					Block.makeCuboidShape(7.5, 4, 1.5, 8.5, 5, 2.5), Block.makeCuboidShape(7.5, 2, 11.5, 8.5, 3, 12.5),
					Block.makeCuboidShape(7.5, 3, 12.5, 8.5, 5, 13.5),
					Block.makeCuboidShape(7.5, 5, 10.5, 8.5, 6, 12.5))
			.reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	private static final VoxelShape SHAPE_W = Stream.of(
			Block.makeCuboidShape(5.75, 0, 6.25, 10.75, 1, 9.25), //5.647058823529411, 0, 6.352941176470589, 10.647058823529411, 1, 9.352941176470589
			Block.makeCuboidShape(6.75, 0, 9.25, 9.75, 1, 10.25), //647058823529411, 0, 9.352941176470589, 9.647058823529411, 1, 10.352941176470589
			Block.makeCuboidShape(6.75, 0, 5.25, 9.75, 1, 6.25), //6.647058823529411, 0, 5.352941176470589, 9.647058823529411, 1, 6.352941176470589
			Block.makeCuboidShape(6.75, 1, 4.25, 9.75, 5, 5.25), //6.647058823529411, 1, 4.352941176470589, 9.647058823529411, 5, 5.352941176470589
			Block.makeCuboidShape(6.75, 1, 10.25, 9.75, 5, 11.25), //6.647058823529411, 1, 10.352941176470589, 9.647058823529411, 5, 11.352941176470589
			Block.makeCuboidShape(10.75, 1, 6.25, 11.75, 5, 9.25), //10.647058823529411, 1, 6.352941176470587, 11.647058823529411, 5, 9.352941176470587
			Block.makeCuboidShape(4.75, 1, 6.25, 5.75, 5, 9.25),  //4.647058823529411, 1, 6.352941176470587, 5.647058823529411, 5, 9.352941176470587
			Block.makeCuboidShape(9.75, 1, 9.25, 10.75, 5, 10.25), //9.647058823529411, 1, 9.352941176470589, 10.647058823529411, 5, 10.352941176470589
			Block.makeCuboidShape(9.75, 1, 5.25, 10.75, 5, 6.25), //9.647058823529411, 1, 5.352941176470589, 10.647058823529411, 5, 6.352941176470589
			Block.makeCuboidShape(5.75, 1, 5.25, 6.75, 5, 6.25), //5.647058823529411, 1, 5.352941176470589, 6.647058823529411, 5, 6.352941176470589
			Block.makeCuboidShape(5.75, 1, 9.25, 6.75, 5, 10.25), //5.647058823529411, 1, 9.352941176470589, 6.647058823529411, 5, 10.352941176470589
			Block.makeCuboidShape(3.75, 2, 7.25, 4.75, 4, 8.25), //3.6470588235294112, 2, 7.352941176470587, 4.647058823529411, 4, 8.352941176470587
			Block.makeCuboidShape(2.75, 3, 7.25, 3.75, 5, 8.25), //2.6470588235294112, 3, 7.352941176470587, 3.6470588235294112, 5, 8.352941176470587
			Block.makeCuboidShape(1.75, 4, 7.25, 2.75, 5, 8.25), //1.6470588235294112, 4, 7.352941176470587, 2.6470588235294112, 5, 8.352941176470587
			Block.makeCuboidShape(11.75, 2, 7.25, 12.75, 3, 8.25), //11.647058823529411, 2, 7.352941176470587, 12.647058823529411, 3, 8.352941176470587
			Block.makeCuboidShape(12.75, 3, 7.25, 13.75, 5, 8.25), //12.647058823529411, 3, 7.352941176470587, 13.647058823529411, 5, 8.352941176470587
			Block.makeCuboidShape(10.75, 5, 7.25, 12.75, 6, 8.25)) //10.647058823529411, 5, 7.352941176470587, 12.647058823529411, 6, 8.352941176470587
			.reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	private static final VoxelShape SHAPE_S = Stream.of(
			Block.makeCuboidShape(6.5, 0, 5.205882352941176, 9.5, 1, 10.205882352941176),
			Block.makeCuboidShape(9.5, 0, 6.205882352941176, 10.5, 1, 9.205882352941176),
			Block.makeCuboidShape(5.5, 0, 6.205882352941176, 6.5, 1, 9.205882352941176),
			Block.makeCuboidShape(4.5, 1, 6.205882352941176, 5.5, 5, 9.205882352941176),
			Block.makeCuboidShape(10.5, 1, 6.205882352941176, 11.5, 5, 9.205882352941176),
			Block.makeCuboidShape(6.5, 1, 4.205882352941176, 9.5, 5, 5.205882352941176),
			Block.makeCuboidShape(6.5, 1, 10.205882352941176, 9.5, 5, 11.205882352941176),
			Block.makeCuboidShape(9.5, 1, 5.205882352941176, 10.5, 5, 6.205882352941176),
			Block.makeCuboidShape(5.5, 1, 5.205882352941176, 6.5, 5, 6.205882352941176),
			Block.makeCuboidShape(5.5, 1, 9.205882352941176, 6.5, 5, 10.205882352941176),
			Block.makeCuboidShape(9.5, 1, 9.205882352941176, 10.5, 5, 10.205882352941176),
			Block.makeCuboidShape(7.5, 2, 11.205882352941176, 8.5, 4, 12.205882352941176),
			Block.makeCuboidShape(7.5, 3, 12.205882352941176, 8.5, 5, 13.205882352941176),
			Block.makeCuboidShape(7.5, 4, 13.205882352941176, 8.5, 5, 14.205882352941176),
			Block.makeCuboidShape(7.5, 2, 3.2058823529411757, 8.5, 3, 4.205882352941176),
			Block.makeCuboidShape(7.5, 3, 2.2058823529411757, 8.5, 5, 3.2058823529411757),
			Block.makeCuboidShape(7.5, 5, 3.2058823529411757, 8.5, 6, 5.205882352941176))
			.reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	private static final VoxelShape SHAPE_E = Stream.of(
			Block.makeCuboidShape(5.352941176470587, 0, 6.352941176470587, 10.352941176470587, 1, 9.352941176470587),
			Block.makeCuboidShape(6.352941176470587, 0, 5.352941176470587, 9.352941176470587, 1, 6.352941176470587),
			Block.makeCuboidShape(6.352941176470587, 0, 9.352941176470587, 9.352941176470587, 1, 10.352941176470587),
			Block.makeCuboidShape(6.352941176470587, 1, 10.352941176470587, 9.352941176470587, 5, 11.352941176470587),
			Block.makeCuboidShape(6.352941176470587, 1, 4.352941176470587, 9.352941176470587, 5, 5.352941176470587),
			Block.makeCuboidShape(4.352941176470587, 1, 6.352941176470589, 5.352941176470587, 5, 9.352941176470589),
			Block.makeCuboidShape(10.352941176470587, 1, 6.352941176470589, 11.352941176470587, 5, 9.352941176470589),
			Block.makeCuboidShape(5.352941176470587, 1, 5.352941176470587, 6.352941176470587, 5, 6.352941176470587),
			Block.makeCuboidShape(5.352941176470587, 1, 9.352941176470587, 6.352941176470587, 5, 10.352941176470587),
			Block.makeCuboidShape(9.352941176470587, 1, 9.352941176470587, 10.352941176470587, 5, 10.352941176470587),
			Block.makeCuboidShape(9.352941176470587, 1, 5.352941176470587, 10.352941176470587, 5, 6.352941176470587),
			Block.makeCuboidShape(11.352941176470587, 2, 7.352941176470589, 12.352941176470587, 4, 8.352941176470589),
			Block.makeCuboidShape(12.352941176470587, 3, 7.352941176470589, 13.352941176470587, 5, 8.352941176470589),
			Block.makeCuboidShape(13.352941176470587, 4, 7.352941176470589, 14.352941176470587, 5, 8.352941176470589),
			Block.makeCuboidShape(3.352941176470587, 2, 7.352941176470589, 4.352941176470587, 3, 8.352941176470589),
			Block.makeCuboidShape(2.352941176470587, 3, 7.352941176470589, 3.352941176470587, 5, 8.352941176470589),
			Block.makeCuboidShape(3.352941176470587, 5, 7.352941176470589, 5.352941176470587, 6, 8.352941176470589))
			.reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		switch (state.get(FACING)) {
		case NORTH:
			return SHAPE_N;
		case SOUTH:
			return SHAPE_S;
		case EAST:
			return SHAPE_E;
		case WEST:
			return SHAPE_W;
		default:
			return SHAPE_N;
		}
	}

	public TeapotBlock(Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
		this.setDefaultState(this.stateContainer.getBaseState().with(LEVEL, Integer.valueOf(0)));
	}
	
	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(FACING);
		builder.add(LEVEL);
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
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
					this.setWaterLevel(worldIn, pos, state, i + 1);
					worldIn.playSound((PlayerEntity) null, pos, SoundEvents.ITEM_BUCKET_EMPTY, SoundCategory.BLOCKS,
							1.0F, 1.0F);
				}
				return ActionResultType.SUCCESS;

			} else if (item == ModItems.TEA_LEAVES.get() && i == 1) {
				if (!worldIn.isRemote) {
					if (!player.abilities.isCreativeMode) {
						player.setHeldItem(handIn, ItemStack.EMPTY);
					}
					this.setWaterLevel(worldIn, pos, state, i + 1);
					// play sound
				}
				return ActionResultType.SUCCESS;

			} else if ((item == ModItems.BLUEBERRY.get() || item == ModItems.DARKROOT.get()) && i == 2) {

				if (!worldIn.isRemote) {
					if (!player.abilities.isCreativeMode) {
						player.setHeldItem(handIn, ItemStack.EMPTY);
					}
					this.setWaterLevel(worldIn, pos, state, i + 1);
					// play sound
				}
				return ActionResultType.SUCCESS;

			} else
				return ActionResultType.PASS;
		}
	}

	public void setWaterLevel(World worldIn, BlockPos pos, BlockState state, int level) {
		worldIn.setBlockState(pos, state.with(LEVEL, Integer.valueOf(MathHelper.clamp(level, 0, 3))), 2);
	}
}
