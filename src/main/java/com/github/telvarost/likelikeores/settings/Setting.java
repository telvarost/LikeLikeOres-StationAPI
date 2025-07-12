package com.github.telvarost.likelikeores.settings;

public class Setting {
    public boolean isEnabled = false;
    public int priority = -1;

    public Setting(boolean initIsEnabled, int initPriority) {
        isEnabled = initIsEnabled;
        priority = initPriority;
    }

    public boolean setIsEnabled(boolean attemptIsEnabled, int attemptPriority) {
        boolean wasSettingSet = false;

        if (priority < attemptPriority) {
            isEnabled = attemptIsEnabled;
            priority = attemptPriority;
            wasSettingSet = true;
        }

        return wasSettingSet;
    }
}
