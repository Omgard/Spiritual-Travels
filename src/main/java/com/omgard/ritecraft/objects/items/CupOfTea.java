package com.omgard.ritecraft.objects.items;

import java.util.List;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.init.ModItems;
import com.omgard.ritecraft.util.helpers.KeyboardHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class CupOfTea extends Item{

	public CupOfTea() {
		super(new Item.Properties()
		.group(Main.TAB)
		.food(new Food.Builder()
				.hunger(4)
				.saturation(4.0F)
				.setAlwaysEdible()
				.effect(() -> new EffectInstance(Effects.SPEED, 200, 0), 1.0F)
				
				
				.build()
				)
		);		
	}
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
		return entityLiving instanceof PlayerEntity && ((PlayerEntity)entityLiving).abilities.isCreativeMode ? itemstack : new ItemStack(ModItems.EMPTY_CUP.get());

		}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add(new StringTextComponent("Yummy tea!"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	@Override
	public SoundEvent getEatSound() {		
		return super.getDrinkSound();
	}
}
