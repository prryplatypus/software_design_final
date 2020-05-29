package acciones;

import personajes.Personaje;

public class DefensaReforzada extends AccionMagnificada {

	public DefensaReforzada(Accion accion_base) {
		super(accion_base);
	}

	@Override
	public String getNombre() {
		return accion_base.getNombre() + " (reforzada)";
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
