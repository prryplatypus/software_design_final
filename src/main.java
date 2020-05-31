
import acciones.Accion;
import calculos.Calculador;
import personajes.Jugador;
import personajes.Personaje;

public class main {

	public static void main(String[] args) {
		Jugador jugador = Jugador.crearJugador();
		jugador.mostrarEstadisticas();
	}
		
}
