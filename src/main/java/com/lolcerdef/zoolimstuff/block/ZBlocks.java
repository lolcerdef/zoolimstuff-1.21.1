package com.lolcerdef.zoolimstuff.block;

import com.lolcerdef.zoolimstuff.ZooliminologyStuff;
import com.lolcerdef.zoolimstuff.item.ZItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ZBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ZooliminologyStuff.MODID);

    public static final DeferredBlock<Block> PSEUDO_GRASS = registerBlock("pseudo_grass",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final DeferredBlock<Block> PSEUDO_DIRT = registerBlock("pseudo_dirt",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL)));

    public static final DeferredBlock<Block> BRUTALIAN_CONCRETE = registerBlock("brutalian_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));

    public static final DeferredBlock<Block> TILES = registerBlock("tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.GLASS)
                    .strength(2.0F)
                    .instrument(NoteBlockInstrument.CHIME)
                    .mapColor(DyeColor.CYAN)));

    public static final DeferredBlock<Block> WHITE_HOLE = registerBlock("white_hole",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(DyeColor.WHITE)
                    .lightLevel((p_50872_) -> 15)
                    .sound(SoundType.STONE)
                    .strength( -9223372036854775808F, 3600000.0F)
                    .noLootTable()
                    .isValidSpawn(Blocks::never)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ZItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
