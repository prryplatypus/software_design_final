package calculos;

import acciones.Accion;
import personajes.Personaje;

public class Calculador {

	private static Calculador calculador = new Calculador(); // Única instancia existente de esta clase

	private Calculador(){} // Privado para que no pueda ser instanciada desde fuera

	public static Calculador getCalculador(){
	   return calculador;
	}

	public int getCambioVidasTotalPersonaje(Personaje personaje, Accion accion1, Accion accion2){
		int cambio_vidas;
		if (! (esVictima(personaje, accion1) || esVictima(personaje, accion2))) {
			cambio_vidas = 0;
		}
		else if (accion1.getVictima() == accion2.getVictima()) {
			cambio_vidas = getMaxCambioVidas(personaje, accion1.getCambioVidas() + accion2.getCambioVidas());
		}
		else if (accion1.getVictima() == personaje) {
			cambio_vidas = getMaxCambioVidas(personaje, accion1.getCambioVidas());
		}
		else {
			cambio_vidas = getMaxCambioVidas(personaje, accion2.getCambioVidas());
		}
		
		return cambio_vidas;
	}
	
	public Boolean esAtacado(Personaje personaje, Accion accion1, Accion accion2) {
		return (esVictima(personaje, accion1) || esVictima(personaje, accion2))
			   && (esAtaque(accion1) || esAtaque(accion2));
	}
	
	public Boolean esVictima(Personaje personaje, Accion accion) {
		return accion.getVictima() == personaje;
	}
	
	public Boolean esAtaque(Accion accion) {
		return accion.getCambioVidas() < 0;
	}
	
	protected int getMaxCambioVidas(Personaje personaje, int cambio_deseado) {
		if (cambio_deseado >= 0) return 0;
		else if (personaje.getVidas() + cambio_deseado < 0) return personaje.getVidas();
		else return cambio_deseado;
	}
}
