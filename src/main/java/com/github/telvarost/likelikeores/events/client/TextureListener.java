package com.github.telvarost.likelikeores.events.client;

import com.github.telvarost.likelikeores.LikeLikeOres;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.util.Identifier;

public class TextureListener {

    @EventListener
    public void registerTextures(TextureRegisterEvent event) {
        LikeLikeOres.TIN_ORE_TEXTURE    = Atlases.getTerrain().addTexture(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "block/tin_ore")).index;
        LikeLikeOres.COPPER_ORE_TEXTURE = Atlases.getTerrain().addTexture(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "block/copper_ore")).index;
        LikeLikeOres.SILVER_ORE_TEXTURE = Atlases.getTerrain().addTexture(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "block/silver_ore")).index;

        LikeLikeOres.TIN_INGOT     .setTexture(LikeLikeOres.LIKE_LIKE_ORES.id("item/tin_ingot"));
        LikeLikeOres.COPPER_INGOT  .setTexture(LikeLikeOres.LIKE_LIKE_ORES.id("item/copper_ingot"));
        LikeLikeOres.SILVER_INGOT  .setTexture(LikeLikeOres.LIKE_LIKE_ORES.id("item/silver_ingot"));
        LikeLikeOres.BRONZE_INGOT  .setTexture(LikeLikeOres.LIKE_LIKE_ORES.id("item/bronze_ingot"));
        LikeLikeOres.ELECTRUM_INGOT.setTexture(LikeLikeOres.LIKE_LIKE_ORES.id("item/electrum_ingot"));
    }
}
