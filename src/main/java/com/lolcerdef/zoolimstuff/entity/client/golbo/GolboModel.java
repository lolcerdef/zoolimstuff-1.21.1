package com.lolcerdef.zoolimstuff.entity.client.golbo;

import com.lolcerdef.zoolimstuff.ZooliminologyStuff;
import com.lolcerdef.zoolimstuff.entity.custom.GolboEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class GolboModel<T extends GolboEntity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(ZooliminologyStuff.MODID, "golbo"), "main");
    private final ModelPart body;
    private final ModelPart main;
    private final ModelPart frontleg3;
    private final ModelPart frontleg2;
    private final ModelPart backleg1;
    private final ModelPart backleg2;
    private final ModelPart tail;
    private final ModelPart head;

    public GolboModel(ModelPart root) {
        this.body = root.getChild("body");
        this.main = this.body.getChild("main");
        this.frontleg3 = this.body.getChild("frontleg3");
        this.frontleg2 = this.body.getChild("frontleg2");
        this.backleg1 = this.body.getChild("backleg1");
        this.backleg2 = this.body.getChild("backleg2");
        this.tail = this.body.getChild("tail");
        this.head = this.body.getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -5.0F));

        PartDefinition main = body.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

        PartDefinition body_r1 = main.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -1.0F, -3.0F, 12.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition frontleg3 = body.addOrReplaceChild("frontleg3", CubeListBuilder.create(), PartPose.offset(5.0F, 0.0F, 5.0F));

        PartDefinition frontleg2_r1 = frontleg3.addOrReplaceChild("frontleg2_r1", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition frontleg2 = body.addOrReplaceChild("frontleg2", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 5.0F));

        PartDefinition frontleg2_r2 = frontleg2.addOrReplaceChild("frontleg2_r2", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition backleg1 = body.addOrReplaceChild("backleg1", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.0F, 5.0F));

        PartDefinition backleg1_r1 = backleg1.addOrReplaceChild("backleg1_r1", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition backleg2 = body.addOrReplaceChild("backleg2", CubeListBuilder.create(), PartPose.offset(-5.0F, 0.0F, 5.0F));

        PartDefinition backleg2_r1 = backleg2.addOrReplaceChild("backleg2_r1", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-5.0F, 0.0F, 0.0F));

        PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(18, 8).addBox(-1.0F, -1.0F, -8.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(36, 13).addBox(0.5463F, -1.26F, -0.2805F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(6.0F, 0.0F, 0.0F));

        PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(30, 0).addBox(-9.3724F, -1.01F, 1.019F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, 2.0F, -3.1416F, 0.1745F, 3.1416F));

        PartDefinition eye_r1 = head.addOrReplaceChild("eye_r1", CubeListBuilder.create().texOffs(36, 10).addBox(6.5896F, -1.26F, -2.0295F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, 2.0F, 0.0F, 0.0436F, 0.0F));

        PartDefinition head1_r1 = head.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(45, 0).addBox(-7.0787F, -1.0F, 7.7274F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, 2.0F, -3.1416F, 1.0385F, 3.1416F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(GolboEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(GolboAnimations.GOLBO_WALK, limbSwing, limbSwingAmount, 2f, 2f);
        this.animate(entity.idleAnimationState, GolboAnimations.GOLBO_IDLE, ageInTicks, 1f);
        this.animate(entity.fallingAnimationState, GolboAnimations.GOLBO_FALL, ageInTicks, 50f);
    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, 0f, 0f);
        headPitch = Mth.clamp(headPitch, 0f, 0f);

        this.head.yRot = headYaw * ((float)Math.PI / 180f);
        this.head.xRot = headPitch *  ((float)Math.PI / 180f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root() {
        return body;
    }
}
