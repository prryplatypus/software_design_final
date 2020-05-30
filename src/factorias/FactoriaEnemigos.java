package factorias;

import personajes.Enemigo;
import personajes.BoxeadorViolento;
import personajes.HipopotamoDefensivo;
import personajes.NinjaEvasivo;

public class FactoriaEnemigos implements FactoriaAbstractaEnemigos {

	@Override
	public Enemigo getEnemigo(String tipo, int velocidad, int defensa, int ataque) {
		if      (tipo == "BoxeadorViolento")    return new BoxeadorViolento(velocidad, defensa, ataque);
		else if (tipo == "HipopotamoDefensivo") return new HipopotamoDefensivo(velocidad, defensa, ataque);
		else if (tipo == "NinjaEvasivo")        return new NinjaEvasivo(velocidad, defensa, ataque);
		else    return null;
	}

}
