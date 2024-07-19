package com.dragn0007.realbigtrees;

import com.dragn0007.realbigtrees.block.RBTBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = RealBigTrees.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class RealBigTreesEvent {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(RBTBlocks.MEGA_BIRCH_SAPLING.get(), RenderType.cutout());
    }
}




