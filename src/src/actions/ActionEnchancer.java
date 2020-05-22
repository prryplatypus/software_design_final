package actions;

import players.Player;

public abstract class ActionEnchancer implements Action {
	protected Action base_action;

	public ActionEnchancer(Action base_action){
	   this.base_action = base_action;
	}

	public void execute(Player current, Player other) {
	   base_action.execute(current, other);
	}
}
