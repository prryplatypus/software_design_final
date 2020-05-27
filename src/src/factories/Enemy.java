package factories;
import actions.Action;
import actions.EnchancedShoot;
import actions.Shoot;
import actions.EnchancedReload;
import actions.Reload;
import actions.EnchancedRevival;
import actions.Revival;
import players.Player;
import strategies.Strategy;


public abstract class Enemy extends Player {
	
	protected Strategy strategy;

	public Enemy(Strategy strategy, int health, int strength, int endurance, int ammunition, String name) {
		super(health, strength, endurance, ammunition, name, false);
		this.strategy = strategy;
	}
	
	public void DoAction() {
		if(!this.hasEnoughHealth()) {
			System.out.println("Too little health, reviving...");
			this.Revive();
		} else {
			this.selectAction();
		}
	}
	
	public boolean hasEnoughHealth() {
		return this.health > ((Player.MAX_HEALTH / 100) * 5);
	}
	
	public Action selectAction() {
		Action actionDecided = this.strategy.getAction();
		while (!isValidAction(actionDecided)) {
			actionDecided = this.strategy.getAction();
		}
		if (actionDecided instanceof Shoot && enchancedAction()) {
			return new EnchancedShoot(actionDecided);
		} else if (actionDecided instanceof Reload && enchancedAction()) {
			return new EnchancedReload(actionDecided);
		} else if (actionDecided instanceof Revival && enchancedAction()) {
			return new EnchancedRevival(actionDecided);
		}
		return actionDecided;
	}
	
	public abstract boolean isValidAction(Action action);
	
	public abstract boolean enchancedAction();

}
