package com.github.telvarost.likelikeores.settings;

import java.util.ArrayList;

public class OreSettings {
    public BlockTextureSetting settingOreTextureId = new BlockTextureSetting(0, -1);
    public BooleanSetting settingOreGeneration = new BooleanSetting(true, 0);
    public BiomeGenerationListSetting settingOreBiomeGenerationList = new BiomeGenerationListSetting(new ArrayList<>(), 0);
    public BooleanSetting settingOreSmeltingRecipe = new BooleanSetting(true, 0);
}
