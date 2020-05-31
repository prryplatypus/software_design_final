package acciones;


public class AtaqueEspadaMagnificado extends AccionMagnificada {

	public AtaqueEspadaMagnificado(Accion accion_base) {
		super(accion_base);
	}

	@Override
	public String getNombre() {
		return accion_base.getNombre() + " (magnificado)";
	}

	@Override
	public int getCambioVidas() {
		return 2 * accion_base.getCambioVidas();
	}

}
