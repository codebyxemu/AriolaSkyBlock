package me.xemu.ariolaskyblock.handlers;

import me.xemu.ariolaskyblock.AriolaSkyBlock;
import me.xemu.ariolaskyblock.utilities.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class IslandHandler
{

    public void generateIsland(Player player)
    {
        HashMap<Integer, Player> ids = new HashMap<>();
        Random random = new Random();
        int islandID = random.nextInt(500000);
        ids.put(islandID, player);

        WorldCreator worldCreator = new WorldCreator("island-"+islandID);
        World world = Bukkit.getServer().createWorld(worldCreator);

        player.teleport(new Location(world, world.getSpawnLocation().getX(), world.getSpawnLocation().getY(), world.getSpawnLocation().getZ()));
        player.sendMessage(Utils.prefix + Utils.chat("&a&lISLAND CREATED! &r&aYou have been teleported to your new island!"));

        Bukkit.getLogger().info("Created Island " + islandID + " with the owner of " + player.getName() + ".");
        AriolaSkyBlock.islands.put(player, islandID);
    };


};