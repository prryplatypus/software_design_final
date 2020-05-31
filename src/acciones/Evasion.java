package acciones;


public class Evasion implements Accion {
	
	@Override
	public String getNombre() {
		return "Evasion";
	}
	
	@Override
	public int getCambioVidas() { // Vidas que puede salvar esta accion
		return 2;
	}
	
	@Override
	public Boolean esAtaque() {
		return false;
	}
	
	@Override
	public Boolean esDefensa() {
		return false;
	}
	
	@Override
	public Boolean esEvasion() {
		return true;
	}
	
}
