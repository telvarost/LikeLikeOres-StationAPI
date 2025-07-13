package com.github.telvarost.likelikeores;

import com.github.telvarost.likelikeores.settings.IngotSettings;
import com.github.telvarost.likelikeores.settings.OreSettings;
import com.github.telvarost.likelikeores.settings.BooleanSetting;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class LikeLikeOres {
    //public static final Namespace NAMESPACE = Namespace.resolve();
    @Entrypoint.Namespace
    public static Namespace LIKE_LIKE_ORES = Null.get();

    public static Item[] items;
    public static Block[] blocks;

    public static Block TIN_ORE;
    public static Block COPPER_ORE;
    public static Block SILVER_ORE;

    public static OreSettings TIN_ORE_SETTINGS = new OreSettings();
    public static OreSettings COPPER_ORE_SETTINGS = new OreSettings();
    public static OreSettings SILVER_ORE_SETTINGS = new OreSettings();

    public static Item TIN_INGOT;
    public static Item COPPER_INGOT;
    public static Item SILVER_INGOT;
    public static Item BRONZE_INGOT;
    public static Item ELECTRUM_INGOT;

    public static Block TIN_BLOCK;
    public static Block COPPER_BLOCK;
    public static Block SILVER_BLOCK;
    public static Block BRONZE_BLOCK;
    public static Block ELECTRUM_BLOCK;

    public static IngotSettings TIN_INGOT_SETTINGS = new IngotSettings();
    public static IngotSettings COPPER_INGOT_SETTINGS = new IngotSettings();
    public static IngotSettings SILVER_INGOT_SETTINGS = new IngotSettings();
    public static IngotSettings BRONZE_INGOT_SETTINGS = new IngotSettings();
    public static IngotSettings ELECTRUM_INGOT_SETTINGS = new IngotSettings();
}
