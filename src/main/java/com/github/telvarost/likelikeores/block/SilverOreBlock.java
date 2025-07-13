package com.github.telvarost.likelikeores.block;

import com.github.telvarost.likelikeores.LikeLikeOres;
import net.modificationstation.stationapi.api.template.block.TemplateOreBlock;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class SilverOreBlock extends TemplateOreBlock {
    public SilverOreBlock(Identifier identifier, int textureId) {
        super(identifier, textureId);
    }

//    @Override
//    public int getTexture(int side) {
//        return LikeLikeOres.SILVER_ORE_SETTINGS.integerSettingOreGeneration.getValue();
//    }

    @Override
    public int getDroppedItemId(int blockMeta, Random random) {
        return this.id;
    }

    @Override
    public int getDroppedItemCount(Random random) {
        return 1;
    }

    @Override
    protected int getDroppedItemMeta(int blockMeta) {
        return 0;
    }
}
