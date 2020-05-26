import factories.Beast;
import factories.EnemyFactoryDesert;
import factories.Enemy;
import factories.EnemyFactory;


public class main {

	public static void main(String[] args) {
		EnemyFactory factory;
		Beast beast;
		
		factory = new EnemyFactoryDesert();
		beast = factory.createBeast();
	}

}
