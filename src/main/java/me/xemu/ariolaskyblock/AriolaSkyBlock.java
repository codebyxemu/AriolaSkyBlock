package me.xemu.ariolaskyblock;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Date;
import java.util.HashMap;

public final class AriolaSkyBlock extends JavaPlugin {

    public static HashMap<Player, Integer> islands = new HashMap<>();
    public static HashMap<Player, Date> lastPlayed = new HashMap<>();

    @Override public void onEnable()
    {
        getConfig().options().copyDefaults(true);
        saveConfig();

        if(islands.isEmpty()) {
            getLogger().warning("Map<> islands is currently empty. Please contact Xemu or a member of the Ariola Development Team if you believe this is wrong.");
        };



        getLogger().info("Plugin Enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
