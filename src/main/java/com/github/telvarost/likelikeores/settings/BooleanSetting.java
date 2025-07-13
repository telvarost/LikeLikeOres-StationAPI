package com.github.telvarost.likelikeores.settings;

public class BooleanSetting {
    private boolean isEnabled = false;
    private int priority = -1;

    public BooleanSetting(boolean initIsEnabled, int initPriority) {
        isEnabled = initIsEnabled;
        priority = initPriority;
    }

    public boolean getIsEnabled() {
        return isEnabled;
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
