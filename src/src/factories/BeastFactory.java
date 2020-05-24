package factories;

public class BeastFactory implements EnemyFactory {

	public Enemy createEnemy() {
		return new Beast();
		
	}

}
