package org.jacob.spigot.plugins.VNC;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("announce").setExecutor(new AnnounceCommand());
    }
}
