package com.lolcerdef.zoolimstuff.entity.client;

import com.lolcerdef.zoolimstuff.ZooliminologyStuff;
import com.lolcerdef.zoolimstuff.entity.client.longlegs.LonglegsModel;
import com.lolcerdef.zoolimstuff.entity.custom.LonglegsEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class LonglegsRenderer extends MobRenderer<LonglegsEntity, LonglegsModel<LonglegsEntity>> {
    public LonglegsRenderer(EntityRendererProvider.Context context) {
        super(context, new LonglegsModel<>(context.bakeLayer(LonglegsModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(LonglegsEntity longlegsEntity) {
        return ResourceLocation.fromNamespaceAndPath(ZooliminologyStuff.MODID, "textures/entity/longlegs/longlegs.png");
    }


    @Override
    public void render(LonglegsEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(1f,1f,1f);
        } else {
            poseStack.scale(1f,1f,1f);
        }

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
