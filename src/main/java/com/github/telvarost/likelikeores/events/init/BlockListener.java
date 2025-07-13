package com.github.telvarost.likelikeores.events.init;

import com.github.telvarost.likelikeores.LikeLikeOres;
import com.github.telvarost.likelikeores.block.MetalOreBlock;
import com.github.telvarost.likelikeores.block.MetalOreStorageBlock;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.util.Identifier;

import static net.minecraft.block.Block.*;

public class BlockListener {
    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        LikeLikeOres.TIN_ORE    = new MetalOreBlock(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "tin_ore")   , LikeLikeOres.TIN_ORE_SETTINGS.settingOreTextureId.getTextureId())   .setHardness(3.0F).setResistance(5.0F).setSoundGroup(STONE_SOUND_GROUP).setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "tin_ore");
        LikeLikeOres.COPPER_ORE = new MetalOreBlock(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "copper_ore"), LikeLikeOres.COPPER_ORE_SETTINGS.settingOreTextureId.getTextureId()).setHardness(3.0F).setResistance(5.0F).setSoundGroup(STONE_SOUND_GROUP).setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "copper_ore");
        LikeLikeOres.SILVER_ORE = new MetalOreBlock(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "silver_ore"), LikeLikeOres.SILVER_ORE_SETTINGS.settingOreTextureId.getTextureId()).setHardness(3.0F).setResistance(5.0F).setSoundGroup(STONE_SOUND_GROUP).setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "silver_ore");
        LikeLikeOres.TIN_BLOCK  = new MetalOreStorageBlock(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "tin_block"), LikeLikeOres.TIN_INGOT_SETTINGS.settingIngotBlockTextureId.getTextureId()).setHardness(3.0F).setResistance(5.0F).setSoundGroup(STONE_SOUND_GROUP).setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "tin_block");
        LikeLikeOres.COPPER_BLOCK  = new MetalOreStorageBlock(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "copper_block"), LikeLikeOres.TIN_INGOT_SETTINGS.settingIngotBlockTextureId.getTextureId()).setHardness(3.0F).setResistance(5.0F).setSoundGroup(STONE_SOUND_GROUP).setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "copper_block");
        LikeLikeOres.SILVER_BLOCK  = new MetalOreStorageBlock(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "silver_block"), LikeLikeOres.TIN_INGOT_SETTINGS.settingIngotBlockTextureId.getTextureId()).setHardness(3.0F).setResistance(5.0F).setSoundGroup(STONE_SOUND_GROUP).setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "silver_block");
        LikeLikeOres.BRONZE_BLOCK  = new MetalOreStorageBlock(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "bronze_block"), LikeLikeOres.TIN_INGOT_SETTINGS.settingIngotBlockTextureId.getTextureId()).setHardness(3.0F).setResistance(5.0F).setSoundGroup(STONE_SOUND_GROUP).setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "bronze_block");
        LikeLikeOres.ELECTRUM_BLOCK  = new MetalOreStorageBlock(Identifier.of(LikeLikeOres.LIKE_LIKE_ORES, "electrum_block"), LikeLikeOres.TIN_INGOT_SETTINGS.settingIngotBlockTextureId.getTextureId()).setHardness(3.0F).setResistance(5.0F).setSoundGroup(STONE_SOUND_GROUP).setTranslationKey(LikeLikeOres.LIKE_LIKE_ORES, "electrum_block");

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
