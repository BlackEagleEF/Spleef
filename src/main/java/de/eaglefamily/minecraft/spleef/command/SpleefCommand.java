package de.eaglefamily.minecraft.spleef.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpleefCommand implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (!(sender instanceof Player)) {
      return true;
    }

    Player player = (Player) sender;

    if (args.length == 0) {
      return true;
    }

    switch (args[0].toLowerCase()) {
      default:
        break;
    }

    return true;
  }
}
