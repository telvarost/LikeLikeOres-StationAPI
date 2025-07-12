package com.github.telvarost.likelikeores;

import com.github.telvarost.likelikeores.settings.OreSettings;
import com.github.telvarost.likelikeores.settings.Setting;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class LikeLikeOres {
    //public static final Namespace NAMESPACE = Namespace.resolve();
    @Entrypoint.Namespace
    public static Namespace LIKE_LIKE_ORES = Null.get();

    public static int TIN_ORE_TEXTURE = 0;
    public static int COPPER_ORE_TEXTURE = 0;
    public static int SILVER_ORE_TEXTURE = 0;

    public static Block TIN_ORE;
    public static Block COPPER_ORE;
    public static Block SILVER_ORE;
    public static Block[] blocks;

    public static OreSettings TIN_ORE_SETTINGS = new OreSettings();
    public static OreSettings COPPER_ORE_SETTINGS = new OreSettings();
    public static OreSettings SILVER_ORE_SETTINGS = new OreSettings();

    public static Item TIN_INGOT;
    public static Item COPPER_INGOT;
    public static Item SILVER_INGOT;
    public static Item BRONZE_INGOT;
    public static Item ELECTRUM_INGOT;
    public static Item[] items;

    public static Setting TIN_INGOT_SETTING      = new Setting(false, 0);
    public static Setting COPPER_INGOT_SETTING   = new Setting(false, 0);
    public static Setting SILVER_INGOT_SETTING   = new Setting(false, 0);
    public static Setting BRONZE_INGOT_SETTING   = new Setting(false, 0);
    public static Setting ELECTRUM_INGOT_SETTING = new Setting(false, 0);
}
