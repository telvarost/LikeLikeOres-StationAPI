package com.github.telvarost.likelikeores.events;

import com.github.telvarost.likelikeores.CustomOreFeature;
import com.github.telvarost.likelikeores.LikeLikeOres;
import com.github.telvarost.likelikeores.settings.BiomeGeneration;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkSource;
import net.modificationstation.stationapi.api.event.world.gen.WorldGenEvent;

import java.util.List;
import java.util.Random;

import static com.github.telvarost.likelikeores.LikeLikeOres.*;
import static com.github.telvarost.likelikeores.LikeLikeOres.SILVER_ORE;

public class ChunkDecorationListener {

    @EventListener
    public void decorate(WorldGenEvent.ChunkDecoration event) {
        likeLikeOres_decorateOres(event.world, event.worldSource, event.x, event.z, event.random);
    }

    public void likeLikeOres_decorateOres(World world, ChunkSource source, int x, int z, Random random) {
        int generationAttemptIndex;
        int xPos;
        int yPos;
        int zPos;
        int blockX = x * 16;
        int blockZ = z * 16;
        Biome biomeToDecorate = world.method_1781().getBiome(blockX + 16, blockZ + 16);

        if (LikeLikeOres.TIN_ORE_SETTINGS.settingOreGeneration.getIsEnabled()) {
            List<BiomeGeneration> biomeGenerationList = TIN_ORE_SETTINGS.settingOreBiomeGenerationList.getBiomeGenerationList();

            if (null != biomeGenerationList) {
                //for (int biomeIndex = 0; biomeIndex < biomeGenerationList.size(); biomeIndex++) {
                    BiomeGeneration biomeGeneration = biomeGenerationList.get(0);

                    //if (biomeGeneration.biome().name.equals(biomeToDecorate.name)) {
                        for(generationAttemptIndex = 0; generationAttemptIndex < biomeGeneration.generationAttempts(); ++generationAttemptIndex) {
                            xPos = blockX + random.nextInt(16);
                            yPos = biomeGeneration.heightOffset() + random.nextInt(biomeGeneration.heightRandomBound1()) + random.nextInt(biomeGeneration.heightRandomBound2());
                            zPos = blockZ + random.nextInt(16);
                            (new CustomOreFeature(biomeGeneration.hostBlockId(), TIN_ORE.id, biomeGeneration.oreCount())).generate(world, random, xPos, yPos, zPos);
                        }
                    //}
                //}
            }
        }

        if (LikeLikeOres.COPPER_ORE_SETTINGS.settingOreGeneration.getIsEnabled()) {
            List<BiomeGeneration> biomeGenerationList = COPPER_ORE_SETTINGS.settingOreBiomeGenerationList.getBiomeGenerationList();

            if (null != biomeGenerationList) {
                //for (int biomeIndex = 0; biomeIndex < biomeGenerationList.size(); biomeIndex++) {
                    BiomeGeneration biomeGeneration = biomeGenerationList.get(0);

                    //if (biomeGeneration.biome().name.equals(biomeToDecorate.name)) {
                        for(generationAttemptIndex = 0; generationAttemptIndex < biomeGeneration.generationAttempts(); ++generationAttemptIndex) {
                            xPos = blockX + random.nextInt(16);
                            yPos = biomeGeneration.heightOffset() + random.nextInt(biomeGeneration.heightRandomBound1()) + random.nextInt(biomeGeneration.heightRandomBound2());
                            zPos = blockZ + random.nextInt(16);
                            (new CustomOreFeature(biomeGeneration.hostBlockId(), COPPER_ORE.id, biomeGeneration.oreCount())).generate(world, random, xPos, yPos, zPos);
                        }
                    //}
                //}
            }
        }

        if (LikeLikeOres.SILVER_ORE_SETTINGS.settingOreGeneration.getIsEnabled()) {
            List<BiomeGeneration> biomeGenerationList = SILVER_ORE_SETTINGS.settingOreBiomeGenerationList.getBiomeGenerationList();

            if (null != biomeGenerationList) {
                //for (int biomeIndex = 0; biomeIndex < biomeGenerationList.size(); biomeIndex++) {
                    BiomeGeneration biomeGeneration = biomeGenerationList.get(0);

                    //if (biomeGeneration.biome().name.equals(biomeToDecorate.name)) {
                        for(generationAttemptIndex = 0; generationAttemptIndex < biomeGeneration.generationAttempts(); ++generationAttemptIndex) {
                            xPos = blockX + random.nextInt(16);
                            yPos = biomeGeneration.heightOffset() + random.nextInt(biomeGeneration.heightRandomBound1()) + random.nextInt(biomeGeneration.heightRandomBound2());
                            zPos = blockZ + random.nextInt(16);
                            (new CustomOreFeature(biomeGeneration.hostBlockId(), SILVER_ORE.id, biomeGeneration.oreCount())).generate(world, random, xPos, yPos, zPos);
                        }
                    //}
                //}
            }
        }
    }
}

