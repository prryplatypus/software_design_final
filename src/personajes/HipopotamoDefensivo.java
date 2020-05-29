package personajes;

import estrategias.Defensiva;

public class HipopotamoDefensivo extends Enemigo {
	
	protected final static String NOMBRE = "Hipopotamo Defensivo";

	public HipopotamoDefensivo(int velocidad, int defensa, int ataque) {
		super(NOMBRE, velocidad, defensa, ataque, new Defensiva());
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
