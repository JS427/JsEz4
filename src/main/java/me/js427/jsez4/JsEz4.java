package me.js427.jsez4;

import org.bukkit.plugin.java.JavaPlugin;

public final class JsEz4 extends JavaPlugin {
    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
    }
}
