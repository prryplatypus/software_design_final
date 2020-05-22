package strategies;
import java.util.concurrent.ThreadLocalRandom;

import players.Player;

public class Defensive implements Strategy {
	public void execute(Player enemy) {
		int action = ThreadLocalRandom.current().nextInt(0, 51);
		
		if      (action <= 8)  enemy.doAttack(); // 8/50
		else if (action <= 16) enemy.doReload(); // 8/50
		else if (action <= 24) enemy.doRevive(); // 8/50
		else                   enemy.doDefend(); // 26/50
	}
}
