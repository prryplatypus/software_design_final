package actions;

import players.Player;

public interface Action {
	void execute(Player current, Player other);
}
