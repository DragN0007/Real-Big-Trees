package com.dragn0007.realbigtrees.world.gen;


import com.dragn0007.realbigtrees.world.feature.RBTPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Set;

public class RBTTreeGeneration {

    public static void generateTrees(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(ForgeRegistries.Keys.BIOMES, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);


        if (types.contains(BiomeDictionary.Type.RARE) && (types.contains(BiomeDictionary.Type.FOREST))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(RBTPlacedFeatures.MEGA_BIRCH_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.RARE) && (types.contains(BiomeDictionary.Type.FOREST) || (types.contains(BiomeDictionary.Type.RARE) && (types.contains(BiomeDictionary.Type.PLAINS))))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(RBTPlacedFeatures.MEGA_OAK_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.RARE) && (types.contains(BiomeDictionary.Type.SAVANNA))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(RBTPlacedFeatures.MEGA_ACACIA_PLACED);
        }
    }
}
