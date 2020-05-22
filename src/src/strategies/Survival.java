package strategies;
import java.util.concurrent.ThreadLocalRandom;

import players.Player;

public class Survival implements Strategy {
	public void execute(Player enemy) {
		int action = ThreadLocalRandom.current().nextInt(0, 51);

		if      (action <= 8)  enemy.doAttack(); // 8/50
		else if (action <= 16) enemy.doReload(); // 8/50
		else if (action <= 28) enemy.doDefend(); // 12/50
		else                   enemy.doRevive(); // 22/50
	}
}