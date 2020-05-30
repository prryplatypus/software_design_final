package personajes;

import java.util.concurrent.ThreadLocalRandom;

import acciones.Accion;
import acciones.AtaqueBomba;
import acciones.AtaqueBombaNuclear;
import acciones.AtaqueEspada;
import acciones.AtaqueEspadaMagnificado;
import acciones.Defensa;
import acciones.DefensaReforzada;
import acciones.Evasion;
import acciones.EvasionRapida;
import estado.EnForma;
import estado.Estado;

public abstract class Personaje {
	// Constantes que se usan para tomar decisiones fuera de esta clase
	public final static int MAX_VELOCIDAD = 20;
	public final static int MAX_DEFENSA   = 20;
	public final static int MAX_ATAQUE    = 20;
	public final static int MAX_VIDAS     = 100;

	protected int velocidad;
	protected int defensa;
	protected int ataque;
	protected int vidas;

	protected Estado  estado;
	protected Boolean es_jugador;
	protected String  nombre;
	
	public abstract Accion getSiguienteAccion(Personaje enemigo);
	
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
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	protected Accion getAtaque(Personaje victima) {
		Accion accion = (ThreadLocalRandom.current().nextInt(1, 5) == 1) ? new AtaqueBomba(victima) : new AtaqueEspada(victima); // 25% probabilidad bomba
		if (this.getAtaqueMax() > Personaje.MAX_ATAQUE * 0.75) { // Si tiene suficiente fuerza
			if      (accion instanceof AtaqueBomba)  accion = new AtaqueBombaNuclear(accion);
			else if (accion instanceof AtaqueEspada) accion = new AtaqueEspadaMagnificado(accion);
		}	
		return accion;
	}
	
	protected Accion getDefensa(Personaje victima) {
		Accion accion = new Defensa(victima);
		if (this.getDefensaMax() > Personaje.MAX_DEFENSA * 0.75) {
			if (accion instanceof Defensa) accion = new DefensaReforzada(accion);
		}
		return accion;
	}
	
	protected Accion getEvasion(Personaje victima) {
		Accion accion = new Evasion(victima);
		if (this.getVelocidadMax() > Personaje.MAX_VELOCIDAD * 0.75) {
			if (accion instanceof Evasion) accion = new EvasionRapida(accion);
		}
		return accion;
	}
}
