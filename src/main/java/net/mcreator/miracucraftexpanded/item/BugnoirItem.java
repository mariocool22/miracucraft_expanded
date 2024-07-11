
package net.mcreator.miracucraftexpanded.item;

@MiracucraftExpandedModElements.ModElement.Tag
public class BugnoirItem extends MiracucraftExpandedModElements.ModElement {

	@ObjectHolder("miracucraft_expanded:bugnoir_helmet")
	public static final Item helmet = null;

	@ObjectHolder("miracucraft_expanded:bugnoir_chestplate")
	public static final Item body = null;

	@ObjectHolder("miracucraft_expanded:bugnoir_leggings")
	public static final Item legs = null;

	@ObjectHolder("miracucraft_expanded:bugnoir_boots")
	public static final Item boots = null;

	public BugnoirItem(MiracucraftExpandedModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "bugnoir";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new ModelBugNoir().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "miracucraft_expanded:textures/entities/bugnoir_layer_1.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onArmorTick(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				BugnoirTickProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}.setRegistryName("bugnoir_helmet"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new ModelBugNoir().Body;

				armorModel.bipedLeftArm = new ModelBugNoir().LeftArm;
				armorModel.bipedRightArm = new ModelBugNoir().RightArm;

				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "miracucraft_expanded:textures/entities/bugnoir_layer_1.png";
			}

		}.setRegistryName("bugnoir_chestplate"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new ModelBugNoir().LeftLeg;
				armorModel.bipedRightLeg = new ModelBugNoir().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "miracucraft_expanded:textures/entities/bugnoir_layer_1.png";
			}

		}.setRegistryName("bugnoir_leggings"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new ModelBugNoir().LeftLeg;
				armorModel.bipedRightLeg = new ModelBugNoir().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "miracucraft_expanded:textures/entities/bugnoir_layer_1.png";
			}

		}.setRegistryName("bugnoir_boots"));
	}

	// Made with Blockbench 4.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports

	public static class ModelBugNoir extends EntityModel<Entity> {
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
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		private final ModelRenderer Head_r1;
		private final ModelRenderer Head_r2;
		private final ModelRenderer Head_r3;
		private final ModelRenderer Head_r4;
		private final ModelRenderer Head_r5;
		private final ModelRenderer Head_r6;
		private final ModelRenderer Head_r7;
		private final ModelRenderer Head_r8;
		private final ModelRenderer Head_r9;
		private final ModelRenderer Head_r10;
		private final ModelRenderer Head_r11;
		private final ModelRenderer Head_r12;
		private final ModelRenderer Head_r13;
		private final ModelRenderer Head_r14;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer cube_r20;
		private final ModelRenderer cube_r21;
		private final ModelRenderer cube_r22;
		private final ModelRenderer cube_r23;
		private final ModelRenderer cube_r24;
		private final ModelRenderer cube_r25;
		private final ModelRenderer cube_r26;
		private final ModelRenderer cube_r27;
		private final ModelRenderer cube_r28;
		private final ModelRenderer cube_r29;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;

		public ModelBugNoir() {
			textureWidth = 128;
			textureHeight = 128;

			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(20, 53).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
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

			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(1.5634F, -3.4122F, -3.9024F);
			Head.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.0F, 1.5708F, 0.0F);
			cube_r14.setTextureOffset(0, 4).addBox(-1.0F, -0.75F, -0.75F, 2.0F, 2.0F, 2.0F, -0.8976F, true);
			cube_r14.setTextureOffset(24, 0).addBox(-1.0F, -1.45F, -0.75F, 2.0F, 2.0F, 2.0F, -0.8976F, true);

			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(1.4634F, -3.4122F, -3.9024F);
			Head.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.0F, 1.5708F, 0.0F);
			cube_r15.setTextureOffset(0, 0).addBox(-1.0F, -0.75F, -1.25F, 2.0F, 2.0F, 2.0F, -0.8976F, true);
			cube_r15.setTextureOffset(20, 16).addBox(-1.0F, -1.45F, -1.25F, 2.0F, 2.0F, 2.0F, -0.8976F, true);

			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(1.5146F, -3.5122F, -3.9024F);
			Head.addChild(cube_r16);
			setRotationAngle(cube_r16, 0.0F, 1.5708F, 0.0F);
			cube_r16.setTextureOffset(24, 4).addBox(-1.0732F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.8F, true);

			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(-1.5634F, -3.4122F, -3.9024F);
			Head.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.0F, -1.5708F, 0.0F);
			cube_r17.setTextureOffset(0, 4).addBox(-1.0F, -0.75F, -0.75F, 2.0F, 2.0F, 2.0F, -0.8976F, false);
			cube_r17.setTextureOffset(24, 0).addBox(-1.0F, -1.45F, -0.75F, 2.0F, 2.0F, 2.0F, -0.8976F, false);

			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(-1.4634F, -3.4122F, -3.9024F);
			Head.addChild(cube_r18);
			setRotationAngle(cube_r18, 0.0F, -1.5708F, 0.0F);
			cube_r18.setTextureOffset(0, 0).addBox(-1.0F, -0.75F, -1.25F, 2.0F, 2.0F, 2.0F, -0.8976F, false);
			cube_r18.setTextureOffset(20, 16).addBox(-1.0F, -1.45F, -1.25F, 2.0F, 2.0F, 2.0F, -0.8976F, false);

			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(-1.5146F, -3.5122F, -3.9024F);
			Head.addChild(cube_r19);
			setRotationAngle(cube_r19, 0.0F, -1.5708F, 0.0F);
			cube_r19.setTextureOffset(24, 4).addBox(-0.9268F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.8F, false);

			Head_r1 = new ModelRenderer(this);
			Head_r1.setRotationPoint(-2.6585F, -9.5488F, -0.5F);
			Head.addChild(Head_r1);
			setRotationAngle(Head_r1, 0.0F, 0.0F, -0.0436F);
			Head_r1.setTextureOffset(46, 46).addBox(-1.3995F, -0.451F, -0.5F, 1.0F, 3.0F, 1.0F, -0.122F, false);

			Head_r2 = new ModelRenderer(this);
			Head_r2.setRotationPoint(-2.6585F, -9.5488F, -0.5F);
			Head.addChild(Head_r2);
			setRotationAngle(Head_r2, 0.0F, 0.0F, 0.5236F);
			Head_r2.setTextureOffset(45, 50).addBox(-1.3762F, -1.4692F, -0.5F, 1.0F, 2.0F, 1.0F, -0.122F, false);

			Head_r3 = new ModelRenderer(this);
			Head_r3.setRotationPoint(-2.6585F, -9.5488F, -0.5F);
			Head.addChild(Head_r3);
			setRotationAngle(Head_r3, 0.0F, 0.0F, -0.8727F);
			Head_r3.setTextureOffset(32, 50).addBox(0.3762F, -1.4692F, -0.5F, 1.0F, 2.0F, 1.0F, -0.122F, false);

			Head_r4 = new ModelRenderer(this);
			Head_r4.setRotationPoint(-2.6585F, -9.5488F, -0.5F);
			Head.addChild(Head_r4);
			setRotationAngle(Head_r4, 0.0F, 0.0F, -0.3054F);
			Head_r4.setTextureOffset(32, 0).addBox(0.3995F, -0.451F, -0.5F, 1.0F, 3.0F, 1.0F, -0.122F, false);

			Head_r5 = new ModelRenderer(this);
			Head_r5.setRotationPoint(-2.7382F, -9.3959F, -0.623F);
			Head.addChild(Head_r5);
			setRotationAngle(Head_r5, 0.0F, 0.0F, -0.3054F);
			Head_r5.setTextureOffset(28, 50).addBox(-0.6005F, -0.451F, 0.5F, 2.0F, 3.0F, 0.0F, 0.002F, false);
			Head_r5.setTextureOffset(36, 50).addBox(-0.9176F, -0.451F, 0.5F, 1.0F, 3.0F, 0.0F, 0.002F, false);

			Head_r6 = new ModelRenderer(this);
			Head_r6.setRotationPoint(-2.4919F, -9.5935F, -0.623F);
			Head.addChild(Head_r6);
			setRotationAngle(Head_r6, 0.0F, 0.0F, 0.5236F);
			Head_r6.setTextureOffset(46, 37).addBox(-1.3762F, -0.4692F, 0.5F, 2.0F, 1.0F, 0.0F, 0.002F, false);

			Head_r7 = new ModelRenderer(this);
			Head_r7.setRotationPoint(2.4919F, -9.5935F, -0.623F);
			Head.addChild(Head_r7);
			setRotationAngle(Head_r7, 0.0F, 0.0F, -0.5236F);
			Head_r7.setTextureOffset(46, 36).addBox(-0.6238F, -0.4692F, 0.5F, 2.0F, 1.0F, 0.0F, 0.002F, false);

			Head_r8 = new ModelRenderer(this);
			Head_r8.setRotationPoint(2.7382F, -9.3959F, -0.623F);
			Head.addChild(Head_r8);
			setRotationAngle(Head_r8, 0.0F, 0.0F, 0.3054F);
			Head_r8.setTextureOffset(32, 36).addBox(-0.0824F, -0.451F, 0.5F, 1.0F, 3.0F, 0.0F, 0.002F, false);
			Head_r8.setTextureOffset(50, 26).addBox(-1.3995F, -0.451F, 0.5F, 2.0F, 3.0F, 0.0F, 0.002F, false);

			Head_r9 = new ModelRenderer(this);
			Head_r9.setRotationPoint(2.6585F, -9.5488F, -0.5F);
			Head.addChild(Head_r9);
			setRotationAngle(Head_r9, 0.0F, 0.0F, 0.3054F);
			Head_r9.setTextureOffset(0, 32).addBox(-1.3995F, -0.451F, -0.5F, 1.0F, 3.0F, 1.0F, -0.122F, false);

			Head_r10 = new ModelRenderer(this);
			Head_r10.setRotationPoint(2.6585F, -9.5488F, -0.5F);
			Head.addChild(Head_r10);
			setRotationAngle(Head_r10, 0.0F, 0.0F, 0.8727F);
			Head_r10.setTextureOffset(49, 49).addBox(-1.3762F, -1.4692F, -0.5F, 1.0F, 2.0F, 1.0F, -0.122F, false);

			Head_r11 = new ModelRenderer(this);
			Head_r11.setRotationPoint(2.6585F, -9.5488F, -0.5F);
			Head.addChild(Head_r11);
			setRotationAngle(Head_r11, 0.0F, 0.0F, -0.5236F);
			Head_r11.setTextureOffset(42, 48).addBox(0.3762F, -1.4692F, -0.5F, 1.0F, 2.0F, 1.0F, -0.122F, false);

			Head_r12 = new ModelRenderer(this);
			Head_r12.setRotationPoint(-3.5114F, -8.4616F, -0.5F);
			Head.addChild(Head_r12);
			setRotationAngle(Head_r12, 0.0F, 0.0F, 1.5272F);
			Head_r12.setTextureOffset(10, 58).addBox(-0.4756F, -2.6463F, -0.4756F, 1.0F, 3.0F, 1.0F, -0.122F, true);

			Head_r13 = new ModelRenderer(this);
			Head_r13.setRotationPoint(3.5114F, -8.4616F, -0.5F);
			Head.addChild(Head_r13);
			setRotationAngle(Head_r13, 0.0F, 0.0F, -1.5272F);
			Head_r13.setTextureOffset(10, 58).addBox(-0.5244F, -2.6463F, -0.4756F, 1.0F, 3.0F, 1.0F, -0.122F, false);

			Head_r14 = new ModelRenderer(this);
			Head_r14.setRotationPoint(2.6585F, -9.5488F, -0.5F);
			Head.addChild(Head_r14);
			setRotationAngle(Head_r14, 0.0F, 0.0F, 0.0436F);
			Head_r14.setTextureOffset(0, 16).addBox(0.3995F, -0.451F, -0.5F, 1.0F, 3.0F, 1.0F, -0.122F, false);

			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(16, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(-2.0572F, 9.8476F, -1.0447F);
			RightArm.addChild(cube_r20);
			setRotationAngle(cube_r20, -3.1416F, -0.7854F, 3.1416F);
			cube_r20.setTextureOffset(48, 10).addBox(-0.973F, -1.2622F, -0.5F, 1.0F, 2.0F, 1.0F, -0.422F, false);
			cube_r20.setTextureOffset(8, 48).addBox(-0.9243F, -1.2378F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4463F, false);
			cube_r20.setTextureOffset(48, 7).addBox(-0.8755F, -1.2134F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4707F, false);

			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(-2.0572F, 9.8476F, -1.0447F);
			RightArm.addChild(cube_r21);
			setRotationAngle(cube_r21, -3.1416F, 0.7854F, -3.1416F);
			cube_r21.setTextureOffset(48, 4).addBox(-0.973F, -1.2622F, -0.5F, 1.0F, 2.0F, 1.0F, -0.422F, false);
			cube_r21.setTextureOffset(4, 48).addBox(-0.9243F, -1.2378F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4463F, false);
			cube_r21.setTextureOffset(0, 48).addBox(-0.8755F, -1.2134F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4707F, false);

			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(-2.0572F, 9.8476F, -1.0447F);
			RightArm.addChild(cube_r22);
			setRotationAngle(cube_r22, 0.0F, -0.7854F, 0.0F);
			cube_r22.setTextureOffset(16, 48).addBox(-0.973F, -1.2622F, -0.5F, 1.0F, 2.0F, 1.0F, -0.422F, false);
			cube_r22.setTextureOffset(48, 13).addBox(-0.9243F, -1.2378F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4463F, false);
			cube_r22.setTextureOffset(12, 48).addBox(-0.8755F, -1.2134F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4707F, false);

			cube_r23 = new ModelRenderer(this);
			cube_r23.setRotationPoint(-2.0572F, 9.8476F, -1.0447F);
			RightArm.addChild(cube_r23);
			setRotationAngle(cube_r23, 0.0F, 0.7854F, 0.0F);
			cube_r23.setTextureOffset(20, 48).addBox(-0.8755F, -1.2134F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4707F, false);
			cube_r23.setTextureOffset(24, 48).addBox(-0.9243F, -1.2378F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4463F, false);
			cube_r23.setTextureOffset(38, 48).addBox(-0.973F, -1.2622F, -0.5F, 1.0F, 2.0F, 1.0F, -0.422F, false);

			cube_r24 = new ModelRenderer(this);
			cube_r24.setRotationPoint(-2.0572F, 9.8476F, -1.0447F);
			RightArm.addChild(cube_r24);
			setRotationAngle(cube_r24, -3.1416F, 0.0F, 3.1416F);
			cube_r24.setTextureOffset(40, 28).addBox(-0.685F, -0.4817F, -0.522F, 1.0F, 1.0F, 1.0F, -0.2756F, false);
			cube_r24.setTextureOffset(34, 32).addBox(-0.2947F, -0.4817F, -0.522F, 1.0F, 1.0F, 1.0F, -0.2756F, false);

			cube_r25 = new ModelRenderer(this);
			cube_r25.setRotationPoint(-2.0572F, 9.8476F, -1.0447F);
			RightArm.addChild(cube_r25);
			setRotationAngle(cube_r25, 0.0F, 1.5708F, 0.0F);
			cube_r25.setTextureOffset(40, 34).addBox(-0.3269F, -0.4817F, -0.5102F, 1.0F, 1.0F, 1.0F, -0.2756F, false);
			cube_r25.setTextureOffset(42, 16).addBox(-0.7172F, -0.4817F, -0.5102F, 1.0F, 1.0F, 1.0F, -0.2756F, false);
			cube_r25.setTextureOffset(54, 3).addBox(-0.644F, -0.2622F, -0.3394F, 1.0F, 1.0F, 1.0F, -0.422F, false);
			cube_r25.setTextureOffset(54, 3).addBox(-0.3757F, -0.2622F, -0.3394F, 1.0F, 1.0F, 1.0F, -0.422F, false);
			cube_r25.setTextureOffset(54, 3).addBox(-0.4001F, -0.2622F, -0.3882F, 1.0F, 1.0F, 1.0F, -0.422F, false);
			cube_r25.setTextureOffset(54, 3).addBox(-0.6196F, -0.2622F, -0.3882F, 1.0F, 1.0F, 1.0F, -0.422F, false);
			cube_r25.setTextureOffset(54, 3).addBox(-0.522F, -0.2622F, -0.4614F, 1.0F, 1.0F, 1.0F, -0.422F, false);
			cube_r25.setTextureOffset(54, 3).addBox(-0.4489F, -0.2622F, -0.437F, 1.0F, 1.0F, 1.0F, -0.422F, false);
			cube_r25.setTextureOffset(54, 3).addBox(-0.5708F, -0.2622F, -0.437F, 1.0F, 1.0F, 1.0F, -0.422F, false);
			cube_r25.setTextureOffset(46, 20).addBox(-0.522F, -0.5793F, -0.5102F, 1.0F, 1.0F, 1.0F, -0.1293F, false);

			cube_r26 = new ModelRenderer(this);
			cube_r26.setRotationPoint(-2.0572F, 9.8476F, -1.0447F);
			RightArm.addChild(cube_r26);
			setRotationAngle(cube_r26, 0.0F, 1.2217F, 0.0F);
			cube_r26.setTextureOffset(54, 3).addBox(-0.2882F, -0.2378F, -0.6254F, 1.0F, 1.0F, 1.0F, -0.4463F, false);
			cube_r26.setTextureOffset(54, 3).addBox(-0.2882F, -0.2378F, -0.6742F, 1.0F, 1.0F, 1.0F, -0.4463F, false);

			cube_r27 = new ModelRenderer(this);
			cube_r27.setRotationPoint(-2.0572F, 9.8476F, -1.0447F);
			RightArm.addChild(cube_r27);
			setRotationAngle(cube_r27, -3.1416F, 1.2217F, 3.1416F);
			cube_r27.setTextureOffset(54, 3).addBox(-0.7227F, -0.2378F, -0.6294F, 1.0F, 1.0F, 1.0F, -0.4463F, false);
			cube_r27.setTextureOffset(54, 3).addBox(-0.7227F, -0.2378F, -0.6782F, 1.0F, 1.0F, 1.0F, -0.4463F, false);

			cube_r28 = new ModelRenderer(this);
			cube_r28.setRotationPoint(-2.0572F, 9.8476F, -1.0447F);
			RightArm.addChild(cube_r28);
			setRotationAngle(cube_r28, -3.1416F, 1.3963F, 3.1416F);
			cube_r28.setTextureOffset(54, 3).addBox(-0.5624F, -0.2378F, -0.6703F, 1.0F, 1.0F, 1.0F, -0.4463F, false);
			cube_r28.setTextureOffset(54, 3).addBox(-0.5624F, -0.2378F, -0.7191F, 1.0F, 1.0F, 1.0F, -0.4463F, false);

			cube_r29 = new ModelRenderer(this);
			cube_r29.setRotationPoint(-2.0572F, 9.8476F, -1.0447F);
			RightArm.addChild(cube_r29);
			setRotationAngle(cube_r29, 0.0F, 1.3963F, 0.0F);
			cube_r29.setTextureOffset(54, 3).addBox(-0.457F, -0.2378F, -0.7157F, 1.0F, 1.0F, 1.0F, -0.4463F, false);
			cube_r29.setTextureOffset(54, 3).addBox(-0.457F, -0.2378F, -0.6669F, 1.0F, 1.0F, 1.0F, -0.4463F, false);

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
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
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

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}

}
