package players;

public abstract class Player {
	public static final int MAX_HEALTH     = 100;
	public static final int MAX_STRENGTH   = 100;
	public static final int MAX_AMMUNITION = 100;
	public static final int MAX_ENDURANCE  = 100;
	
	protected Boolean is_user; 	// Controlled by user or automatic
	protected int health;      	// As long as it's greater than 0, the player is alive
	protected int strength;    	// The greater this is, the smaller the life loss can be
	protected int endurance;   	// The greater this is, the greater the life gain can be
	protected int ammunition;	// Recommended starting with 3-5. When 0, player will have to reload to attack
	protected String name;

	public Player(int health, int strength, int endurance, int ammunition, String name, boolean is_user) {
		this.health = health;
		this.strength = strength;
		this.endurance = endurance;
		this.ammunition = ammunition;
		this.name = name;
		this.is_user = true;
	}
	
	protected abstract void DoAction(); // If it's the user it will get input. If it's not user, it will ask the strategy what to do next
	protected void Attack() {
		
	}
	protected void Reload() {
		
	}
	protected void Revive() {
		
	}
	
	public Boolean IsUser() {
		return is_user;
	}
	
	public int GetHealth() {
		return health;
	}
	
	public void AddHealth(int add) {
		health += add;
	}
	
	public void RemoveHealth(int remove) {
		health -= remove;
	}
	
	public int GetAmmunition() {
		return ammunition;
	}
	
	public void AddAmmunition(int add) {
		ammunition += add;
	}
	
	public void RemoveAmmunition(int remove) {
		ammunition -= remove;
	}
	
	public int GetStrength() {
		return strength;
	}
	
	public int GetEndurance() {
		return endurance;
	}
	
	public void Defend() {
		// TODO Auto-generated method stub
	}
}
