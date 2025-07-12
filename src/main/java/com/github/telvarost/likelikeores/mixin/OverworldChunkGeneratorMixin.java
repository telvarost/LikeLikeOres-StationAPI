package com.github.telvarost.likelikeores.mixin;

import com.github.telvarost.likelikeores.LikeLikeOres;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkSource;
import net.minecraft.world.gen.chunk.OverworldChunkGenerator;
import net.minecraft.world.gen.feature.OreFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

import static com.github.telvarost.likelikeores.LikeLikeOres.*;

@Mixin(OverworldChunkGenerator.class)
public class OverworldChunkGeneratorMixin {

    @Shadow private Random random;

    @Shadow private World world;

    @Inject(
            method = "decorate",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/World;method_1781()Lnet/minecraft/world/biome/source/BiomeSource;",
                    ordinal = 1
            ),
            cancellable = true
    )
    public void likeLikeOres_decorateUnderground(ChunkSource source, int x, int z, CallbackInfo ci) {
        int generationAttemptIndex;
        int xPos;
        int yPos;
        int zPos;
        int blockX = x * 16;
        int blockZ = z * 16;
        Biome biomeToDecorate = this.world.method_1781().getBiome(blockX + 16, blockZ + 16);

        if (  LikeLikeOres.TIN_ORE_SETTINGS.settingOreGeneration.isEnabled
           && (  Biome.TAIGA      == biomeToDecorate
              || Biome.TUNDRA     == biomeToDecorate
              || Biome.ICE_DESERT == biomeToDecorate
              )
        ) {
            for(generationAttemptIndex = 0; generationAttemptIndex < 10; ++generationAttemptIndex) {
                xPos = blockX + this.random.nextInt(16);
                yPos = this.random.nextInt(8) + this.random.nextInt(40);
                zPos = blockZ + this.random.nextInt(16);
                (new OreFeature(TIN_ORE.id, 24)).generate(this.world, this.random, xPos, yPos, zPos);
            }
        }

        if (  LikeLikeOres.COPPER_ORE_SETTINGS.settingOreGeneration.isEnabled
           && (  Biome.SWAMPLAND     == biomeToDecorate
              )
        ) {
            for(generationAttemptIndex = 0; generationAttemptIndex < 5; ++generationAttemptIndex) {
                xPos = blockX + this.random.nextInt(16);
                yPos = this.random.nextInt(8) + this.random.nextInt(40);
                zPos = blockZ + this.random.nextInt(16);
                (new OreFeature(COPPER_ORE.id, 12)).generate(this.world, this.random, xPos, yPos, zPos);
            }
        }

        if (  LikeLikeOres.SILVER_ORE_SETTINGS.settingOreGeneration.isEnabled
           && (  Biome.RAINFOREST    == biomeToDecorate
              || Biome.DESERT        == biomeToDecorate
              || Biome.SAVANNA       == biomeToDecorate
              )
        ) {
            for(generationAttemptIndex = 0; generationAttemptIndex < 10; ++generationAttemptIndex) {
                xPos = blockX + this.random.nextInt(16);
                yPos = this.random.nextInt(8) + this.random.nextInt(40);
                zPos = blockZ + this.random.nextInt(16);
                (new OreFeature(SILVER_ORE.id, 24)).generate(this.world, this.random, xPos, yPos, zPos);
            }
        }
    }
}
