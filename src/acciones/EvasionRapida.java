package acciones;

import personajes.Personaje;

public class EvasionRapida extends AccionMagnificada {

	public EvasionRapida(Accion accion_base) {
		super(accion_base);
	}

	@Override
	public String getNombre() {
		return accion_base.getNombre() + " (rapida)";
	}

	@Override
	public int getCambioVidas() {
		return 2 * accion_base.getCambioVidas();
	}

	@Override
	public Personaje getVictima() {
		return accion_base.getVictima();
	}

}
