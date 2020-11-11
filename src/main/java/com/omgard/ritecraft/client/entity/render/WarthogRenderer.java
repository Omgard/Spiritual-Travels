package com.omgard.ritecraft.client.entity.render;

import com.omgard.ritecraft.Main;
import com.omgard.ritecraft.client.entity.model.WarthogModel;
import com.omgard.ritecraft.objects.entities.WarthogEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class WarthogRenderer extends MobRenderer<WarthogEntity, WarthogModel<WarthogEntity>> {
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID, "textures/entity/warthog.png");

	public WarthogRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new WarthogModel<WarthogEntity>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(WarthogEntity entity) {
		return TEXTURE;
	}
	
	

}