package players;

public abstract class Player {
	public static final int MAX_HEALTH     = 100;
	public static final int MAX_STRENGTH   = 20;
	public static final int MAX_AMMUNITION = 20;
	
	protected Boolean is_user; 	// Controlled by user or automatic
	protected int health;      	// As long as it's greater than 0, the player is alive
	protected int strength;    	// The greater this is, the smaller the life loss can be
	protected int endurance;   	// The greater this is, the greater the life gain can be
	protected int ammunition;	// Recommended starting with 3-5. When 0, player will have to reload to attack
	
	public abstract void Attack();
	public abstract void Reload();
	public abstract void Revive();
	
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
	
	public int GetStrength()
	{
		return strength;
	}
	
	public int GetEndurance()
	{
		return endurance;
	}
	public void Defend() {
		// TODO Auto-generated method stub
		
	}
}
