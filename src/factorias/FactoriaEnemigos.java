package factorias;

import personajes.Enemigo;

import java.util.Random;

import personajes.BoxeadorViolento;
import personajes.HipopotamoDefensivo;
import personajes.NinjaEvasivo;

public class FactoriaEnemigos implements FactoriaAbstractaEnemigos {

	@Override
	public Enemigo getEnemigo(int velocidad, int defensa, int ataque) {
		Random rand = new Random();
		switch (rand.nextInt(3)) {
		case 0:  return new BoxeadorViolento(velocidad, defensa, ataque);
		case 1:  return new HipopotamoDefensivo(velocidad, defensa, ataque);
		case 2:  return new NinjaEvasivo(velocidad, defensa, ataque);
		default: return null;
		}
	}
	
	@Override
	public Enemigo getEnemigo(String tipo, int velocidad, int defensa, int ataque) {
		if      (tipo == "BoxeadorViolento")    return new BoxeadorViolento(velocidad, defensa, ataque);
		else if (tipo == "HipopotamoDefensivo") return new HipopotamoDefensivo(velocidad, defensa, ataque);
		else if (tipo == "NinjaEvasivo")        return new NinjaEvasivo(velocidad, defensa, ataque);
		else    return null;
	}

}
