package factories;

import actions.Action;
import actions.Revival;
import actions.Shoot;
import actions.Reload;
import players.Player;

public class BeastDesert extends Beast {
	
	public BeastDesert() {
		super((Player.MAX_HEALTH / 10) * 3, (Player.MAX_STRENGTH / 10) * 8, (Player.MAX_AMMUNITION / 10) * 7, (Player.MAX_AMMUNITION / 10) * 5, "Desert Beast");
	}


	public boolean isValidAction(Action action) {
		if(action instanceof Shoot && this.GetAmmunition() > 0) {
			return true;
		} 
		else if(action instanceof Revival && this.GetHealth() < Player.MAX_HEALTH) {
			return true;
		} 
		else if(action instanceof Reload && this.GetAmmunition() < Player.MAX_AMMUNITION) {
			return true;
		}
		return false;
	}



}
