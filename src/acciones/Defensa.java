package acciones;


public class Defensa implements Accion {
	
	@Override
	public String getNombre() {
		return "Defensa";
	}
	
	@Override
	public int getCambioVidas() { // Vidas que puede salvar esta defensa
		return 3;
	}
	
	@Override
	public Boolean esAtaque() {
		return false;
	}
	
	@Override
	public Boolean esDefensa() {
		return true;
	}
	
	@Override
	public Boolean esEvasion() {
		return false;
	}
	
}
