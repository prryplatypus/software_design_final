package acciones;

import personajes.Personaje;

public interface Accion {
	public String getNombre();
	public Personaje getVictima();
	public int getCambioVidas(); // Cu�nto cambia las vidas
}
