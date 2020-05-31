package factorias;

import personajes.Enemigo;

public abstract interface FactoriaAbstractaEnemigos {
	public abstract Enemigo getEnemigo(int velocidad, int defensa, int ataque);
	public abstract Enemigo getEnemigo(String tipo, int velocidad, int defensa, int ataque);
}
