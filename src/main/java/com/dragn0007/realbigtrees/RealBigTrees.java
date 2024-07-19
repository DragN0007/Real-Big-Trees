package com.dragn0007.realbigtrees;

import com.dragn0007.realbigtrees.block.RBTBlocks;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static com.dragn0007.realbigtrees.RealBigTrees.MODID;

@Mod(MODID)
public class RealBigTrees
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "realbigtrees";

    public RealBigTrees()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RBTBlocks.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("Real Big Trees Loaded!");
    }
}
