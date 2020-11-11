package com.omgard.ritecraft.client.entity.render;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.client.entity.model.WarthogModel;
import com.omgard.ritecraft.data.base.WarthogEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class WarthogRenderer extends MobRenderer<WarthogEntity, WarthogModel<WarthogEntity>> {
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID, "textures/entity/hog.png");

	public WarthogRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new WarthogModel<>(), 0.7F);
	}

	@Override
	public ResourceLocation getEntityTexture(WarthogEntity entity) {
		return TEXTURE;
	}
	
	

}