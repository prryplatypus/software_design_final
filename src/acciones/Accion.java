package acciones;

public interface Accion {
	public String getNombre();
	public int getCambioVidas(); // Cuánto cambia las vidas
	public Boolean esAtaque();
	public Boolean esDefensa();
	public Boolean esEvasion();
}
