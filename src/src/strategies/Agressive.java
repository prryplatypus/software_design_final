package strategies;
import java.util.concurrent.ThreadLocalRandom;

import players.Player;

public class Agressive implements Strategy {
	public void executeStrategy(Player player) {
		int action = ThreadLocalRandom.current().nextInt(1, 41);
		
		if      (action <= 10)  player.Revive(); // 10/40
		else if (action <= 20)  player.Reload(); // 10/40
		else                    player.Attack(); // 20/40
	}
}