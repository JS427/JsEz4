package me.js427.jsez4.listeners;

import me.js427.jsez4.JsEz4;
import me.js427.jsez4.utils.ColorUtil;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public final class JoinMessageListener implements Listener {
    private final JsEz4 jsEz4;

    public JoinMessageListener(JsEz4 jsEz4) {
        this.jsEz4 = jsEz4;
    }

    public void setJoinMessage(PlayerJoinEvent event) {
    }
}