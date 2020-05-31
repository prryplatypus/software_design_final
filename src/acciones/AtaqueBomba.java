package acciones;

public class AtaqueBomba implements Accion {
		
	@Override
	public String getNombre() {
		return "Ataque con bomba";
	}
	
	@Override
	public int getCambioVidas() {
		return -15;
	}
	
	@Override
	public Boolean esAtaque() {
		return true;
	}
	
	@Override
	public Boolean esDefensa() {
		return false;
	}
	
	@Override
	public Boolean esEvasion() {
		return false;
	}
	
}
