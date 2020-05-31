package acciones;

public abstract class AccionMagnificada implements Accion {

	protected Accion accion_base;
	
	public AccionMagnificada(Accion accion_base) {
		this.accion_base = accion_base;
	}
		
	@Override
	public Boolean esAtaque() {
		return this.accion_base.esAtaque();
	}
	
	@Override
	public Boolean esDefensa() {
		return this.accion_base.esDefensa();
	}
	
	@Override
	public Boolean esEvasion() {
		return this.accion_base.esEvasion();
	}
	
	public abstract String getNombre();
	public abstract int getCambioVidas();

}
