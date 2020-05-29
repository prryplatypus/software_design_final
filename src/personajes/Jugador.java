package personajes;

import acciones.Accion;

public class Jugador extends Personaje {

	public Jugador(int velocidad, int defensa, int ataque) {
		super("Jugador", true, velocidad, defensa, ataque);
	}

	@Override
	public Accion getSiguienteAccion(Personaje enemigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
