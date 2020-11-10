package com.omgard.ritecraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.omgard.ritecraft.init.Registration;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Main.MOD_ID)
public class Main 
{

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "ritecraft";
	
	// Custom ItemGroup TAB
	public static final ItemGroup TAB = new ItemGroup("ritecrafttab") {
	
		@Override
		public ItemStack createIcon() {
			return new ItemStack(Items.STICK.getItem());
		}
	};

	public Main() {
		
		Registration.register();

		MinecraftForge.EVENT_BUS.register(this);
		
	}

}