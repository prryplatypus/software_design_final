package factories;

public class EnemyFactoryDesert implements EnemyFactory {

	public Beast createBeast() {
		return new BeastDesert();
	}


}
