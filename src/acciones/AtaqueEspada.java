package acciones;

import personajes.Personaje;

public class AtaqueEspada implements Accion {
	
	protected Personaje victima;
	
	public AtaqueEspada(Personaje victima) {
		this.victima = victima;
	}
	
	@Override
	public String getNombre() {
		return "Ataque con espada";
	}
	
	@Override
	public int getCambioVidas() {
		return -5;
	}

	@Override
	public Personaje getVictima() {
		return this.victima;
	}
	
}
