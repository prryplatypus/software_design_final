package players;

public interface Player {
	public int health;
	public int strength;
	public int endurance;
	public int speed;
	
	void Attack();
	
	void Defend();
}
