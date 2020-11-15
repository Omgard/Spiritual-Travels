package com.omgard.ritecraft.client.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class DeerModel extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer tail;
	private final ModelRenderer head;
	private final ModelRenderer mouth;
	private final ModelRenderer headpiece;
	private final ModelRenderer child_back_left_leg;
	private final ModelRenderer child_back_right_leg;
	private final ModelRenderer child_front_left_leg;
	private final ModelRenderer child_front_right_leg;
	private final ModelRenderer right_ear;
	private final ModelRenderer right_ear2;

	public DeerModel() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 11.0F, 6.0F);
		body.setTextureOffset(0, 22).addBox(-5.0F, -8.0F, -17.0F, 10.0F, 13.0F, 22.0F, 0.05F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 3.0F, -8.9F);
		setRotationAngle(neck, 0.0873F, 0.0F, 0.0F);
		neck.setTextureOffset(32, 28).addBox(-2.0F, -4.0F, -2.1F, 4.0F, 9.0F, 7.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 3.0F, 11.0F);
		tail.setTextureOffset(39, 53).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.0F, -9.0F);
		head.setTextureOffset(32, 47).addBox(-3.0F, -5.0F, -2.0F, 6.0F, 5.0F, 7.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, -1.0F, -11.0F);
		mouth.setTextureOffset(55, 44).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		headpiece = new ModelRenderer(this);
		headpiece.setRotationPoint(0.0F, -1.0F, -9.0F);
		headpiece.setTextureOffset(48, 31).addBox(-3.0F, -5.0F, -2.0F, 6.0F, 5.0F, 7.0F, 0.25F, false);

		child_back_left_leg = new ModelRenderer(this);
		child_back_left_leg.setRotationPoint(2.0F, 16.0F, 8.0F);
		child_back_left_leg.setTextureOffset(8, 43).addBox(-1.0F, -0.5F, -1.0F, 4.0F, 14.0F, 2.0F, 0.0F, true);

		child_back_right_leg = new ModelRenderer(this);
		child_back_right_leg.setRotationPoint(-3.0F, 16.0F, 8.0F);
		child_back_right_leg.setTextureOffset(12, 54).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 14.0F, 2.0F, 0.0F, false);

		child_front_left_leg = new ModelRenderer(this);
		child_front_left_leg.setRotationPoint(3.0F, 16.0F, -10.0F);
		child_front_left_leg.setTextureOffset(40, 0).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 14.0F, 2.0F, 0.0F, false);

		child_front_right_leg = new ModelRenderer(this);
		child_front_right_leg.setRotationPoint(-3.0F, 16.0F, -9.0F);
		child_front_right_leg.setTextureOffset(24, 8).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 14.0F, 2.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(3.5F, -11.0F, -4.5F);
		setRotationAngle(right_ear, 0.0F, 0.0F, 0.3927F);
		right_ear.setTextureOffset(20, 31).addBox(-0.352F, 0.7716F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		right_ear2 = new ModelRenderer(this);
		right_ear2.setRotationPoint(-3.5F, -11.0F, -4.5F);
		setRotationAngle(right_ear2, 0.0F, 0.0F, -0.3491F);
		right_ear2.setTextureOffset(20, 42).addBox(-2.5261F, 0.8191F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		neck.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		mouth.render(matrixStack, buffer, packedLight, packedOverlay);
		headpiece.render(matrixStack, buffer, packedLight, packedOverlay);
		child_back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		child_back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		child_front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		child_front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		right_ear2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}