import personajes.Personaje;
import factorias.FactoriaEnemigos;
import personajes.Enemigo;
import personajes.Jugador;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import acciones.Accion;
import calculos.Calculador;

public class main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		FactoriaEnemigos enemigos = new FactoriaEnemigos();
		Jugador jugador  = Jugador.crearJugador(scanner);
		Random rand = new Random();
		Enemigo enemigo;

		/**
		 * MUNDO 1
		 */
		enemigo = enemigos.getEnemigo(
				Personaje.MAX_VELOCIDAD/2,
				Personaje.MAX_DEFENSA,
				Personaje.MAX_ATAQUE/3
		);
		if (rand.nextBoolean()) comenzarLucha("mundo 1", jugador, enemigo);
		else                    comenzarLucha("mundo 1", enemigo, jugador);
		
		/**
		 * MUNDO 2
		 */
		enemigo = enemigos.getEnemigo(
				Personaje.MAX_VELOCIDAD,
				Personaje.MAX_DEFENSA/2,
				Personaje.MAX_ATAQUE/2
		);
		if (rand.nextBoolean()) comenzarLucha("mundo 2", jugador, enemigo);
		else                    comenzarLucha("mundo 2", enemigo, jugador);
	}
	
	private static void comenzarLucha(String mundo, Personaje primero, Personaje segundo)
	{
		Accion accion_seleccionada;
		Calculador calculador = Calculador.getCalculador();
		
		System.out.println("¡Bienvenid@ al " + mundo + "! En esta ocasion luchan " + primero.getNombre() + " y " + segundo.getNombre());
		System.out.println(primero.getNombre() + " comienza la lucha.");
		
		esperar(5);
		mostrarPersonajes(primero, segundo);
		esperar(3);
		while (primero.getVidas() > 0 && segundo.getVidas() > 0) {
			accion_seleccionada = primero.getSiguienteAccion();
			if (accion_seleccionada.esAtaque()) {
				segundo.cambiarVidas(calculador.getCambioVidasPersonaje(segundo, accion_seleccionada));
				segundo.actualizarEstado(accion_seleccionada);
				if (segundo.getVidas() <= 0) break;
			}
			else if (accion_seleccionada.esDefensa() || accion_seleccionada.esEvasion()){
				primero.cambiarVidas(calculador.getCambioVidasPersonaje(primero, accion_seleccionada));
				primero.actualizarEstado(accion_seleccionada);
			}
			esperar(5);
			mostrarPersonajes(primero, segundo);
			esperar(3);
			
			accion_seleccionada = segundo.getSiguienteAccion();
			if (accion_seleccionada.esAtaque()) {
				primero.cambiarVidas(calculador.getCambioVidasPersonaje(primero, accion_seleccionada));
				primero.actualizarEstado(accion_seleccionada);
				if (primero.getVidas() <= 0) break;
			}
			else if (accion_seleccionada.esDefensa() || accion_seleccionada.esEvasion()){
				segundo.cambiarVidas(calculador.getCambioVidasPersonaje(segundo, accion_seleccionada));
				segundo.actualizarEstado(accion_seleccionada);
			}
			esperar(5);
			mostrarPersonajes(primero, segundo);
			esperar(3);
		}
		
		if   (primero.getVidas() <= 0) System.out.println(primero.getNombre() + " ha perdido!");
		else System.out.println(segundo.getNombre() + " ha perdido!");
		esperar(2);
		System.out.println("--Fin de la batalla--");
	}
	
	private static void esperar(int segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static void mostrarPersonajes(Personaje personaje1, Personaje personaje2) {
		System.out.println("===== ESTADISTICAS =====");
		System.out.println("Jugador:");
		if (personaje1.esJugador()) personaje1.mostrarEstadisticas();
		if (personaje2.esJugador()) personaje2.mostrarEstadisticas();
		System.out.println("Enemigo:");
		if (! personaje1.esJugador()) personaje1.mostrarEstadisticas();
		if (! personaje2.esJugador()) personaje2.mostrarEstadisticas();
		System.out.println("========================");
	}
		
}
