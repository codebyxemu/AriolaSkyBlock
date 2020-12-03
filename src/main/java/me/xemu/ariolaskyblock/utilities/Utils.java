package me.xemu.ariolaskyblock.utilities;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Utils
{

    public static String chat(String s)
    {
        return ChatColor.translateAlternateColorCodes('&', s);
    };

    public static boolean checkPermission(Player player, String permission)
    {
        if(player.hasPermission(permission)) return true;
        return false;
    };

    public static String prefix = chat("&8[&5&lSKY&d&lBLOCK&8] &r");

};