package capitulo05.invasionTierracV2Herencia;

public class Personaje {
	protected String nombre;
	protected int puntosVida;
	protected boolean vivo;
	protected int disparosRecibidos = 0;
	
	public Personaje() {
		puntosVida = (utils.utils.obtenerNumeroAzar(50, 100));
		vivo = (true);
	}
	
	
	
	public void recibirDisparo() {
		puntosVida -= utils.utils.obtenerNumeroAzar(5, 25);
		if(puntosVida <= 0) {
			vivo = false;
			puntosVida = 0;
			
		}
		disparosRecibidos++;
	}
	
	
	
	
	
	//GETTERS; SETTERS Y TOSTRING 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String newNombre) {
		nombre = newNombre;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int newPuntos) {
		puntosVida = newPuntos;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean newVivo) {
		vivo = newVivo;
	}
	public int getDisparosRecibidos() {
		return disparosRecibidos;
	}
	public void setDisparosRecibidos(int newDisparosRecibidos) {
		newDisparosRecibidos = disparosRecibidos;
	}
	public String toString () {
		return nombre+ ":"+ puntosVida +":"+ vivo+":"+disparosRecibidos;
	}
	
	
	
	
	
}
