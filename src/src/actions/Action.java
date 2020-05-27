package actions;

import players.Player;

public interface Action {
	String GetType();
	void ExecuteOn(Player player);
}
