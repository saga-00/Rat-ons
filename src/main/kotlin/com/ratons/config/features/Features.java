package com.ratons.config.features;

import at.hannibal2.skyhanni.deps.moulconfig.Config;
import at.hannibal2.skyhanni.deps.moulconfig.annotations.Category;
import com.google.gson.annotations.Expose;
import com.ratons.Ratons;
import com.ratons.config.features.esp.EspConfig;
import com.ratons.config.features.instances.InstancesConfig;

public class Features extends Config {

    @Override
    public boolean shouldAutoFocusSearchbar() {
        return true;
    }

    @Override
    public String getTitle() {
        return Ratons.MOD_NAME + " " + Ratons.VERSION;
    }

    @Override
    public void saveNow() {
        Ratons.Companion.getManagedConfig().saveToFile();
    }

    @Expose
    @Category(name = "About", desc = "")
    public About about = new About();

    @Expose
    @Category(name = "Instances", desc = "Features for instanced content.")
    public InstancesConfig instancesConfig = new InstancesConfig();

    @Expose
    @Category(name = "Esp", desc = "Features for highlighting mobs.")
    public EspConfig espConfig = new EspConfig();
}
