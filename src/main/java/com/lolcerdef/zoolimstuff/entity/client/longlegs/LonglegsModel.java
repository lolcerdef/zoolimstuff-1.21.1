package com.lolcerdef.zoolimstuff.entity.client.longlegs;// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.lolcerdef.zoolimstuff.ZooliminologyStuff;
import com.lolcerdef.zoolimstuff.entity.custom.LonglegsEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class LonglegsModel<T extends LonglegsEntity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(ZooliminologyStuff.MODID, "longlegs"), "main");
    private final ModelPart Body;
    private final ModelPart right_back_leg;
    private final ModelPart left_back_leg;
    private final ModelPart left_mid_leg;
    private final ModelPart right_front_leg;
    private final ModelPart head;
    private final ModelPart left_front_leg;
    private final ModelPart right_mid_leg;

    public LonglegsModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.right_back_leg = this.Body.getChild("right_back_leg");
        this.left_back_leg = this.Body.getChild("left_back_leg");
        this.left_mid_leg = this.Body.getChild("left_mid_leg");
        this.right_front_leg = this.Body.getChild("right_front_leg");
        this.head = this.Body.getChild("head");
        this.left_front_leg = this.Body.getChild("left_front_leg");
        this.right_mid_leg = this.Body.getChild("right_mid_leg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(-3.675F, 17.65F, 3.0F));

        PartDefinition right_back_leg = Body.addOrReplaceChild("right_back_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition legseg1_r_r1 = right_back_leg.addOrReplaceChild("legseg1_r_r1", CubeListBuilder.create().texOffs(14, 21).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.325F, 0.35F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition legseg2_r_r1 = right_back_leg.addOrReplaceChild("legseg2_r_r1", CubeListBuilder.create().texOffs(32, 8).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.6109F));

        PartDefinition legseg4_r_r1 = right_back_leg.addOrReplaceChild("legseg4_r_r1", CubeListBuilder.create().texOffs(36, 29).addBox(-2.675F, -2.05F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.525F, 3.7F, 0.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition legseg3_r_r1 = right_back_leg.addOrReplaceChild("legseg3_r_r1", CubeListBuilder.create().texOffs(32, 4).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9F, 1.15F, 0.0F, 0.0F, 0.0F, -1.309F));

        PartDefinition left_back_leg = Body.addOrReplaceChild("left_back_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(7.35F, -0.4F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition legseg3_l_r1 = left_back_leg.addOrReplaceChild("legseg3_l_r1", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, 1.55F, 0.0F, 0.0F, 0.0F, 1.309F));

        PartDefinition legseg2_l_r1 = left_back_leg.addOrReplaceChild("legseg2_l_r1", CubeListBuilder.create().texOffs(24, 29).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

        PartDefinition legseg1_l_r1 = left_back_leg.addOrReplaceChild("legseg1_l_r1", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.325F, 0.75F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition legseg4_l_r1 = left_back_leg.addOrReplaceChild("legseg4_l_r1", CubeListBuilder.create().texOffs(36, 25).addBox(-0.325F, -2.05F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.525F, 4.1F, 0.0F, 0.0F, 0.0F, 1.5708F));

        PartDefinition left_mid_leg = Body.addOrReplaceChild("left_mid_leg", CubeListBuilder.create(), PartPose.offset(7.35F, -0.4F, -3.0F));

        PartDefinition legseg2_l_r2 = left_mid_leg.addOrReplaceChild("legseg2_l_r2", CubeListBuilder.create().texOffs(12, 29).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

        PartDefinition legseg1_l_r2 = left_mid_leg.addOrReplaceChild("legseg1_l_r2", CubeListBuilder.create().texOffs(14, 17).addBox(-2.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.325F, 0.75F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition legseg4_l_r2 = left_mid_leg.addOrReplaceChild("legseg4_l_r2", CubeListBuilder.create().texOffs(30, 33).addBox(-0.325F, -2.05F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.525F, 4.1F, 0.0F, 0.0F, 0.0F, 1.5708F));

        PartDefinition legseg3_l_r2 = left_mid_leg.addOrReplaceChild("legseg3_l_r2", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, 1.55F, 0.0F, 0.0F, 0.0F, 1.309F));

        PartDefinition right_front_leg = Body.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -6.0F, 0.0F, -0.5672F, 0.0F));

        PartDefinition legseg2_r_r2 = right_front_leg.addOrReplaceChild("legseg2_r_r2", CubeListBuilder.create().texOffs(28, 21).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

        PartDefinition legseg1_r_r2 = right_front_leg.addOrReplaceChild("legseg1_r_r2", CubeListBuilder.create().texOffs(0, 17).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.325F, 0.75F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition legseg4_r_r2 = right_front_leg.addOrReplaceChild("legseg4_r_r2", CubeListBuilder.create().texOffs(20, 33).addBox(-2.675F, -2.05F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.525F, 4.1F, 0.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition legseg3_r_r2 = right_front_leg.addOrReplaceChild("legseg3_r_r2", CubeListBuilder.create().texOffs(28, 17).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9F, 1.55F, 0.0F, 0.0F, 0.0F, -1.309F));

        PartDefinition head = Body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(3.675F, 1.35F, -3.0F));

        PartDefinition left_front_leg = Body.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(7.35F, -0.4F, -6.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition legseg3_l_r3 = left_front_leg.addOrReplaceChild("legseg3_l_r3", CubeListBuilder.create().texOffs(12, 25).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, 1.55F, 0.0F, 0.0F, 0.0F, 1.309F));

        PartDefinition legseg2_l_r3 = left_front_leg.addOrReplaceChild("legseg2_l_r3", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

        PartDefinition legseg1_l_r3 = left_front_leg.addOrReplaceChild("legseg1_l_r3", CubeListBuilder.create().texOffs(0, 13).addBox(-2.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.325F, 0.75F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition legseg4_l_r3 = left_front_leg.addOrReplaceChild("legseg4_l_r3", CubeListBuilder.create().texOffs(10, 33).addBox(-0.325F, -2.05F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.525F, 4.1F, 0.0F, 0.0F, 0.0F, 1.5708F));

        PartDefinition right_mid_leg = Body.addOrReplaceChild("right_mid_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0F));

        PartDefinition legseg1_r_r3 = right_mid_leg.addOrReplaceChild("legseg1_r_r3", CubeListBuilder.create().texOffs(14, 13).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.325F, 0.35F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition legseg2_r_r3 = right_mid_leg.addOrReplaceChild("legseg2_r_r3", CubeListBuilder.create().texOffs(24, 25).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.6109F));

        PartDefinition legseg4_r_r3 = right_mid_leg.addOrReplaceChild("legseg4_r_r3", CubeListBuilder.create().texOffs(0, 33).addBox(-2.675F, -2.05F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.525F, 3.7F, 0.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition legseg3_r_r3 = right_mid_leg.addOrReplaceChild("legseg3_r_r3", CubeListBuilder.create().texOffs(28, 13).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9F, 1.15F, 0.0F, 0.0F, 0.0F, -1.309F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(LonglegsEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);

        this.animate(entity.idleAnimationState, LonglegsAnimations.ANIM_LONGLEGS_IDLE, ageInTicks, 1f);
        this.animateWalk(LonglegsAnimations.LONGLEGS_WALK, limbSwing, limbSwingAmount, 10f, 50f);
    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -2f, 2f);
        headPitch = Mth.clamp(headPitch, -2f, 2);

        this.head.yRot = headYaw * ((float)Math.PI / 180f);
        this.head.xRot = headPitch *  ((float)Math.PI / 180f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root() {
        return Body;
    }
}