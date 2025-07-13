package com.github.telvarost.likelikeores.events.init;

import com.github.telvarost.likelikeores.LikeLikeOres;
import com.github.telvarost.likelikeores.settings.BiomeGeneration;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.world.dimension.Dimension;
import net.modificationstation.stationapi.api.event.init.InitFinishedEvent;
import net.modificationstation.stationapi.api.registry.DimensionRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.List;

import static net.modificationstation.stationapi.api.world.dimension.VanillaDimensions.OVERWORLD;
import static net.modificationstation.stationapi.api.world.dimension.VanillaDimensions.SKYLANDS;

public class InitFinishedListener {

    @EventListener
    public static void scanDimensions(InitFinishedEvent event) {
        DimensionRegistry.INSTANCE.forEach(dimensionContainer -> {
            List<BiomeGeneration> tinBiomeGenerationList = LikeLikeOres.TIN_ORE_SETTINGS.settingOreBiomeGenerationList.getBiomeGenerationList();
            List<BiomeGeneration> copperBiomeGenerationList = LikeLikeOres.COPPER_ORE_SETTINGS.settingOreBiomeGenerationList.getBiomeGenerationList();
            List<BiomeGeneration> silverBiomeGenerationList = LikeLikeOres.SILVER_ORE_SETTINGS.settingOreBiomeGenerationList.getBiomeGenerationList();

            Dimension dimension = dimensionContainer.factory.get();
            dimension.getBiomes().forEach(biome -> {
                Identifier dimensionIdentifier = DimensionRegistry.INSTANCE.getIdByLegacyId(dimension.id).orElseThrow();

                if (dimensionIdentifier.equals(OVERWORLD)) {
                    tinBiomeGenerationList.add(new BiomeGeneration(biome, 8, 0, 64, 0, 8, Block.STONE.id));
                    copperBiomeGenerationList.add(new BiomeGeneration(biome, 8, 0, 64, 0, 8, Block.STONE.id));
                    silverBiomeGenerationList.add(new BiomeGeneration(biome, 8, 0, 64, 0, 8, Block.STONE.id));
                } else if (dimensionIdentifier.equals(SKYLANDS)) {
                    tinBiomeGenerationList.add(new BiomeGeneration(biome, 8, 0, 64, 0, 8, Block.STONE.id));
                    copperBiomeGenerationList.add(new BiomeGeneration(biome, 8, 0, 64, 0, 8, Block.STONE.id));
                    silverBiomeGenerationList.add(new BiomeGeneration(biome, 8, 0, 64, 0, 8, Block.STONE.id));
                }
            });
        });
    }
}
