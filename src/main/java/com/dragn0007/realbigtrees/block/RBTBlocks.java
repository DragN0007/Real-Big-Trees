package com.dragn0007.realbigtrees.block;

import com.dragn0007.realbigtrees.RealBigTrees;
import com.dragn0007.realbigtrees.world.feature.tree.MegaAcaciaTreeGrower;
import com.dragn0007.realbigtrees.world.feature.tree.MegaBirchTreeGrower;
import com.dragn0007.realbigtrees.world.feature.tree.MegaOakTreeGrower;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RBTBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, RealBigTrees.MODID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RealBigTrees.MODID);


    public static final RegistryObject<Block> MEGA_BIRCH_SAPLING = registerBlock("mega_birch_sapling",
            () -> new SaplingBlock(new MegaBirchTreeGrower(), Block.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> MEGA_OAK_SAPLING = registerBlock("mega_oak_sapling",
            () -> new SaplingBlock(new MegaOakTreeGrower(), Block.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> MEGA_ACACIA_SAPLING = registerBlock("mega_acacia_sapling",
            () -> new SaplingBlock(new MegaAcaciaTreeGrower(), Block.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        RBTBlocks.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
