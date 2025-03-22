package com.lolcerdef.zoolimstuff.entity;

import com.lolcerdef.zoolimstuff.ZooliminologyStuff;
import com.lolcerdef.zoolimstuff.entity.custom.GolboEntity;
import com.lolcerdef.zoolimstuff.entity.custom.LonglegsEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, ZooliminologyStuff.MODID);

    public static final Supplier<EntityType<LonglegsEntity>> LONGLEGS =
            ENTITY_TYPES.register("longlegs", () -> EntityType.Builder.of(LonglegsEntity::new, MobCategory.CREATURE)
                    .sized(0.7f, 0.5f).build("longlegs"));

    public static final Supplier<EntityType<GolboEntity>> GOLBO =
            ENTITY_TYPES.register("golbo", () -> EntityType.Builder.of(GolboEntity::new, MobCategory.CREATURE)
                    .sized(0.7f, 0.1f).build("golbo"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
