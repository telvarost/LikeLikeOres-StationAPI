package com.github.telvarost.likelikeores;

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

    public static BooleanSetting tinIngotBooleanSetting = new BooleanSetting(false, 0);
    public static BooleanSetting copperIngotBooleanSetting = new BooleanSetting(false, 0);
    public static BooleanSetting silverIngotBooleanSetting = new BooleanSetting(false, 0);
    public static BooleanSetting bronzeIngotBooleanSetting = new BooleanSetting(false, 0);
    public static BooleanSetting electrumIngotBooleanSetting = new BooleanSetting(false, 0);
}
