package com.dragn0007.realbigtrees.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class RBTPlacedFeatures {

    public static final Holder<PlacedFeature> MEGA_BIRCH_PLACED =
            PlacementUtils.register("mega_birch_placed",
                    RBTConfigFeatures.MEGA_BIRCH_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));

    public static final Holder<PlacedFeature> MEGA_OAK_PLACED =
            PlacementUtils.register("mega_oak_placed",
                    RBTConfigFeatures.MEGA_OAK_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));

    public static final Holder<PlacedFeature> MEGA_ACACIA_PLACED =
            PlacementUtils.register("mega_acacia_placed",
                    RBTConfigFeatures.MEGA_ACACIA_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));
}
