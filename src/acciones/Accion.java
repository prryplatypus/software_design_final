package acciones;

public interface Accion {
	public String getNombre();
	public int getCambioVidas(); // Cu�nto cambia las vidas
	public Boolean esAtaque();
	public Boolean esDefensa();
	public Boolean esEvasion();
}
