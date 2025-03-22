package com.lolcerdef.zoolimstuff.event;

import com.lolcerdef.zoolimstuff.ZooliminologyStuff;
import com.lolcerdef.zoolimstuff.entity.ModEntities;
import com.lolcerdef.zoolimstuff.entity.client.longlegs.LonglegsModel;
import com.lolcerdef.zoolimstuff.entity.custom.LonglegsEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = ZooliminologyStuff.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModLonglegsEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(LonglegsModel.LAYER_LOCATION, LonglegsModel::createBodyLayer);
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.LONGLEGS.get(), LonglegsEntity.createAttributes().build());
    }
}
