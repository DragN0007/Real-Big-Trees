package com.dragn0007.realbigtrees;

import com.dragn0007.realbigtrees.block.RBTBlocks;
import com.dragn0007.realbigtrees.item.RBTItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
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
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RBTItems.register(eventBus);
        RBTBlocks.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event)
    {
    }
    private void enqueueIMC(final InterModEnqueueEvent event)
    {
    }
    private void processIMC(final InterModProcessEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("Real Big Trees Loaded!");
    }
}
