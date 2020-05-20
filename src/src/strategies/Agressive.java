package strategies;
import java.util.concurrent.ThreadLocalRandom;

import enemies.Enemy;

public class Agressive implements Strategy {
	public void execute(Enemy enemy) {
		int action = ThreadLocalRandom.current().nextInt(0, 51);
		
		if      (action <= 8)  enemy.doDefend(); // 8/50
		else if (action <= 16) enemy.doRevive(); // 8/50
		else if (action <= 29) enemy.doReload(); // 12/50
		else                   enemy.doAttack(); // 22/50
	}
}