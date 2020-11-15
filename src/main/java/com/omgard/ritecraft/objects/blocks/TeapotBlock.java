package com.omgard.ritecraft.objects.blocks;

import java.util.stream.Stream;

import com.omgard.ritecraft.init.ModBlocks;
import com.omgard.ritecraft.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
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
	
	private static final VoxelShape SHAPE_N = Stream.of(
			Block.makeCuboidShape(6.499999999999999, 0, 5.5, 9.5, 1, 10.5),
			Block.makeCuboidShape(5.499999999999999, 0, 6.5, 6.499999999999999, 1, 9.5),
			Block.makeCuboidShape(9.5, 0, 6.5, 10.5, 1, 9.5),
			Block.makeCuboidShape(10.5, 1, 6.5, 11.5, 5, 9.5),
			Block.makeCuboidShape(4.499999999999999, 1, 6.5, 5.499999999999999, 5, 9.5),
			Block.makeCuboidShape(6.499999999999999, 1, 10.5, 9.5, 5, 11.5),
			Block.makeCuboidShape(6.499999999999999, 1, 4.5, 9.5, 5, 5.5),
			Block.makeCuboidShape(5.499999999999999, 1, 9.5, 6.499999999999999, 5, 10.5),
			Block.makeCuboidShape(9.5, 1, 9.5, 10.5, 5, 10.5),
			Block.makeCuboidShape(9.5, 1, 5.5, 10.5, 5, 6.5),
			Block.makeCuboidShape(5.499999999999999, 1, 5.5, 6.499999999999999, 5, 6.5),
			Block.makeCuboidShape(7.499999999999999, 2, 3.5, 8.5, 4, 4.5),
			Block.makeCuboidShape(7.499999999999999, 3, 2.5, 8.5, 5, 3.5),
			Block.makeCuboidShape(7.499999999999999, 4, 1.5, 8.5, 5, 2.5),
			Block.makeCuboidShape(7.499999999999999, 2, 11.5, 8.5, 3, 12.5),
			Block.makeCuboidShape(7.499999999999999, 3, 12.5, 8.5, 5, 13.5),
			Block.makeCuboidShape(7.499999999999999, 5, 10.5, 8.5, 6, 12.5)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_W = Stream.of(
			Block.makeCuboidShape(5.499999999999999, 0, 6.5, 10.5, 1, 9.5),
			Block.makeCuboidShape(6.499999999999999, 0, 9.5, 9.5, 1, 10.5),
			Block.makeCuboidShape(6.499999999999999, 0, 5.5, 9.5, 1, 6.5),
			Block.makeCuboidShape(6.499999999999999, 1, 4.5, 9.5, 5, 5.5),
			Block.makeCuboidShape(6.499999999999999, 1, 10.5, 9.5, 5, 11.5),
			Block.makeCuboidShape(10.5, 1, 6.5, 11.5, 5, 9.5),
			Block.makeCuboidShape(4.499999999999999, 1, 6.5, 5.499999999999999, 5, 9.5),
			Block.makeCuboidShape(9.5, 1, 9.5, 10.5, 5, 10.5),
			Block.makeCuboidShape(9.5, 1, 5.5, 10.5, 5, 6.5),
			Block.makeCuboidShape(5.499999999999999, 1, 5.5, 6.499999999999999, 5, 6.5),
			Block.makeCuboidShape(5.499999999999999, 1, 9.5, 6.499999999999999, 5, 10.5),
			Block.makeCuboidShape(3.499999999999999, 2, 7.5, 4.499999999999999, 4, 8.5),
			Block.makeCuboidShape(2.499999999999999, 3, 7.5, 3.499999999999999, 5, 8.5),
			Block.makeCuboidShape(1.4999999999999991, 4, 7.5, 2.499999999999999, 5, 8.5),
			Block.makeCuboidShape(11.5, 2, 7.5, 12.5, 3, 8.5),
			Block.makeCuboidShape(12.5, 3, 7.5, 13.5, 5, 8.5),
			Block.makeCuboidShape(10.5, 5, 7.5, 12.5, 6, 8.5)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_S = Stream.of(
			Block.makeCuboidShape(6.499999999999999, 0, 5.5, 9.5, 1, 10.5),
			Block.makeCuboidShape(9.5, 0, 6.5, 10.5, 1, 9.5),
			Block.makeCuboidShape(5.499999999999999, 0, 6.5, 6.499999999999999, 1, 9.5),
			Block.makeCuboidShape(4.499999999999999, 1, 6.5, 5.499999999999999, 5, 9.5),
			Block.makeCuboidShape(10.5, 1, 6.5, 11.5, 5, 9.5),
			Block.makeCuboidShape(6.499999999999999, 1, 4.5, 9.5, 5, 5.5),
			Block.makeCuboidShape(6.499999999999999, 1, 10.5, 9.5, 5, 11.5),
			Block.makeCuboidShape(9.5, 1, 5.5, 10.5, 5, 6.5),
			Block.makeCuboidShape(5.499999999999999, 1, 5.5, 6.499999999999999, 5, 6.5),
			Block.makeCuboidShape(5.499999999999999, 1, 9.5, 6.499999999999999, 5, 10.5),
			Block.makeCuboidShape(9.5, 1, 9.5, 10.5, 5, 10.5),
			Block.makeCuboidShape(7.499999999999999, 2, 11.5, 8.5, 4, 12.5),
			Block.makeCuboidShape(7.499999999999999, 3, 12.5, 8.5, 5, 13.5),
			Block.makeCuboidShape(7.499999999999999, 4, 13.5, 8.5, 5, 14.5),
			Block.makeCuboidShape(7.499999999999999, 2, 3.5, 8.5, 3, 4.5),
			Block.makeCuboidShape(7.499999999999999, 3, 2.5, 8.5, 5, 3.5),
			Block.makeCuboidShape(7.499999999999999, 5, 3.5, 8.5, 6, 5.5)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_E = Stream.of(
			Block.makeCuboidShape(5.499999999999999, 0, 6.5, 10.5, 1, 9.5),
			Block.makeCuboidShape(6.499999999999999, 0, 5.5, 9.5, 1, 6.5),
			Block.makeCuboidShape(6.499999999999999, 0, 9.5, 9.5, 1, 10.5),
			Block.makeCuboidShape(6.499999999999999, 1, 10.5, 9.5, 5, 11.5),
			Block.makeCuboidShape(6.499999999999999, 1, 4.5, 9.5, 5, 5.5),
			Block.makeCuboidShape(4.499999999999999, 1, 6.5, 5.499999999999999, 5, 9.5),
			Block.makeCuboidShape(10.5, 1, 6.5, 11.5, 5, 9.5),
			Block.makeCuboidShape(5.499999999999999, 1, 5.5, 6.499999999999999, 5, 6.5),
			Block.makeCuboidShape(5.499999999999999, 1, 9.5, 6.499999999999999, 5, 10.5),
			Block.makeCuboidShape(9.5, 1, 9.5, 10.5, 5, 10.5),
			Block.makeCuboidShape(9.5, 1, 5.5, 10.5, 5, 6.5),
			Block.makeCuboidShape(11.5, 2, 7.5, 12.5, 4, 8.5),
			Block.makeCuboidShape(12.5, 3, 7.5, 13.5, 5, 8.5),
			Block.makeCuboidShape(13.5, 4, 7.5, 14.5, 5, 8.5),
			Block.makeCuboidShape(3.499999999999999, 2, 7.5, 4.499999999999999, 3, 8.5),
			Block.makeCuboidShape(2.499999999999999, 3, 7.5, 3.499999999999999, 5, 8.5),
			Block.makeCuboidShape(3.499999999999999, 5, 7.5, 5.499999999999999, 6, 8.5)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
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
	
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	public static final IntegerProperty LEVEL = IntegerProperty.create("level", 0, 7);

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
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing());
	}
	
	public void setLevel(World worldIn, BlockPos pos, BlockState state, int level) {
		worldIn.setBlockState(pos, state.with(LEVEL, Integer.valueOf(MathHelper.clamp(level, 0, 7))), 2);
	}
	
	
	/* States:
	0: Empty teapot
	1: Water
	2: Water and tealeaves
	3: NOT USED, need to figure out timer. Unfinished tea
	4: Blueberry Tea (Blueberry)
	5: Vision Tea (See shroom)
	6:
	7:
	*/
	
	int teaTimer = 0;
	
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		
		
		
		ItemStack itemstack = player.getHeldItem(handIn);
		Item tea = null;
		
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
					this.setLevel(worldIn, pos, state, 1);
					worldIn.playSound((PlayerEntity) null, pos, SoundEvents.ITEM_BUCKET_EMPTY, SoundCategory.BLOCKS,
							1.0F, 1.0F);
					} 
				return ActionResultType.SUCCESS;

			} else if (item == ModItems.TEA_LEAVES.get() && i == 1) {
				if (!worldIn.isRemote) {
					if (!player.abilities.isCreativeMode) {
	                     itemstack.shrink(1);
					}
					this.setLevel(worldIn, pos, state, 2);
					// play sound
				}
				return ActionResultType.SUCCESS;

			} else if (item == ModItems.BLUEBERRY.get() && i == 2) {

				 if (!worldIn.isRemote) {
					if (!player.abilities.isCreativeMode) {
	                     itemstack.shrink(1);
					}
					this.setLevel(worldIn, pos, state, 4);
					
					
				 }	
				 return ActionResultType.SUCCESS;
				 
			} else if (item == BlockItem.getItemFromBlock(ModBlocks.SEESHROOM.get()) && i == 2) {

				 if (!worldIn.isRemote) {
					if (!player.abilities.isCreativeMode) {
	                     itemstack.shrink(1);
					}
					this.setLevel(worldIn, pos, state, 5);
					}	
				 return ActionResultType.SUCCESS;
				
			} else if (item == ModItems.EMPTY_CUP.get() && i >= 4) {
				if(!worldIn.isRemote) {
					switch (i) {
					case 4:
						tea = ModItems.BLUEBERRY_TEA.get();
						break;
					case 5:
						tea = ModItems.VISION_TEA.get();
						break;
					default:
						tea = Items.COARSE_DIRT;
						break;
					}
					player.setHeldItem(handIn, new ItemStack(tea));
					this.setLevel(worldIn, pos, state, 0);
				}
				return ActionResultType.SUCCESS;
				
			} else {
				return ActionResultType.PASS;
			}
		}
	}
}
