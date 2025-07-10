package com.github.telvarost.likelikeores.mixin;

import com.github.telvarost.likelikeores.Config;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkSource;
import net.minecraft.world.gen.chunk.NetherChunkGenerator;
import net.minecraft.world.gen.feature.NetherLavaSpringFeature;
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
    public void likeLikeOres_decorateCaveSand(ChunkSource source, int x, int z, CallbackInfo ci) {
        if (Config.config.ENABLE_NETHER_CLAY_GENERATION) {
            int var4 = x * 16;
            int var5 = z * 16;
            int var6;
            int var7;
            int var8;
            int var9;
            for(var6 = 0; var6 < 40; ++var6) {
                var7 = var4 + this.random.nextInt(16) + 8;
                var8 = this.random.nextInt(120) + 4;
                var9 = var5 + this.random.nextInt(16) + 8;
                (new NetherLavaSpringFeature(Block.CLAY.id)).generate(this.world, this.random, var7, var8, var9);
            }
        }
    }
}
