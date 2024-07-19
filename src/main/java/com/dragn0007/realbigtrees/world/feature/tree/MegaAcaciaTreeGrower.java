package com.dragn0007.realbigtrees.world.feature.tree;


import com.dragn0007.realbigtrees.world.feature.RBTConfigFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractMegaTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class MegaAcaciaTreeGrower extends AbstractMegaTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredMegaFeature(Random random) {
        return RBTConfigFeatures.MEGA_ACACIA;
    }

    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random random, boolean b) {
        return null;
    }
}
