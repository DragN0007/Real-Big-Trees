package com.dragn0007.realbigtrees.world;

import com.dragn0007.realbigtrees.RealBigTrees;
import com.dragn0007.realbigtrees.world.gen.RBTTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber (modid = RealBigTrees.MODID)
public class RBTWorldEvents {

    @SubscribeEvent
            public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
    RBTTreeGeneration.generateTrees(event);
    }
}
