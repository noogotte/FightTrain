package fr.noogotte.fight_train.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import fr.aumgn.bukkitutils.command.Command;
import fr.aumgn.bukkitutils.command.CommandArgs;
import fr.aumgn.bukkitutils.command.NestedCommands;
import fr.aumgn.bukkitutils.command.exception.CommandUsageError;

@NestedCommands(name = "fight_train")
public class InitCommand extends FightTrainCommand {
	
	@Command(name = "init", min = 0, max = 0)
	public void initCommand(Player player, CommandArgs args) {
		if(args.length() == 0) {
			Bukkit.broadcastMessage(ChatColor.AQUA + "Un combat d'entrainement a été lancé,");
			Bukkit.broadcastMessage(ChatColor.AQUA + "Faite" + ChatColor.RED + "/join" + ChatColor.AQUA + "pour rejoindre la partie");
		} else {
			throw new CommandUsageError();
		}
	}
}
