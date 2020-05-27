package actions;

import players.Player;

public abstract class ActionEnchancer implements Action {
	protected Action action;

	public ActionEnchancer(Action action){
	   this.action = action;
	}
	
	public String GetType() {
		return action.GetType();
	}

	public void ExecuteOn(Player player) {
	   action.ExecuteOn(player);
	}
}
