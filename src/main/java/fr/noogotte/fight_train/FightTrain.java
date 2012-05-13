package fr.noogotte.fight_train;

import org.bukkit.plugin.java.JavaPlugin;

import fr.aumgn.bukkitutils.command.CommandsRegistration;
import fr.aumgn.bukkitutils.command.messages.FrenchMessages;
import fr.noogotte.fight_train.commands.InitCommand;

public class FightTrain extends JavaPlugin {
	
	@Override
	public void onEnable() {
		CommandsRegistration registration = new CommandsRegistration(
                this, new FrenchMessages());
		registration.register(new InitCommand());
	}
}
