package personajes;

import estrategias.Evasiva;

public class NinjaEvasivo extends Enemigo {

	protected final static String NOMBRE = "Ninja Evasivo";
	
	public NinjaEvasivo(int velocidad, int defensa, int ataque) {
		super(NOMBRE, velocidad, defensa, ataque, new Evasiva());
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