package com.github.telvarost.likelikeores.settings;

import net.minecraft.block.Block;

public class BlockTextureSetting {
    private int textureId = 0;
    private int priority = -1;

    public BlockTextureSetting(int initTextureId, int initPriority) {
        textureId = initTextureId;
        priority = initPriority;
    }

    public int getTextureId() {
        return textureId;
    }

    public boolean setTextureId(Block attemptBlock, int attemptTextureId, int attemptPriority) {
        boolean wasSettingSet = false;

        if (  priority < attemptPriority
           && null != attemptBlock
        ) {
            attemptBlock.textureId = attemptTextureId;
            textureId = attemptTextureId;
            priority = attemptPriority;
            wasSettingSet = true;
        }

        return wasSettingSet;
    }
}
