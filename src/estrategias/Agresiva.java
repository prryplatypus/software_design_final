package estrategias;

public class Agresiva implements Estrategia {

	@Override
	public String getNombre() {
		return "Agresiva";
	}

	@Override
	public String getDescripcion() {
		return "Prioriza quitar vidas al enemigo";
	}

}
