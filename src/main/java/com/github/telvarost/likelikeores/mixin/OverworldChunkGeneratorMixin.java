package com.github.telvarost.likelikeores.mixin;

import com.github.telvarost.likelikeores.Config;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkSource;
import net.minecraft.world.gen.chunk.OverworldChunkGenerator;
import net.minecraft.world.gen.feature.OreFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(OverworldChunkGenerator.class)
public class OverworldChunkGeneratorMixin {

    @Shadow private Random random;

    @Shadow private World world;

    @Unique
    private Biome biomeToDecorate;

    @Inject(
            method = "decorate",
            at = @At("HEAD"),
            cancellable = true
    )
    public void likeLikeOres_decorateGetBiome(ChunkSource source, int x, int z, CallbackInfo ci) {
        int var4 = x * 16;
        int var5 = z * 16;
        biomeToDecorate = this.world.method_1781().getBiome(var4 + 16, var5 + 16);
    }

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
        if (  Config.config.ENABLE_CAVE_CLAY_GENERATION
           || Config.config.ENABLE_CAVE_ICE_GENERATION
           || Config.config.ENABLE_CAVE_SAND_GENERATION
        ) {
            int var4 = x * 16;
            int var5 = z * 16;
            int var13;
            int var14;
            int var15;
            int var16;

            if (  Config.config.ENABLE_CAVE_ICE_GENERATION
               && (  Biome.TAIGA      == biomeToDecorate
                  || Biome.TUNDRA     == biomeToDecorate
                  || Biome.ICE_DESERT == biomeToDecorate
                  )
            ) {
                for(var13 = 0; var13 < 10; ++var13) {
                    var14 = var4 + this.random.nextInt(16);
                    var15 = this.random.nextInt(8) + this.random.nextInt(40);
                    var16 = var5 + this.random.nextInt(16);
                    (new OreFeature(Block.ICE.id, 24)).generate(this.world, this.random, var14, var15, var16);
                }
            }

            if (  Config.config.ENABLE_CAVE_CLAY_GENERATION
               && (  Biome.SWAMPLAND     == biomeToDecorate
                  )
            ) {
                for(var13 = 0; var13 < 5; ++var13) {
                    var14 = var4 + this.random.nextInt(16);
                    var15 = this.random.nextInt(8) + this.random.nextInt(40);
                    var16 = var5 + this.random.nextInt(16);
                    (new OreFeature(Block.CLAY.id, 12)).generate(this.world, this.random, var14, var15, var16);
                }
            }

            if (  Config.config.ENABLE_CAVE_SAND_GENERATION
               && (  Biome.RAINFOREST    == biomeToDecorate
                  || Biome.DESERT        == biomeToDecorate
                  || Biome.SAVANNA       == biomeToDecorate
                  )
            ) {
                for(var13 = 0; var13 < 10; ++var13) {
                    var14 = var4 + this.random.nextInt(16);
                    var15 = this.random.nextInt(8) + this.random.nextInt(40);
                    var16 = var5 + this.random.nextInt(16);
                    (new OreFeature(Block.SAND.id, 24)).generate(this.world, this.random, var14, var15, var16);
                }
            }

            if (  Config.config.ENABLE_CAVE_SANDSTONE_GENERATION
               && (  Biome.PLAINS        == biomeToDecorate
                  || Biome.SHRUBLAND     == biomeToDecorate
                  )
            ) {
                for(var13 = 0; var13 < 10; ++var13) {
                    var14 = var4 + this.random.nextInt(16);
                    var15 = this.random.nextInt(8) + this.random.nextInt(40);
                    var16 = var5 + this.random.nextInt(16);
                    (new OreFeature(Block.SANDSTONE.id, 24)).generate(this.world, this.random, var14, var15, var16);
                }
            }
        }

        if (Config.config.ENABLE_DESERT_STONE_AND_GRAVEL_SWAP) {
            int xLocation = x * 16;
            int zLocation = z * 16;

            for (int xOffset = 0; xOffset < 16; xOffset++) {
                for (int zOffset = 0; zOffset < 16; zOffset++) {
                    int xExact = xLocation + xOffset + 16;
                    int zExact = zLocation + zOffset + 16;

                    Biome biome = this.world.method_1781().getBiome(xExact, zExact);
                    if (Biome.DESERT == biome) {
                        for (int yLevel = 0; yLevel < this.world.getHeight(); yLevel++) {
                            int blockId = this.world.getBlockId(xExact, yLevel, zExact);

                            if (0 == blockId) {
                                /* Do nothing */
                            } else if (Block.STONE.id == blockId) {
                                this.world.setBlockWithoutNotifyingNeighbors(xExact, yLevel, zExact, Block.SANDSTONE.id);
                            } else if (Block.GRAVEL.id == blockId) {
                                this.world.setBlockWithoutNotifyingNeighbors(xExact, yLevel, zExact, Block.SAND.id);
                            }
                        }
                    }
                }
            }
        }
    }
}
