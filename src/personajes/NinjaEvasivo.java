package personajes;

import estado.Cansado;
import estado.Corriendo;
import estado.EnForma;
import estrategias.Evasiva;

public class NinjaEvasivo extends Enemigo {

	protected final static String NOMBRE = "Ninja Evasivo";
	
	public NinjaEvasivo(int velocidad, int defensa, int ataque) {
		super(NOMBRE, velocidad, defensa, ataque, new Evasiva());
	}

	@Override
	protected Boolean deberiaAtacar() {
		if (this.getEstado() instanceof EnForma && this.getVidas() >= Personaje.MAX_VIDAS * 0.6) {
			return true;
		}
		return false;
	}

	@Override
	protected Boolean deberiaDefender() {
		if (this.getEstado() instanceof Cansado) {
			return true;
		}
		return false;
	}

	@Override
	protected Boolean deberiaEvadir() {
		if (this.getEstado() instanceof Corriendo || (this.getEstado() instanceof EnForma && this.getVidas() < Personaje.MAX_VIDAS * 0.6)) {
			return true;
		}
		return false;
	}

}