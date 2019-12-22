package org.jacob.spigot.plugins.VNC;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AnnounceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(s.equalsIgnoreCase("announce")) {

            if(!commandSender.hasPermission("vnc.announce")) {
                commandSender.sendMessage(ChatColor.RED + "No permissions!");
                return true;
            }

            if(strings.length == 0) {
                commandSender.sendMessage(ChatColor.RED + "Usage: /announce <message>");
                return true;
            }

            String message = "";
            for (int i = 0; i < strings.length; i++) {
                message = message + strings[i] + " ";
            }

            Bukkit.broadcastMessage(ChatColor.RED + "[Voidnetwork MC] " + ChatColor.DARK_GRAY + ">> " + ChatColor.GRAY + message);

        }

        return true;
    }
}
