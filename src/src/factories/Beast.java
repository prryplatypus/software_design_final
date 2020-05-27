package factories;

import java.util.concurrent.ThreadLocalRandom;

import strategies.Agressive;

public abstract class Beast extends Enemy {
	
	public Beast(int health, int strength, int endurance, int ammunition, String name) {
		super(new Agressive(), health, strength, endurance, ammunition, name);
	}

	public boolean enchancedAction() {
		int prob = ThreadLocalRandom.current().nextInt(1, 101);
		if (prob < 20) {
			return true;
		} 
		return false;
		
	}
	
}
