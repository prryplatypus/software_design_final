package states;

import actions.Action;

public interface State {
	public String GetState();
	public Boolean CanDoAction(Action action);
}
