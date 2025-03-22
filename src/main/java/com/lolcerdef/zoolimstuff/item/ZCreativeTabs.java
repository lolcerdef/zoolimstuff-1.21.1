package com.lolcerdef.zoolimstuff.item;

import com.lolcerdef.zoolimstuff.ZooliminologyStuff;
import com.lolcerdef.zoolimstuff.block.ZBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ZCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZooliminologyStuff.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ZOOLIM_STUFF = CREATIVE_MODE_TABS.register("zoolim_stuff", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.zoolim_stuff")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ZItems.CLIPPING_PEN.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                //items first
                output.accept(ZItems.CLIPPING_PEN.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
                output.accept(ZItems.CLIPPING_PEN_INTERNALS.get());
                output.accept(ZItems.GOLBO_SAMPLE.get());
                output.accept(ZItems.LONGLEGS_HEAD.get());
                output.accept(ZItems.LONGLEGS_LEG.get());

                //blocks second
                output.accept(ZBlocks.BRUTALIAN_CONCRETE.get());
                output.accept(ZBlocks.PSEUDO_GRASS);
                output.accept(ZBlocks.PSEUDO_DIRT);
                output.accept(ZBlocks.TILES.get());
                output.accept(ZBlocks.WHITE_HOLE);

                //entities third
                output.accept(ZItems.LONGLEGS_SPAWN_EGG);
                output.accept(ZItems.GOLBO_SPAWN_EGG);
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
