package acciones;

import personajes.Personaje;

public class Evasion implements Accion {
	
	protected Personaje victima;
	
	public Evasion(Personaje victima) {
		this.victima = victima;
	}
	
	@Override
	public String getNombre() {
		return "Evasion";
	}
	
	@Override
	public int getCambioVidas() { // Vidas que puede salvar esta accion
		return 2;
	}

	@Override
	public Personaje getVictima() {
		return this.victima;
	}
	
}
