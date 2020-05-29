package acciones;

import personajes.Personaje;

public class Defensa implements Accion {
	
	protected Personaje victima;
	
	public Defensa(Personaje victima) {
		this.victima = victima;
	}
	
	@Override
	public String getNombre() {
		return "Defensa";
	}
	
	@Override
	public int getCambioVidas() { // Vidas que puede salvar esta defensa
		return 3;
	}

	@Override
	public Personaje getVictima() {
		return this.victima;
	}
	
}
