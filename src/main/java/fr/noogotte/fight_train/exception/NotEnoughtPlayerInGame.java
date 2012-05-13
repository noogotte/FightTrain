package fr.noogotte.fight_train.exception;

import fr.aumgn.bukkitutils.command.exception.CommandError;

public class NotEnoughtPlayerInGame extends CommandError {
	private static final long serialVersionUID = -3139364881212075182L;

    public NotEnoughtPlayerInGame() {
        super("Il n'y a pas assez de joueur dans la partie.");
    }
}
