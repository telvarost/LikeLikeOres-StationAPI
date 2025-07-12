package com.github.telvarost.likelikeores.events.init;

import com.github.telvarost.likelikeores.LikeLikeOres;
import com.github.telvarost.likelikeores.item.IngotItem;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;

public class ItemListener {
    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        LikeLikeOres.TIN_INGOT      = new IngotItem(LikeLikeOres.LIKE_LIKE_ORES.id("tin_ingot"))     .setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "tin_ingot");
        LikeLikeOres.COPPER_INGOT   = new IngotItem(LikeLikeOres.LIKE_LIKE_ORES.id("copper_ingot"))  .setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "copper_ingot");
        LikeLikeOres.SILVER_INGOT   = new IngotItem(LikeLikeOres.LIKE_LIKE_ORES.id("silver_ingot"))  .setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "silver_ingot");
        LikeLikeOres.BRONZE_INGOT   = new IngotItem(LikeLikeOres.LIKE_LIKE_ORES.id("bronze_ingot"))  .setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "bronze_ingot");
        LikeLikeOres.ELECTRUM_INGOT = new IngotItem(LikeLikeOres.LIKE_LIKE_ORES.id("electrum_ingot")).setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "electrum_ingot");

        LikeLikeOres.items = new Item[]
        { LikeLikeOres.TIN_INGOT
        , LikeLikeOres.COPPER_INGOT
        , LikeLikeOres.SILVER_INGOT
        , LikeLikeOres.BRONZE_INGOT
        , LikeLikeOres.ELECTRUM_INGOT
        };
    }
}