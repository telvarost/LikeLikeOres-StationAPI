package com.github.telvarost.likelikeores.block;

import com.github.telvarost.likelikeores.LikeLikeOres;
import net.modificationstation.stationapi.api.template.block.TemplateOreBlock;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class LikeLikeOreBlock extends TemplateOreBlock {

    public LikeLikeOreBlock(String id, int textureId) {

        super(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, id), textureId);

        setHardness(3.0F);
        setResistance(5.0F);
        setSoundGroup(STONE_SOUND_GROUP);
        setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, id);
    }

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
