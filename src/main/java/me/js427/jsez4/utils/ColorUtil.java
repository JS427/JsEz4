package me.js427.jsez4.utils;

import org.bukkit.ChatColor;

public final class ColorUtil {
    public static String translateAlternativeColorCodes(String textToTranslate) {
        return ChatColor.translateAlternateColorCodes('&', textToTranslate);
    }
}
