package com.github.telvarost.likelikeores.settings;

import java.util.ArrayList;
import java.util.List;

public class BiomeGenerationListSetting {
    private List<BiomeGeneration> biomeGenerationList = new ArrayList<>();
    private int priority = -1;

    public BiomeGenerationListSetting(List<BiomeGeneration> initBiomeGenerationList, int initPriority) {
        biomeGenerationList = initBiomeGenerationList;
        priority = initPriority;
    }

    public List<BiomeGeneration> getBiomeGenerationList() {
        return biomeGenerationList;
    }

    public boolean setIsEnabled(List<BiomeGeneration> attemptBiomeGenerationList, int attemptPriority) {
        boolean wasSettingSet = false;

        if (priority < attemptPriority) {
            biomeGenerationList = attemptBiomeGenerationList;
            priority = attemptPriority;
            wasSettingSet = true;
        }

        return wasSettingSet;
    }
}
