package com.omgard.ritecraft.objects.blocks;

import java.util.Set;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.block.WoodType;

public class ModWoodType extends WoodType {

	   private static final Set<WoodType> VALUES = new ObjectArraySet<>();
	   public static final WoodType ASTRAL = register(new ModWoodType("astral"));
	   public static final WoodType MUTATED_FIR = register(new ModWoodType("mutated_fir"));
	   
	   private static WoodType register(WoodType woodTypeIn) {
		      VALUES.add(woodTypeIn);
		      return woodTypeIn;
		   }

	public ModWoodType(String nameIn) {
		super(nameIn);
	}

}
