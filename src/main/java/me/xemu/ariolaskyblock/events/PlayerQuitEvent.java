package me.xemu.ariolaskyblock.events;

import me.xemu.ariolaskyblock.AriolaSkyBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Date;

public class PlayerQuitEvent implements Listener
{

    AriolaSkyBlock plugin;
    public PlayerQuitEvent(AriolaSkyBlock plugin)
    {
        this.plugin = new AriolaSkyBlock();
    };

    @EventHandler public void onPlayerJoin(org.bukkit.event.player.PlayerQuitEvent e)
    {
        final Player player = e.getPlayer();

        e.setQuitMessage(null);
        plugin.getLogger().info(player.getName() + " left.");
    };

};