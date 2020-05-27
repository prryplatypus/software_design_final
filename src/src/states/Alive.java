package states;

import actions.Action;

/**
 * Player is alive, can do anything desired *
 */
public class Alive implements State {

	@Override
	public String GetState() {
		return "Alive";
	}
	
	@Override
	public Boolean CanDoAction(Action action) {
		if (action.GetType() != "Revive") {
			return true;
		} else {		
			return false;
		}
	}

}
