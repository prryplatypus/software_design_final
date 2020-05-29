package personajes;

import acciones.Accion;
import estrategias.Agresiva;
import estrategias.Defensiva;
import estrategias.Estrategia;


public abstract class Enemigo extends Personaje {

	private Estrategia estrategia;
	
	protected abstract Boolean deberiaAtacar(Personaje enemigo);
	protected abstract Boolean deberiaDefender(Personaje enemigo);
	protected abstract Boolean deberiaEvadir(Personaje enemigo);
	
	public Enemigo(String nombre, int velocidad, int defensa, int ataque, Estrategia estrategia) {
		super(nombre, false, velocidad, defensa, ataque);
		this.estrategia = estrategia;
	}
	
	protected Estrategia getEstrategia() {
		return this.estrategia;
	}
	
	public Accion getSiguienteAccion(Personaje enemigo) {
		if (this.deberiaAtacar(enemigo)) {
			return this.getAtaque(enemigo);
		}
		else if (this.deberiaDefender(enemigo)) {
			return this.getDefensa(this);
		}
		else if (this.deberiaEvadir(enemigo)){
			return this.getEvasion(this);
		}
		else {
			if      (this.estrategia instanceof Agresiva)  return this.getAtaque(enemigo);
			else if (this.estrategia instanceof Defensiva) return this.getDefensa(this);
			else                                           return this.getEvasion(this);
		}
	}
	
}
