package states;

import actions.Action;

/**
 * Player is alive, can do anything desired *
 */
public class Perfect implements State {

	@Override
	public String GetState() {
		return "Alive";
	}
	
	@Override
	public Boolean CanDoAction(Action action) {
		return true; // Si está vivo puede hacer cualquier cosa
	}

}
