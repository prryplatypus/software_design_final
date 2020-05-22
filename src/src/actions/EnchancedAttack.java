package actions;

import players.Player;

public class EnchancedAttack extends ActionEnchancer {

	public EnchancedAttack(Action base_action) {
		super(base_action);
	}

	public void execute(Player current, Player other) {
		// Quitar n vidas a "to" y luego ejecutar la acci�n normal
		base_action.execute(current, other);	
	}

}
