package estado;

public class Herido implements Estado {

	@Override
	public String getName() {
		return "Herido";
	}

	@Override
	public String getDescripcion() {
		return "Le cuesta mucho cualquier accion";
	}

	@Override
	public int getVelocidadMax(int original) {
		return original / 4;
	}

	@Override
	public int getDefensaMax(int original) {
		return original / 2;
	}

	@Override
	public int getAtaqueMax(int original) {
		return original / 2;
	}

}
