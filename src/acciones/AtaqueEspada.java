package acciones;


public class AtaqueEspada implements Accion {
		
	@Override
	public String getNombre() {
		return "Ataque con espada";
	}
	
	@Override
	public int getCambioVidas() {
		return -5;
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
