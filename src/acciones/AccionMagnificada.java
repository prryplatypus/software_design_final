package acciones;

public abstract class AccionMagnificada implements Accion {

	protected Accion accion_base;
	
	public AccionMagnificada(Accion accion_base) {
		this.accion_base = accion_base;
	}
	
	public abstract String getNombre();
	public abstract int getCambioVidas();

}
