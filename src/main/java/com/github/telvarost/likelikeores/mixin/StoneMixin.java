package com.github.telvarost.likelikeores.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.StoneBlock;
import net.minecraft.block.material.Material;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(StoneBlock.class)
public class StoneMixin extends Block {
    public StoneMixin(int id, Material material) {
        super(id, material);
    }

//    @Override
//    public boolean isFullCube() {
//        return false;
//    }
//
//    @Environment(EnvType.CLIENT)
//    @Override
//    public boolean isSideVisible(BlockView blockView, int x, int y, int z, int side) {
//        return false;
//    }
}
