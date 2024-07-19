package com.dragn0007.realbigtrees.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class RBTPlacedFeatures {

    //TREES
    public static final Holder<PlacedFeature> MEGA_BIRCH_PLACED =
            PlacementUtils.register("mega_birch_placed",
                    RBTConfigFeatures.MEGA_BIRCH_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));
}
