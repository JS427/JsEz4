package me.js427.jsez4.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public final class JsEz4Command implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof BlockCommandSender)
            sender.sendMessage(ChatColor.RED + "Only console, players can execute this command!");

        sender.sendMessage(ChatColor.GREEN + "You are currently running JsEz4 v1.0-SNAPSHOT");
        return true;
    }
}
