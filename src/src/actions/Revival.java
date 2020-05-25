package actions;

import java.util.concurrent.ThreadLocalRandom;

import players.Player;

public class Revival implements Action {
	
	@Override
	public void executeOn(Player player) {
		int gain = ThreadLocalRandom.current().nextInt(1, player.GetEndurance() + 1);
		
		// No puede terminar con más vidas que el máximo de vidas posible
		if (player.GetHealth() + gain > Player.MAX_HEALTH) {
			gain = Player.MAX_HEALTH - player.GetHealth();
		}
		
		player.AddHealth(gain);
		System.out.println(((player.IsUser()) ? "You have" : "Your enemy has") + " gained " + gain + ((gain > 1) ? " lifes" : " life") + " as a result of the revival.");
	}
	
}
