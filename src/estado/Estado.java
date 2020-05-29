package estado;

public interface Estado {
	public String getName();
	public String getDescripcion();
	
	// Seg�n el estado en el que se encuentre el personaje, puede perder ciertas habilidades
	public int getVelocidadMax(int original);
	public int getDefensaMax(int original);
	public int getAtaqueMax(int original);
	
}