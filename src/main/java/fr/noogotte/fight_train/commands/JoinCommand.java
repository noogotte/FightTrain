package fr.noogotte.fight_train.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import fr.aumgn.bukkitutils.command.Command;
import fr.aumgn.bukkitutils.command.CommandArgs;
import fr.aumgn.bukkitutils.command.NestedCommands;
import fr.aumgn.bukkitutils.command.exception.CommandUsageError;
import fr.noogotte.fight_train.listener.FightListener;

@NestedCommands(name = "fight_train")
public class JoinCommand extends FightTrainCommand {
	
	private FightListener fightListener;
	
	public JoinCommand(FightListener fightlistener) {
		this.fightListener = fightlistener;
	}
	
	@Command(name = "join", min = 0, max = 0)
	public void joinCommand(Player player, CommandArgs args) {
		if(args.length() == 0) {
			fightListener.addPlayerInGame(player);
			Bukkit.broadcastMessage(player.getName() + "a rejoin la partie.");
		} else {
			throw new CommandUsageError();
		}
	}
}
