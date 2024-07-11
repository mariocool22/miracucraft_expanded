// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelLadybee extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public ModelLadybee() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(22, 53).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(46, 38).addBox(-4.878F, -5.0F, -0.85F, 2.0F, 2.0F, 2.0F, -0.7024F, false);
		Head.setTextureOffset(30, 46).addBox(-4.878F, -5.0F, -1.15F, 2.0F, 2.0F, 2.0F, -0.7024F, false);
		Head.setTextureOffset(24, 4).addBox(-5.0976F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.8976F, false);
		Head.setTextureOffset(24, 0).addBox(-5.0976F, -5.25F, -0.75F, 2.0F, 2.0F, 2.0F, -0.8976F, false);
		Head.setTextureOffset(20, 16).addBox(-5.0976F, -5.25F, -1.25F, 2.0F, 2.0F, 2.0F, -0.8976F, false);
		Head.setTextureOffset(0, 0).addBox(-5.0976F, -4.75F, -1.25F, 2.0F, 2.0F, 2.0F, -0.8976F, false);
		Head.setTextureOffset(0, 4).addBox(-5.0976F, -4.75F, -0.75F, 2.0F, 2.0F, 2.0F, -0.8976F, false);
		Head.setTextureOffset(40, 24).addBox(-4.7805F, -5.0F, -0.85F, 2.0F, 2.0F, 2.0F, -0.6537F, false);
		Head.setTextureOffset(40, 36).addBox(-4.7805F, -5.0F, -1.15F, 2.0F, 2.0F, 2.0F, -0.6537F, false);
		Head.setTextureOffset(46, 38).addBox(2.878F, -5.0F, -0.85F, 2.0F, 2.0F, 2.0F, -0.7024F, true);
		Head.setTextureOffset(30, 46).addBox(2.878F, -5.0F, -1.15F, 2.0F, 2.0F, 2.0F, -0.7024F, true);
		Head.setTextureOffset(40, 36).addBox(2.7805F, -5.0F, -1.15F, 2.0F, 2.0F, 2.0F, -0.6537F, true);
		Head.setTextureOffset(40, 24).addBox(2.7805F, -5.0F, -0.85F, 2.0F, 2.0F, 2.0F, -0.6537F, true);
		Head.setTextureOffset(24, 4).addBox(3.0976F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.8976F, true);
		Head.setTextureOffset(24, 0).addBox(3.0976F, -5.25F, -0.75F, 2.0F, 2.0F, 2.0F, -0.8976F, true);
		Head.setTextureOffset(20, 16).addBox(3.0976F, -5.25F, -1.25F, 2.0F, 2.0F, 2.0F, -0.8976F, true);
		Head.setTextureOffset(0, 4).addBox(3.0976F, -4.75F, -0.75F, 2.0F, 2.0F, 2.0F, -0.8976F, true);
		Head.setTextureOffset(0, 0).addBox(3.0976F, -4.75F, -1.25F, 2.0F, 2.0F, 2.0F, -0.8976F, true);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.0049F, -4.3461F, 0.3487F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 2.3562F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(12, 32).addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, true);
		cube_r1.setTextureOffset(12, 32).addBox(-9.0341F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.0049F, -4.3582F, 0.3608F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 2.3562F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(28, 32).addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, true);
		cube_r2.setTextureOffset(28, 32).addBox(-9.0341F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(4.0049F, -4.3461F, -0.3487F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, -2.3562F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(34, 34).addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, true);
		cube_r3.setTextureOffset(34, 34).addBox(-9.0341F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(4.0049F, -4.3582F, -0.3608F);
		Head.addChild(cube_r4);
		setRotationAngle(cube_r4, -2.3562F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(36, 16).addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, true);
		cube_r4.setTextureOffset(36, 16).addBox(-9.0341F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(4.0049F, -5.0534F, 0.3487F);
		Head.addChild(cube_r5);
		setRotationAngle(cube_r5, 2.3562F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(38, 30).addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, true);
		cube_r5.setTextureOffset(38, 30).addBox(-9.0341F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(4.0049F, -5.0655F, 0.3608F);
		Head.addChild(cube_r6);
		setRotationAngle(cube_r6, 2.3562F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(32, 38).addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, true);
		cube_r6.setTextureOffset(32, 38).addBox(-9.0341F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(4.0049F, -5.0534F, -0.3487F);
		Head.addChild(cube_r7);
		setRotationAngle(cube_r7, -2.3562F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(40, 20).addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, true);
		cube_r7.setTextureOffset(40, 20).addBox(-9.0341F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(3.7805F, -4.0F, 0.0F);
		Head.addChild(cube_r8);
		setRotationAngle(cube_r8, -1.5708F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(38, 40).addBox(-1.0244F, -1.0F, -0.85F, 2.0F, 2.0F, 2.0F, -0.6537F, true);
		cube_r8.setTextureOffset(32, 42).addBox(-1.0F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, -0.6537F, true);
		cube_r8.setTextureOffset(44, 42).addBox(-0.9268F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, -0.7024F, true);
		cube_r8.setTextureOffset(46, 22).addBox(-0.9268F, -1.0F, -0.85F, 2.0F, 2.0F, 2.0F, -0.7024F, true);
		cube_r8.setTextureOffset(32, 42).addBox(-8.561F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, -0.6537F, false);
		cube_r8.setTextureOffset(38, 40).addBox(-8.5366F, -1.0F, -0.85F, 2.0F, 2.0F, 2.0F, -0.6537F, false);
		cube_r8.setTextureOffset(46, 22).addBox(-8.6341F, -1.0F, -0.85F, 2.0F, 2.0F, 2.0F, -0.7024F, false);
		cube_r8.setTextureOffset(44, 42).addBox(-8.6341F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, -0.7024F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(4.0049F, -5.0655F, -0.3608F);
		Head.addChild(cube_r9);
		setRotationAngle(cube_r9, -2.3562F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(44, 0).addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, true);
		cube_r9.setTextureOffset(44, 0).addBox(-9.0341F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(4.0537F, -4.3975F, 0.4095F);
		Head.addChild(cube_r10);
		setRotationAngle(cube_r10, 2.3562F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(44, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, true);
		cube_r10.setTextureOffset(44, 16).addBox(-9.1073F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(4.0537F, -4.3975F, -0.4095F);
		Head.addChild(cube_r11);
		setRotationAngle(cube_r11, -2.3562F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(44, 28).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, true);
		cube_r11.setTextureOffset(44, 28).addBox(-9.1073F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(4.0537F, -5.0167F, 0.4095F);
		Head.addChild(cube_r12);
		setRotationAngle(cube_r12, 2.3562F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(44, 32).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, true);
		cube_r12.setTextureOffset(44, 32).addBox(-9.1073F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(4.0537F, -5.0167F, -0.4095F);
		Head.addChild(cube_r13);
		setRotationAngle(cube_r13, -2.3562F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(38, 44).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, true);
		cube_r13.setTextureOffset(38, 44).addBox(-9.1073F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.9024F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(16, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(32, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(24, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}