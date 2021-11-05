package com.crumblyliquid.fastreload;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements CommandExecutor {

    private Server server;

    public ReloadCommand(Server server) {
        this.server = server;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.GREEN + "Reloading server!\n" + ChatColor.RED + "Beware that reloading using this command might break some plugins!");
        this.server.reload();
        return true;
    }
}
