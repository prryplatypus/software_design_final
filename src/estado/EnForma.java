package estado;

public class EnForma implements Estado {

	@Override
	public String getName() {
		return "En forma";
	}

	@Override
	public String getDescripcion() {
		return "Tiene todos los atributos maximos";
	}

	@Override
	public int getVelocidadMax(int original) {
		return original;
	}

	@Override
	public int getDefensaMax(int original) {
		return original;
	}

	@Override
	public int getAtaqueMax(int original) {
		return original;
	}

}
