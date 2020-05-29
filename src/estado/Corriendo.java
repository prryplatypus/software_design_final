package estado;

public class Corriendo implements Estado {

	@Override
	public String getName() {
		return "Corriendo";
	}

	@Override
	public String getDescripcion() {
		return "Esta defendiendose del enemigo";
	}

	@Override
	public int getVelocidadMax(int original) {
		return original;
	}

	@Override
	public int getDefensaMax(int original) {
		return original / 2;
	}

	@Override
	public int getAtaqueMax(int original) {
		return original / 2; // Pierde precision
	}

}
