package players;

import strategies.Strategy;

public class Player {
	protected String name;
	protected Strategy strategy;
	protected int lifes;
	protected int bullets;
	
	public Player(String name, Strategy strategy, int lifes, int bullets)
	{
		this.name     = name;
		this.strategy = strategy;
		this.lifes    = lifes;
		this.bullets  = bullets;
	}
	
	public void executeTurn()
	{
		// Es mi turno. ¿Q hago? 
	}
	
	public int getRemainingLifes()
	{
		return this.lifes;
	}

	public void addLifes(int qty)
	{
		this.lifes += qty;
		System.out.println(this.name + " has gained " + qty + " life" + ((qty > 1) ? "s" : ""));
	}
	
	public void removeLifes(int qty)
	{
		int lifes_lost = (qty > this.lifes) ? this.lifes : qty;
		this.lifes -= lifes_lost;
		System.out.println(this.name + " has lost " + lifes_lost + " life" + ((lifes_lost > 1) ? "s" : ""));
	}
	
	public int getRemainingBullets()
	{
		return this.bullets;
	}
	
	protected void addBullets(int qty)
	{
		this.bullets += qty;
		System.out.println(this.name + " has reloaded " + qty + " bullet" + ((qty > 1) ? "s" : ""));
	}
	
	protected void removeBullets(int qty)
	{
		int bullets_lost = (qty > this.bullets) ? this.bullets : qty;
		this.bullets -= bullets_lost;
		System.out.println(this.name + " has used " + bullets_lost + " bullet" + ((bullets_lost > 1) ? "s" : ""));
	}
	
	protected void doAttack()
	{
		// Realizar un ataque
	}
	
	//public void receiveAttack(Attack attack)
	//{
	//	// Recibir un ataque
	//}
	
	protected void doDefense()
	{
		// Defenderse del siguiente ataque (lo mismo poner un "flag" para saber si reducir el siguiente ataque que se sufra)
	}
	
	protected void doRevive()
	{
		// Reganar vida
	}
	
	protected void doReload()
	{
		// Recargar munición
	}
}