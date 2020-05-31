package personajes;

import acciones.Accion;
import estrategias.Agresiva;
import estrategias.Defensiva;
import estrategias.Estrategia;


public abstract class Enemigo extends Personaje {

	private Estrategia estrategia;
	
	protected abstract Boolean deberiaAtacar();
	protected abstract Boolean deberiaDefender();
	protected abstract Boolean deberiaEvadir();
	
	public Enemigo(String nombre, int velocidad, int defensa, int ataque, Estrategia estrategia) {
		super(nombre, false, velocidad, defensa, ataque);
		this.estrategia = estrategia;
	}
	
	protected Estrategia getEstrategia() {
		return this.estrategia;
	}
	
	public Accion getSiguienteAccion() {
		// Primero guardar Accion en una variable, luego cambiar Estado si es necesario y por último devolver la Accion guardada
		if (this.deberiaAtacar()) {
			return this.getAtaque();
		}
		else if (this.deberiaDefender()) {
			return this.getDefensa();
		}
		else if (this.deberiaEvadir()){
			return this.getEvasion();
		}
		else {
			if      (this.estrategia instanceof Agresiva)  return this.getAtaque();
			else if (this.estrategia instanceof Defensiva) return this.getDefensa();
			else                                           return this.getEvasion();
		}
	}
	
}
