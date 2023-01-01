package me.js427.jsez4.listeners;

import me.js427.jsez4.JsEz4;
import me.js427.jsez4.utils.ColorUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinMessageListener implements Listener {
    private final JsEz4 jsEz4 = new JsEz4();

    public void setJoinMessage(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        String message = jsEz4.getConfig().getString("chat.join-leave-message.custom-join-message");

        message.replace("[USERNAME]", player.getName());

        event.setJoinMessage(ColorUtil.translateAlternativeColorCodes(message));
    }
}