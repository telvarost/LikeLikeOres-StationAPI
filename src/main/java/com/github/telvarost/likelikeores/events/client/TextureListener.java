package com.github.telvarost.likelikeores.events.client;

import com.github.telvarost.likelikeores.LikeLikeOres;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.util.Identifier;

public class TextureListener {

    @EventListener
    public void registerTextures(TextureRegisterEvent event) {
        int tinOreTextureId = Atlases.getTerrain().addTexture(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "block/tin_ore")).index;
        int copperOreTextureId = Atlases.getTerrain().addTexture(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "block/copper_ore")).index;
        int silverOreTextureId = Atlases.getTerrain().addTexture(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "block/silver_ore")).index;

        LikeLikeOres.TIN_ORE_SETTINGS.settingOreTextureId   .setTextureId(LikeLikeOres.TIN_ORE   , tinOreTextureId, 0);
        LikeLikeOres.COPPER_ORE_SETTINGS.settingOreTextureId.setTextureId(LikeLikeOres.COPPER_ORE, copperOreTextureId, 0);
        LikeLikeOres.SILVER_ORE_SETTINGS.settingOreTextureId.setTextureId(LikeLikeOres.SILVER_ORE, silverOreTextureId, 0);

        LikeLikeOres.TIN_INGOT     .setTexture(LikeLikeOres.LIKE_LIKE_ORES.id("item/tin_ingot"));
        LikeLikeOres.COPPER_INGOT  .setTexture(LikeLikeOres.LIKE_LIKE_ORES.id("item/copper_ingot"));
        LikeLikeOres.SILVER_INGOT  .setTexture(LikeLikeOres.LIKE_LIKE_ORES.id("item/silver_ingot"));
        LikeLikeOres.BRONZE_INGOT  .setTexture(LikeLikeOres.LIKE_LIKE_ORES.id("item/bronze_ingot"));
        LikeLikeOres.ELECTRUM_INGOT.setTexture(LikeLikeOres.LIKE_LIKE_ORES.id("item/electrum_ingot"));
    }
}
