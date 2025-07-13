package com.github.telvarost.likelikeores.events.init;

import com.github.telvarost.likelikeores.LikeLikeOres;
import com.github.telvarost.likelikeores.block.LikeLikeOreBlock;
import com.github.telvarost.likelikeores.block.LikeLikeOreStorageBlock;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.util.Identifier;

import static net.minecraft.block.Block.*;

public class BlockListener {

    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {

        LikeLikeOres.TIN_ORE = new LikeLikeOreBlock("tin_ore", LikeLikeOres.TIN_ORE_SETTINGS.settingOreTextureId.getTextureId());
        LikeLikeOres.COPPER_ORE = new LikeLikeOreBlock("copper_ore", LikeLikeOres.COPPER_ORE_SETTINGS.settingOreTextureId.getTextureId());
        LikeLikeOres.SILVER_ORE = new LikeLikeOreBlock("silver_ore", LikeLikeOres.SILVER_ORE_SETTINGS.settingOreTextureId.getTextureId());

        LikeLikeOres.TIN_BLOCK  = new LikeLikeOreStorageBlock("tin_block", LikeLikeOres.TIN_INGOT_SETTINGS.settingIngotBlockTextureId.getTextureId());
        LikeLikeOres.COPPER_BLOCK  = new LikeLikeOreStorageBlock("copper_block", LikeLikeOres.TIN_INGOT_SETTINGS.settingIngotBlockTextureId.getTextureId());
        LikeLikeOres.SILVER_BLOCK  = new LikeLikeOreStorageBlock("silver_block", LikeLikeOres.TIN_INGOT_SETTINGS.settingIngotBlockTextureId.getTextureId());
        LikeLikeOres.BRONZE_BLOCK  = new LikeLikeOreStorageBlock("bronze_block", LikeLikeOres.TIN_INGOT_SETTINGS.settingIngotBlockTextureId.getTextureId());
        LikeLikeOres.ELECTRUM_BLOCK  = new LikeLikeOreStorageBlock("electrum_block", LikeLikeOres.TIN_INGOT_SETTINGS.settingIngotBlockTextureId.getTextureId());

        LikeLikeOres.blocks = new Block[]
        { LikeLikeOres.TIN_ORE
        , LikeLikeOres.COPPER_ORE
        , LikeLikeOres.SILVER_ORE
        , LikeLikeOres.TIN_BLOCK
        , LikeLikeOres.COPPER_BLOCK
        , LikeLikeOres.SILVER_BLOCK
        , LikeLikeOres.BRONZE_BLOCK
        , LikeLikeOres.ELECTRUM_BLOCK
        };
    }
}
