package me.xemu.ariolaskyblock.events;

import me.xemu.ariolaskyblock.AriolaSkyBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Date;

public class PlayerJoinEvent implements Listener
{

    AriolaSkyBlock plugin;
    public PlayerJoinEvent(AriolaSkyBlock plugin)
    {
        this.plugin = new AriolaSkyBlock();
    };

    @EventHandler public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent e)
    {
        final Player player = e.getPlayer();
        final Date playerTime = AriolaSkyBlock.lastPlayed.get(player);

        e.setJoinMessage(null);
        plugin.getLogger().info(player.getName() + " joined.");

        AriolaSkyBlock.lastPlayed.put(player, new Date());
    };

};