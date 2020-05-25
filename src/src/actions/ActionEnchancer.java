package actions;

import players.Player;

public abstract class ActionEnchancer implements Action {
	protected Action action;

	public ActionEnchancer(Action action){
	   this.action = action;
	}

	public void executeOn(Player player) {
	   action.executeOn(player);
	}
}
