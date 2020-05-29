package personajes.factorias;

import java.util.concurrent.ThreadLocalRandom;

import personajes.BoxeadorViolento;
import personajes.HipopotamoDefensivo;
import personajes.NinjaEvasivo;
import personajes.Personaje;

public class FactoriaEnemigos implements FactoriaPersonajes {

	@Override
	public Personaje getPersonaje(int velocidad, int defensa, int ataque) {
		int rand = ThreadLocalRandom.current().nextInt(1, 4);
		if      (rand == 1) return new NinjaEvasivo(velocidad, defensa, ataque);
		else if (rand == 2) return new BoxeadorViolento(velocidad, defensa, ataque);
		else                return new HipopotamoDefensivo(velocidad, defensa, ataque);
	}

}
