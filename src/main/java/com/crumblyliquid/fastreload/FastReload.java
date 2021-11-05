package com.crumblyliquid.fastreload;

import org.bukkit.plugin.java.JavaPlugin;

public final class FastReload extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("fr").setExecutor(new ReloadCommand(this.getServer()));
    }
}

