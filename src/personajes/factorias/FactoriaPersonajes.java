package personajes.factorias;

import personajes.Personaje;

public abstract interface FactoriaPersonajes {
	public abstract Personaje getPersonaje(int velocidad, int defensa, int ataque);
}
