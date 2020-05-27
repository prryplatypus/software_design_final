package strategies;
import java.util.concurrent.ThreadLocalRandom;

import actions.Action;
import actions.Reload;
import actions.Revival;
import actions.Shoot;

public class Agressive implements Strategy {
	public Action getAction() {
		int action = ThreadLocalRandom.current().nextInt(1, 41);
		
		if      (action <= 10)  return new Revival(); // 10/40
		else if (action <= 20) 	return new Reload(); // 10/40
		else                    return new Shoot(); // 20/40
	}
}