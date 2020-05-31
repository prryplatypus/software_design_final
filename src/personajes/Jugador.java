package personajes;

import java.util.Scanner;

import acciones.Accion;

public class Jugador extends Personaje {
	private Scanner keyboard;

	public Jugador(Scanner scanner, String nombre, int velocidad, int defensa, int ataque) {
		super(nombre, true, velocidad, defensa, ataque);
		this.keyboard = scanner;
	}

	@Override
	public Accion getSiguienteAccion() {
		int eleccion;
	    System.out.println("1) Atacar");
	    System.out.println("2) Defender");
	    System.out.println("3) Evadir");
	    System.out.print("Elija la accion que desea tomar (0-3): ");

	    do {
	    	while(!keyboard.hasNextInt()) {
		    	keyboard.next();
		    }
	    	eleccion = keyboard.nextInt();
	    } while (eleccion < 1 || eleccion > 3);
	    
	    switch(eleccion) {
	    	case 1: return this.getAtaque();
	    	case 2: return this.getDefensa();
	    	case 3: return this.getEvasion();
	    	default: return null;
	    }
	}
	
	public static Jugador crearJugador(Scanner keyboard) {
	    String nombre;
	    int velocidad, defensa, ataque;
	    do {
	    	System.out.print("Introduzca el nombre de su jugador: ");
	    	nombre = keyboard.nextLine();
	    } while (nombre.isBlank() || nombre.isEmpty());
	    do {
	    	System.out.print("Introduzca la velocidad de su jugador (1-"+Personaje.MAX_VELOCIDAD+"): ");
	    	while(!keyboard.hasNextInt()) {
		    	keyboard.next();
		    }
	    	velocidad = keyboard.nextInt();
	    } while (velocidad < 1 || velocidad > Personaje.MAX_VELOCIDAD);
	    do {
	    	System.out.print("Introduzca la defensa de su jugador (1-"+Personaje.MAX_DEFENSA+"): ");
	    	while(!keyboard.hasNextInt()) {
		    	keyboard.next();
		    }
	    	defensa = keyboard.nextInt();
	    } while (defensa < 1 || defensa > Personaje.MAX_DEFENSA);
	    do {
	    	System.out.print("Introduzca el ataque de su jugador (1-"+Personaje.MAX_ATAQUE+"): ");
	    	while(!keyboard.hasNextInt()) {
		    	keyboard.next();
		    }
	    	ataque = keyboard.nextInt();
	    } while (ataque < 1 || ataque > Personaje.MAX_ATAQUE);
	    System.out.println();
	    
	    return new Jugador(keyboard, nombre, velocidad, defensa, ataque);
	}
}
