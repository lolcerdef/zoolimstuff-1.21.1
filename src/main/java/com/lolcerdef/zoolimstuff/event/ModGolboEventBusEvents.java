package com.lolcerdef.zoolimstuff.event;

import com.lolcerdef.zoolimstuff.ZooliminologyStuff;
import com.lolcerdef.zoolimstuff.entity.ModEntities;
import com.lolcerdef.zoolimstuff.entity.client.golbo.GolboModel;
import com.lolcerdef.zoolimstuff.entity.client.longlegs.LonglegsModel;
import com.lolcerdef.zoolimstuff.entity.custom.GolboEntity;
import com.lolcerdef.zoolimstuff.entity.custom.LonglegsEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = ZooliminologyStuff.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModGolboEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(GolboModel.LAYER_LOCATION, GolboModel::createBodyLayer);
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GOLBO.get(), GolboEntity.createAttributes().build());
    }
}
