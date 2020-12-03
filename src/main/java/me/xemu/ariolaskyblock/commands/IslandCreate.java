package me.xemu.ariolaskyblock.commands;

import me.xemu.ariolaskyblock.handlers.IslandHandler;
import me.xemu.ariolaskyblock.objects.Island;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class IslandCreate implements CommandExecutor
{

    final IslandHandler handler = new IslandHandler();

    @Override public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if(sender instanceof Player)
        {
            final Player player = (Player) sender;
            handler.generateIsland(player);
        };
        return true;
    };

};