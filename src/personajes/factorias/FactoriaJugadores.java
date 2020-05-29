package personajes.factorias;

import personajes.Jugador;
import personajes.Personaje;

public class FactoriaJugadores implements FactoriaPersonajes {

	@Override
	public Personaje getPersonaje(int velocidad, int defensa, int ataque) {
		return new Jugador(velocidad, defensa, ataque);
	}

}
