package com.dragn0007.realbigtrees.world.feature;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaJungleFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.MegaJungleTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class RBTConfigFeatures {


    //MEGA BIRCH
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MEGA_BIRCH = FeatureUtils.register("mega_birch",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.BIRCH_LOG),
            new GiantTrunkPlacer(9, 3, 10),
            BlockStateProvider.simple(Blocks.BIRCH_LEAVES),
            new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(1, 1, 2)).decorators(ImmutableList.of(
            new AlterGroundDecorator(BlockStateProvider.simple(Blocks.CLAY)))).build());
    public static final Holder<PlacedFeature> MEGA_BIRCH_CHECKED =
            PlacementUtils.register("mega_birch_checked",
            MEGA_BIRCH, PlacementUtils.filteredByBlockSurvival(Blocks.BIRCH_SAPLING));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MEGA_BIRCH_SPAWN =
            FeatureUtils.register("mega_birch_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                    new WeightedPlacedFeature(MEGA_BIRCH_CHECKED, 0.1F)), MEGA_BIRCH_CHECKED));


    //MEGA OAK
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MEGA_OAK = FeatureUtils.register("mega_oak",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new DarkOakTrunkPlacer(8, 2, 1),
            BlockStateProvider.simple(Blocks.OAK_LEAVES),
            new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
            new TwoLayersFeatureSize(1, 1, 2)).decorators(ImmutableList.of(
            new AlterGroundDecorator(BlockStateProvider.simple(Blocks.MOSS_BLOCK)))).build());
    public static final Holder<PlacedFeature> MEGA_OAK_CHECKED =
            PlacementUtils.register("mega_oak_checked",
                    MEGA_OAK, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MEGA_OAK_SPAWN =
            FeatureUtils.register("mega_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(MEGA_OAK_CHECKED, 0.1F)), MEGA_OAK_CHECKED));

    //MEGA ACACIA
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MEGA_ACACIA = FeatureUtils.register("mega_acacia",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.ACACIA_LOG),
            new MegaJungleTrunkPlacer(9, 3, 10),
            BlockStateProvider.simple(Blocks.ACACIA_LEAVES),
            new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(1, 1, 2)).decorators(ImmutableList.of(
            new AlterGroundDecorator(BlockStateProvider.simple(Blocks.COARSE_DIRT)))).build());
    public static final Holder<PlacedFeature> MEGA_ACACIA_CHECKED =
            PlacementUtils.register("mega_acacia_checked",
                    MEGA_ACACIA, PlacementUtils.filteredByBlockSurvival(Blocks.ACACIA_SAPLING));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MEGA_ACACIA_SPAWN =
            FeatureUtils.register("mega_acacia_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(MEGA_ACACIA_CHECKED, 0.1F)), MEGA_ACACIA_CHECKED));
}


