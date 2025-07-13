package com.github.telvarost.likelikeores.block;

import com.github.telvarost.likelikeores.LikeLikeOres;
import net.modificationstation.stationapi.api.template.block.TemplateOreStorageBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class LikeLikeOreStorageBlock extends TemplateOreStorageBlock {

    public LikeLikeOreStorageBlock(String id, int textureId) {

        super(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, id), textureId);

        setHardness(3.0F);
        setResistance(5.0F);
        setSoundGroup(METAL_SOUND_GROUP);
        setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, id);
    }
}

