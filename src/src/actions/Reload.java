package actions;

import java.util.concurrent.ThreadLocalRandom;

import players.Player;

public class Reload implements Action {
	
	@Override
	public String GetType() {
		return "Attack";
	}
	
	@Override
	public void ExecuteOn(Player player) {
		int attack = ThreadLocalRandom.current().nextInt(1, Player.MAX_STRENGTH + 1 - player.GetStrength());
		
		// No puede perder más vidas de las que tiene
		if (player.GetHealth() < attack) {
			attack = player.GetHealth();
		}
		
		player.RemoveHealth(attack);
		System.out.println(((player.IsUser()) ? "You have" : "Your enemy has") + " lost " + attack + ((attack > 1) ? " lifes" : " life") + " as a result of the attack.");
	}
	
}
