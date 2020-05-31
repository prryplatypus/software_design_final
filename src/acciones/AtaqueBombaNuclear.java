package acciones;

public class AtaqueBombaNuclear extends AccionMagnificada {

	public AtaqueBombaNuclear(Accion accion_base) {
		super(accion_base);
	}

	@Override
	public String getNombre() {
		return accion_base.getNombre() + " (nuclear)";
	}

	@Override
	public int getCambioVidas() {
		return 2 * accion_base.getCambioVidas();
	}

}
