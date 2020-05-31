package calculos;

import acciones.Accion;
import personajes.Personaje;

public class Calculador {

	private static Calculador calculador = new Calculador(); // Única instancia existente de esta clase

	private Calculador(){} // Privado para que no pueda ser instanciada desde fuera

	public static Calculador getCalculador(){
	   return calculador;
	}

	public int getCambioVidasPersonaje(Personaje personaje, Accion accion){
		this.showMensajeAccion(personaje, accion);
		return this.calcularCambioVidas(personaje, accion);
	}
		
	public void showMensajeAccion(Personaje personaje, Accion accion) {
		if (accion.esAtaque()) {
			System.out.print(personaje.getNombre() + " ha sido atacado con: " + accion.getNombre() + ". ");
		}
		else if (accion.esDefensa()) {
			System.out.print(personaje.getNombre() + " se ha defendido con: " + accion.getNombre() + ". ");
		}
		else if (accion.esEvasion()) {
			System.out.print(personaje.getNombre() + " ha evadido el ataque con: " + accion.getNombre() + ". ");
		}
	}
	
	private int calcularCambioVidas(Personaje personaje, Accion accion) {
		if (accion.esDefensa() || accion.esEvasion()) {
			if (personaje.getUltimoCambioVidas() >= 0) {
				System.out.println("En el ultimo turno no ha perdido ninguna vida.");
				return 0;
			} else {
				int puede_ganar = -personaje.getUltimoCambioVidas();
				System.out.println("En el ultimo turno ha perdido " + puede_ganar + " vida" + ((puede_ganar > 0) ? "s" : "") + ".");
				if (accion.getCambioVidas() > puede_ganar) return puede_ganar;
			}
		} else {
			int puede_perder = -personaje.getVidas();
			if (accion.getCambioVidas() < puede_perder) return puede_perder;
		}
		
		return accion.getCambioVidas();
	}
}
