package acciones;

import personajes.Personaje;

public class AtaqueBomba implements Accion {
	
	protected Personaje victima;
	
	public AtaqueBomba(Personaje victima) {
		this.victima = victima;
	}
	
	@Override
	public String getNombre() {
		return "Ataque con bomba";
	}
	
	@Override
	public int getCambioVidas() {
		return -15;
	}

	@Override
	public Personaje getVictima() {
		return this.victima;
	}
	
}
