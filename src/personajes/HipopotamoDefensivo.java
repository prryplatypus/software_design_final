package personajes;

import estado.Cansado;
import estado.Corriendo;
import estado.EnForma;
import estado.Herido;
import estrategias.Defensiva;

public class HipopotamoDefensivo extends Enemigo {
	
	protected final static String NOMBRE = "Hipopotamo Defensivo";

	public HipopotamoDefensivo(int velocidad, int defensa, int ataque) {
		super(NOMBRE, velocidad, defensa, ataque, new Defensiva());
	}

	@Override
	protected Boolean deberiaAtacar() {
		if (this.getEstado() instanceof Herido && this.getVidas() < Personaje.MAX_VIDAS * 0.3) {
			return true;
		}
		return false;
	}

	@Override
	protected Boolean deberiaDefender() {
		if (this.getEstado() instanceof Cansado || this.getEstado() instanceof EnForma) {
			return true;
		} else if (this.getEstado() instanceof Herido && this.getVidas() >= Personaje.MAX_VIDAS * 0.3) {
			return true;
		}
		return false;
	}

	@Override
	protected Boolean deberiaEvadir() {
		if (this.getEstado() instanceof Corriendo) {
			return true;
		}
		return false;
	}

}
