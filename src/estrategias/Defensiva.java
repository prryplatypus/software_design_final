package estrategias;

public class Defensiva implements Estrategia {

	@Override
	public String getNombre() {
		return "Defensiva";
	}

	@Override
	public String getDescripcion() {
		return "Prioriza no perder vidas";
	}

}
