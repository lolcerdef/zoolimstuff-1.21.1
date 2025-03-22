package com.lolcerdef.zoolimstuff.item;

import com.lolcerdef.zoolimstuff.ZooliminologyStuff;
import com.lolcerdef.zoolimstuff.entity.ModEntities;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ZItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ZooliminologyStuff.MODID);

    public static final DeferredItem<Item> CLIPPING_PEN = ITEMS.register("clipping_pen",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CLIPPING_PEN_INTERNALS = ITEMS.register("clipping_pen_internals",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LONGLEGS_LEG = ITEMS.register("longlegs_leg",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LONGLEGS_HEAD = ITEMS.register("longlegs_head",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GOLBO_SAMPLE = ITEMS.registerSimpleItem("golbo_sample", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(0).saturationModifier(2f).build()));

    public static final DeferredItem<Item> LONGLEGS_SPAWN_EGG = ITEMS.register("longlegs_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.LONGLEGS, 0xf7d8b7, 0xf7d8b7,
                    new Item.Properties()));

    public static final DeferredItem<Item> GOLBO_SPAWN_EGG = ITEMS.register("golbo_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.GOLBO, 0xfcebf5, 0xe0abd3,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
