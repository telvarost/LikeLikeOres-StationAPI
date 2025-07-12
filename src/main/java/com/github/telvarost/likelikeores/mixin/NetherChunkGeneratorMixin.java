package com.github.telvarost.likelikeores.mixin;

import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkSource;
import net.minecraft.world.gen.chunk.NetherChunkGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(NetherChunkGenerator.class)
public class NetherChunkGeneratorMixin {

    @Shadow private Random random;

    @Shadow private World world;

    @Inject(
            method = "decorate",
            at = @At(
                    value = "INVOKE",
                    target = "Ljava/util/Random;nextInt(I)I",
                    ordinal = 3
            ),
            cancellable = true
    )
    public void likeLikeOres_decorateUnderground(ChunkSource source, int x, int z, CallbackInfo ci) {
//        int generationAttemptIndex;
//        int xPos;
//        int yPos;
//        int zPos;
//        int blockX = x * 16;
//        int blockZ = z * 16;
//        Biome biomeToDecorate = this.world.method_1781().getBiome(blockX + 16, blockZ + 16);
//
//        if (LikeLikeOres.SILVER_ORE_SETTINGS.settingOreGeneration.isEnabled) {
//            for(generationAttemptIndex = 0; generationAttemptIndex < 40; ++generationAttemptIndex) {
//                xPos = blockX + this.random.nextInt(16) + 8;
//                yPos = this.random.nextInt(120) + 4;
//                zPos = blockZ + this.random.nextInt(16) + 8;
//                (new NetherLavaSpringFeature(Block.CLAY.id)).generate(this.world, this.random, xPos, yPos, zPos);
//            }
//        }
    }
}
