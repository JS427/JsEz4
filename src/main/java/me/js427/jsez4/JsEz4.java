package me.js427.jsez4;

import me.js427.jsez4.listeners.JoinMessageListener;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class JsEz4 extends JavaPlugin {
    private final FileConfiguration configuration = getConfig();
    private final PluginManager pluginManager = getServer().getPluginManager();

    @Override
    public void onEnable() {
        configuration.options().copyDefaults(true);
        saveDefaultConfig();

        pluginManager.registerEvents(new JoinMessageListener(), this);
    }

    @Override
    public void onDisable() {
    }
}
