package estrategias;

public class Evasiva implements Estrategia {

	@Override
	public String getNombre() {
		return "Evasiva";
	}

	@Override
	public String getDescripcion() {
		return "Prioriza evitar sufrir ataques";
	}

}
