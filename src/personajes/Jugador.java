package personajes;

import java.util.Scanner;

import acciones.Accion;

public class Jugador extends Personaje {

	public Jugador(String nombre, int velocidad, int defensa, int ataque) {
		super(nombre, true, velocidad, defensa, ataque);
	}

	@Override
	public Accion getSiguienteAccion() {
		int eleccion;
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("1) Atacar");
	    System.out.println("2) Defender");
	    System.out.println("3) Evadir");
	    System.out.print("Elija la accion que desea tomar: ");
	    
	    do {
	    	eleccion = keyboard.nextInt();
	    } while (eleccion < 1 || eleccion > 3);
	    keyboard.close();
	    
	    switch(eleccion) {
	    	case 1: return this.getAtaque();
	    	case 2: return this.getDefensa();
	    	case 3: return this.getEvasion();
	    	default: return null;
	    }
	}
	
	public static Jugador crearJugador() {
	    Scanner keyboard = new Scanner(System.in);
	    String nombre;
	    int velocidad, defensa, ataque;
	    do {
	    	System.out.print("Introduzca el nombre de su jugador: ");
	    	nombre = keyboard.nextLine();
	    } while (nombre.isBlank() || nombre.isEmpty());
	    do {
	    	System.out.print("Introduzca la velocidad de su jugador (1-"+Personaje.MAX_VELOCIDAD+"): ");
	    	velocidad = keyboard.nextInt();
	    } while (velocidad < 1 || velocidad > Personaje.MAX_VELOCIDAD);
	    do {
	    	System.out.print("Introduzca la defensa de su jugador (1-"+Personaje.MAX_DEFENSA+"): ");
	    	defensa = keyboard.nextInt();
	    } while (defensa < 1 || defensa > Personaje.MAX_DEFENSA);
	    do {
	    	System.out.print("Introduzca el ataque de su jugador (1-"+Personaje.MAX_ATAQUE+"): ");
	    	ataque = keyboard.nextInt();
	    } while (ataque < 1 || ataque > Personaje.MAX_ATAQUE);
	    keyboard.close();
	    
	    return new Jugador(nombre, velocidad, defensa, ataque);
	}
}
