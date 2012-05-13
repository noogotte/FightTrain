package fr.noogotte.fight_train.listener;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

import fr.noogotte.fight_train.FightTrain;

public class FightListener implements Listener {
	
	private FightTrain plugin;
	
	private Set<Player> playerInGame = new HashSet<Player>();
	
	public void fightListener (Plugin plugin) {
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	public void addPlayerInGame(Player player) {
		playerInGame.add(player);
	}
	
	public void removePlayerInGame(Player player) {
		playerInGame.remove(player);
	}
	
	public boolean isInGame(Player player) {
		return playerInGame.contains(player);
	}
}
