package estado;

public class Cansado implements Estado {

	@Override
	public String getName() {
		return "Cansado";
	}

	@Override
	public String getDescripcion() {
		return "No puede correr mucho ni apuntar con precision";
	}

	@Override
	public int getVelocidadMax(int original) {
		return original / 3;
	}

	@Override
	public int getDefensaMax(int original) {
		return original;
	}

	@Override
	public int getAtaqueMax(int original) {
		return original / 2;
	}

}
