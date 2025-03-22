package com.lolcerdef.zoolimstuff.entity.client;

import com.lolcerdef.zoolimstuff.ZooliminologyStuff;
import com.lolcerdef.zoolimstuff.entity.client.golbo.GolboModel;
import com.lolcerdef.zoolimstuff.entity.custom.GolboEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GolboRenderer extends MobRenderer<GolboEntity, GolboModel<GolboEntity>> {
    public GolboRenderer(EntityRendererProvider.Context context) {
        super(context, new GolboModel<>(context.bakeLayer(GolboModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(GolboEntity golboEntity) {
        return ResourceLocation.fromNamespaceAndPath(ZooliminologyStuff.MODID, "textures/entity/golbo/golbo.png");
    }

    @Override
    public void render(GolboEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(1f,1f,1f);
        } else {
            poseStack.scale(1f,1f,1f);
        }

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
