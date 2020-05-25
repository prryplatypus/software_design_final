package strategies;
import java.util.concurrent.ThreadLocalRandom;

import players.Player;

public class Survival implements Strategy {
	public void executeStrategy(Player player) {
		int action = ThreadLocalRandom.current().nextInt(1, 41);
		
		if      (action <= 10)  player.Attack(); // 10/40
		else if (action <= 20)  player.Reload(); // 10/40
		else                    player.Revive(); // 20/40
	}
}