package com.github.telvarost.likelikeores.events.init;

import com.github.telvarost.likelikeores.LikeLikeOres;
import com.github.telvarost.likelikeores.block.CopperOreBlock;
import com.github.telvarost.likelikeores.block.SilverOreBlock;
import com.github.telvarost.likelikeores.block.TinOreBlock;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.util.Identifier;

import static net.minecraft.block.Block.*;

public class BlockListener {
    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        LikeLikeOres.TIN_ORE    = new TinOreBlock   (Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "tin_ore")   , LikeLikeOres.TIN_ORE_TEXTURE)   .setHardness(3.0F).setResistance(5.0F).setSoundGroup(STONE_SOUND_GROUP).setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "tin_ore");
        LikeLikeOres.COPPER_ORE = new CopperOreBlock(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "copper_ore"), LikeLikeOres.COPPER_ORE_TEXTURE).setHardness(3.0F).setResistance(5.0F).setSoundGroup(STONE_SOUND_GROUP).setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "copper_ore");
        LikeLikeOres.SILVER_ORE = new SilverOreBlock(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "silver_ore"), LikeLikeOres.SILVER_ORE_TEXTURE).setHardness(3.0F).setResistance(5.0F).setSoundGroup(STONE_SOUND_GROUP).setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "silver_ore");

        LikeLikeOres.blocks = new Block[]
        { LikeLikeOres.TIN_ORE
        , LikeLikeOres.COPPER_ORE
        , LikeLikeOres.SILVER_ORE
        };
    }
}
