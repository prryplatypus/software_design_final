package strategies;
import java.util.concurrent.ThreadLocalRandom;
import players.Player;

public class Defensive implements Strategy {
	public String execute(Player player) {
		int action = ThreadLocalRandom.current().nextInt(0, 51);
		
		if      (action <= 8)  return "Attack"; // 8/50
		else if (action <= 16) return "Reload"; // 8/50
		else if (action <= 24) return "Revive"; // 8/50
		else                   return "Defend"; // 26/50
	}
}
