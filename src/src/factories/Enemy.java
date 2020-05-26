package factories;
import players.Player;


public abstract class Enemy extends Player {

	public Enemy() {
		
	}
	
	public void decideNext() {
		getHealth();	// Obtener la salud de �l mismo
		getPlayerHealth(); // Obtener la salud de el jugador
		
	}
	
	public abstract void getHealth();
	public abstract void getPlayerHealth();
	
	@Override
	public void Attack() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Defend() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Reload() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Revive() {
		// TODO Auto-generated method stub
	}

}
