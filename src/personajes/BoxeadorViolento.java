package personajes;

import estrategias.Agresiva;

public class BoxeadorViolento extends Enemigo {

	protected final static String NOMBRE = "Boxeador Violento";
	
	public BoxeadorViolento(int velocidad, int defensa, int ataque) {
		super(NOMBRE, velocidad, defensa, ataque, new Agresiva());
	}

	@Override
	protected Boolean deberiaAtacar(Personaje enemigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Boolean deberiaDefender(Personaje enemigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Boolean deberiaEvadir(Personaje enemigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
