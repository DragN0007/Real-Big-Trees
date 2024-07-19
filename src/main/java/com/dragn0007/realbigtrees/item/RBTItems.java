package com.dragn0007.realbigtrees.item;

import com.dragn0007.realbigtrees.RealBigTrees;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RBTItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RealBigTrees.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
