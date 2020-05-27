package actions;

import java.util.concurrent.ThreadLocalRandom;

import players.Player;

public class EnchancedShoot extends ActionEnchancer {

	public EnchancedShoot(Action action) {
		super(action);
	}
	
	public String GetType() {
		return action.GetType();
	}

	public void ExecuteOn(Player player) {
		action.ExecuteOn(player);
		int extra_attack = ThreadLocalRandom.current().nextInt(0, Player.MAX_STRENGTH + 1 - player.GetStrength());
		
		if (player.GetHealth() < extra_attack) {
			extra_attack = player.GetHealth();
		}
		
		if (extra_attack > 0) {
			player.RemoveHealth(extra_attack);
			System.out.println("In addition, " + ((player.IsUser()) ? "you have" : "your enemy has") + " lost another " + ((extra_attack > 1) ? (extra_attack + " lifes") : "life") + " as it was a high quality riffle.");	
		}
	}

}
