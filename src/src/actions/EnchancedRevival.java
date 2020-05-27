package actions;

import java.util.concurrent.ThreadLocalRandom;

import players.Player;

public class EnchancedRevival extends ActionEnchancer {

	public EnchancedRevival(Action action) {
		super(action);
	}
	
	public String GetType() {
		return action.GetType();
	}

	public void ExecuteOn(Player player) {
		action.ExecuteOn(player);
		int gain = ThreadLocalRandom.current().nextInt(0, player.GetEndurance() + 1);
		
		// No puede terminar con más vidas que el máximo de vidas posible
		if (player.GetHealth() + gain > Player.MAX_HEALTH) {
			gain = Player.MAX_HEALTH - player.GetHealth();
		}
		
		if (gain > 0) {
			player.AddHealth(gain);
			System.out.println("In addition, " + ((player.IsUser()) ? "you have" : "your enemy has") + " gained another " + ((gain > 1) ? (gain + " lifes") : " life") + " as a result of the endurance.");	
		}
	}

}
