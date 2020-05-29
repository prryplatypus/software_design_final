package personajes;

import estado.Cansado;

import estado.EnForma;
import estado.Herido;
import estrategias.Agresiva;

public class BoxeadorViolento extends Enemigo {

	protected final static String NOMBRE = "Boxeador Violento";
	
	public BoxeadorViolento(int velocidad, int defensa, int ataque) {
		super(NOMBRE, velocidad, defensa, ataque, new Agresiva());
	}

	@Override
	protected Boolean deberiaAtacar() {
		if (this.getEstado() instanceof EnForma || this.getEstado() instanceof Cansado || (this.getEstado() instanceof Herido && this.getVidas() > Personaje.MAX_VIDAS * 0.4)) {
			return true;
		}
		return false;
	}

	@Override
	protected Boolean deberiaDefender() {
		if (this.getEstado() instanceof Herido && this.getVidas() <= Personaje.MAX_VIDAS * 0.4) {
			return true;
		}
		return false;
	}

	@Override
	protected Boolean deberiaEvadir() {
		return false;
	}

}
