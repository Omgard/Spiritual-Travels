// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer back_left_leg;
	private final ModelRenderer back_right_leg;
	private final ModelRenderer back_right_leg_sub_0;
	private final ModelRenderer front_left_leg;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer tail;
	private final ModelRenderer mouth;
	private final ModelRenderer child_back_left_leg;
	private final ModelRenderer child_back_left_leg_sub_0;
	private final ModelRenderer child_back_right_leg;
	private final ModelRenderer child_front_left_leg;
	private final ModelRenderer child_front_left_leg_sub_0;
	private final ModelRenderer child_front_right_leg;
	private final ModelRenderer nose1;
	private final ModelRenderer right_gevir;
	private final ModelRenderer right_gevir2;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 8.0F, 0.0F);
		body.setTextureOffset(61, 60).addBox(-5.0F, -5.0F, -11.0F, 10.0F, 10.0F, 22.0F, 0.05F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 3.0F, -9.9F);
		neck.setTextureOffset(104, 41).addBox(-2.0F, -4.0F, -4.1F, 4.0F, 9.0F, 8.0F, 0.0F, false);

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(-3.0F, 13.0F, 9.0F);
		back_left_leg.setTextureOffset(60, 98).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(3.0F, 13.0F, 9.0F);
		

		back_right_leg_sub_0 = new ModelRenderer(this);
		back_right_leg_sub_0.setRotationPoint(-3.0F, 11.0F, -9.0F);
		back_right_leg.addChild(back_right_leg_sub_0);
		back_right_leg_sub_0.setTextureOffset(24, 47).addBox(1.0F, -11.0F, 7.0F, 4.0F, 11.0F, 4.0F, 0.0F, true);

		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(-3.0F, 13.0F, -9.1F);
		front_left_leg.setTextureOffset(57, 60).addBox(-2.0F, 0.0F, -1.9F, 4.0F, 11.0F, 4.0F, 0.0F, false);

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(3.0F, 13.0F, -9.1F);
		front_right_leg.setTextureOffset(35, 73).addBox(-2.0F, 0.0F, -1.9F, 4.0F, 11.0F, 4.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 4.0F, 11.0F);
		tail.setTextureOffset(3, 3).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 2.0F, -11.0F);
		mouth.setTextureOffset(94, 30).addBox(-2.0F, -5.0F, -4.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		child_back_left_leg = new ModelRenderer(this);
		child_back_left_leg.setRotationPoint(3.0F, 13.0F, 9.0F);
		

		child_back_left_leg_sub_0 = new ModelRenderer(this);
		child_back_left_leg_sub_0.setRotationPoint(-3.0F, 11.0F, -9.0F);
		child_back_left_leg.addChild(child_back_left_leg_sub_0);
		child_back_left_leg_sub_0.setTextureOffset(5, 55).addBox(1.0F, -16.5F, 7.0F, 4.0F, 22.0F, 4.0F, 0.0F, true);

		child_back_right_leg = new ModelRenderer(this);
		child_back_right_leg.setRotationPoint(-3.0F, 13.0F, 9.0F);
		child_back_right_leg.setTextureOffset(47, 25).addBox(-2.0F, -5.5F, -2.0F, 4.0F, 22.0F, 4.0F, 0.0F, false);

		child_front_left_leg = new ModelRenderer(this);
		child_front_left_leg.setRotationPoint(-3.0F, 13.0F, -9.0F);
		

		child_front_left_leg_sub_0 = new ModelRenderer(this);
		child_front_left_leg_sub_0.setRotationPoint(3.0F, 11.0F, 9.0F);
		child_front_left_leg.addChild(child_front_left_leg_sub_0);
		child_front_left_leg_sub_0.setTextureOffset(95, 97).addBox(1.0F, -16.5F, -11.0F, 4.0F, 22.0F, 4.0F, 0.0F, true);

		child_front_right_leg = new ModelRenderer(this);
		child_front_right_leg.setRotationPoint(3.0F, 13.0F, -9.0F);
		child_front_right_leg.setTextureOffset(27, 9).addBox(-8.0F, -5.5F, -2.0F, 4.0F, 22.0F, 4.0F, 0.0F, false);

		nose1 = new ModelRenderer(this);
		nose1.setRotationPoint(0.0F, 0.5F, -15.0F);
		nose1.setTextureOffset(81, 40).addBox(-2.0F, -1.5F, -5.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		right_gevir = new ModelRenderer(this);
		right_gevir.setRotationPoint(4.4F, -6.7F, -9.3F);
		right_gevir.setTextureOffset(104, 24).addBox(-3.4F, 2.7F, -2.7F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		right_gevir.setTextureOffset(110, 19).addBox(-1.4F, 1.7F, -0.7F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_gevir.setTextureOffset(112, 12).addBox(-0.4F, -1.3F, -0.7F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		right_gevir.setTextureOffset(112, 3).addBox(0.6F, -4.3F, -1.7F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_gevir.setTextureOffset(112, 3).addBox(0.6F, -4.3F, 1.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_gevir2 = new ModelRenderer(this);
		right_gevir2.setRotationPoint(-4.4F, -6.7F, -9.3F);
		right_gevir2.setTextureOffset(88, 24).addBox(0.4F, 2.7F, -2.7F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		right_gevir2.setTextureOffset(87, 19).addBox(-0.6F, 1.7F, -0.7F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_gevir2.setTextureOffset(84, 12).addBox(-0.6F, -1.3F, -0.7F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		right_gevir2.setTextureOffset(75, 3).addBox(-1.6F, -4.3F, -1.7F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_gevir2.setTextureOffset(75, 3).addBox(-1.6F, -4.3F, 1.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		neck.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		mouth.render(matrixStack, buffer, packedLight, packedOverlay);
		child_back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		child_back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		child_front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		child_front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		nose1.render(matrixStack, buffer, packedLight, packedOverlay);
		right_gevir.render(matrixStack, buffer, packedLight, packedOverlay);
		right_gevir2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}