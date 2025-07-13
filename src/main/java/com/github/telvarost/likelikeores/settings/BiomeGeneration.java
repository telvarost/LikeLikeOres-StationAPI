package com.github.telvarost.likelikeores.settings;

import net.minecraft.world.biome.Biome;

public record BiomeGeneration (
        Biome biome,
        int generationAttempts,
        int heightOffset,
        int heightRandomBound1,
        int heightRandomBound2,
        int oreCount,
        int hostBlockId
) {}
