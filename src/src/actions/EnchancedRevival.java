package actions;

import players.Player;

public class EnchancedRevival extends ActionEnchancer {

	public EnchancedRevival(Action base_action) {
		super(base_action);
	}

	public void execute(Player current, Player other) {
		// Hace que se "reviva m�s"
		base_action.execute(current, other);	
	}

}
