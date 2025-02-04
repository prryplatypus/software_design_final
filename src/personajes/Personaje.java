package personajes;

import java.util.concurrent.ThreadLocalRandom;

import acciones.Accion;
import acciones.AccionMagnificada;
import acciones.AtaqueBomba;
import acciones.AtaqueBombaNuclear;
import acciones.AtaqueEspada;
import acciones.AtaqueEspadaMagnificado;
import acciones.Defensa;
import acciones.DefensaReforzada;
import acciones.Evasion;
import acciones.EvasionRapida;
import estado.Cansado;
import estado.Corriendo;
import estado.EnForma;
import estado.Estado;
import estado.Herido;

public abstract class Personaje {
	public final static int MAX_VELOCIDAD = 20;
	public final static int MAX_DEFENSA   = 20;
	public final static int MAX_ATAQUE    = 20;
	public final static int MAX_VIDAS     = 100;

	protected int velocidad;
	protected int defensa;
	protected int ataque;
	protected int vidas;
	protected int ult_cambio_vidas = 0;

	protected Estado  estado;
	protected Boolean es_jugador;
	protected String  nombre;
	
	public abstract Accion getSiguienteAccion();
	
	public Personaje(String nombre, Boolean es_jugador, int velocidad, int defensa, int ataque) {
		this.nombre     = nombre;
		this.es_jugador = es_jugador;
		this.estado     = new EnForma();
		this.velocidad  = velocidad;
		this.defensa    = defensa;
		this.ataque     = ataque;
		this.vidas      = Personaje.MAX_VIDAS;
	}
	
	public String  getNombre() {
		return this.nombre;
	}

	public Boolean esJugador() {
		return this.es_jugador;
	}
	
	public int getVelocidadMax() {
		return this.estado.getVelocidadMax(this.velocidad);
	}
	
	public int getDefensaMax() {
		return this.estado.getDefensaMax(this.defensa);
	}
	
	public int getAtaqueMax() {
		return this.estado.getAtaqueMax(this.ataque);
	}
	
	public int getVidas() {
		return this.vidas;
	}
	
	public void cambiarVidas(int cambio) {
		this.vidas += cambio;
		this.ult_cambio_vidas = cambio;
		this.mostrarCambioVidas();
	}
	
	public int getUltimoCambioVidas() {
		return this.ult_cambio_vidas;
	}
	
	private void mostrarCambioVidas() {
		if (this.getUltimoCambioVidas() < 0) {
			System.out.println(this.getNombre() + " ha perdido " + -this.getUltimoCambioVidas() + " vidas.");
		}
		else if (this.getUltimoCambioVidas() > 0) {
			System.out.println(this.getNombre() + " ha recuperado " + this.getUltimoCambioVidas() + " vidas.");	
		}
		else {
			System.out.println(this.getNombre() + " no ha perdido ni recuperado ninguna vida.");
		}
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	
	public void actualizarEstado(Accion accion) {
		if ((accion.esAtaque() && accion instanceof AccionMagnificada) || this.getVidas() < Personaje.MAX_VIDAS * 0.15) {
			this.estado = new Herido();
		} 
		else if (accion.esEvasion()) {
			if (this.getEstado() instanceof Corriendo || accion instanceof AccionMagnificada) {
				this.estado = new Cansado();
			} else {
				this.estado = new Corriendo();
			}
		}
		else {
			this.estado = new EnForma();
		}
	}
	
	public void mostrarEstadisticas() {
		System.out.println("|=> Nombre: " + this.getNombre());
		System.out.println("|=> Estado: " + this.getEstado().getName());
		System.out.println("|=> Vidas restantes: " + this.getVidas());
	}
	
	protected Accion getAtaque() {
		Accion accion = (ThreadLocalRandom.current().nextInt(1, 5) == 1) ? new AtaqueBomba() : new AtaqueEspada(); // 25% probabilidad bomba
		if (this.getAtaqueMax() > Personaje.MAX_ATAQUE * 0.5) { // Si tiene suficiente fuerza
			if      (accion instanceof AtaqueBomba)  accion = new AtaqueBombaNuclear(accion);
			else if (accion instanceof AtaqueEspada) accion = new AtaqueEspadaMagnificado(accion);
		}	
		return accion;
	}
	
	protected Accion getDefensa() {
		Accion accion = new Defensa();
		if (this.getDefensaMax() > Personaje.MAX_DEFENSA * 0.5) {
			if (accion instanceof Defensa) accion = new DefensaReforzada(accion);
		}
		return accion;
	}
	
	protected Accion getEvasion() {
		Accion accion = new Evasion();
		if (this.getVelocidadMax() > Personaje.MAX_VELOCIDAD * 0.5) {
			if (accion instanceof Evasion) accion = new EvasionRapida(accion);
		}
		return accion;
	}
}
