import acciones.Accion;
import calculos.Calculador;
import personajes.Personaje;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lleva los turnos, cuando ambos han elegido accion,
		// usa calculador para saber cuánto cambiar las vidas,
		// las cambia, muestraAcciones y mira si los personajes siguen vivos o si hay que parar
	}
	
	public void mostrarAcciones(Personaje personaje, Accion accion1, Accion accion2) {
		Calculador calculador = Calculador.getCalculador();
		if (! (calculador.esVictima(personaje, accion1) || calculador.esVictima(personaje, accion2))) { // No es víctima de ninguno 
			System.out.println(personaje.getNombre() + " no ha sufrido ningun ataque");
		} 
		else if (calculador.esVictima(personaje, accion1) && ! calculador.esVictima(personaje, accion2)) { // Es víctima sólo de accion1
			if (calculador.esAtaque(accion1)) System.out.println(personaje.getNombre() + " ha sufrido un " + accion1.getNombre());
			else System.out.println(personaje.getNombre() + " no ha sufrido ningun ataque");
		} 
		else if (calculador.esVictima(personaje, accion2) && ! calculador.esVictima(personaje, accion1)) { // Es víctima sólo de acción2
			if (calculador.esAtaque(accion2)) System.out.println(personaje.getNombre() + " ha sufrido un " + accion2.getNombre());
			else System.out.println(personaje.getNombre() + " no ha sufrido ningun ataque");
		}
		else { // Es víctima de ambas acciones
			if  (calculador.esAtaque(accion1)) {
				System.out.println(personaje.getNombre() + " ha sufrido un " + accion1.getNombre());
				if (calculador.esAtaque(accion2)) {
					System.out.println("Ademas, ha sufrido un " + accion2.getNombre());
				}
				else {
					System.out.println("Por suerte, se ha protegido con una " + accion2.getNombre());
				}
			}
			else if (calculador.esAtaque(accion2)) {
				System.out.println(personaje.getNombre() + " ha sufrido un " + accion2.getNombre());
				System.out.println("Por suerte, se ha protegido con una " + accion1.getNombre());
			}
			else System.out.println(personaje.getNombre() + " no ha sufrido ningun ataque");
		}
	}

}
