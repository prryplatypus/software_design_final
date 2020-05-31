package factorias;

import personajes.Personaje;

public abstract interface FactoriaPersonajes {
	public abstract Personaje getPersonaje(int velocidad, int defensa, int ataque);
	public abstract Personaje getPersonaje(String nombre, int velocidad, int defensa, int ataque);
}
