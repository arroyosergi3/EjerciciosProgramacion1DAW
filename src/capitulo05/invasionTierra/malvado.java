package capitulo05.invasionTierra;

public class malvado {

	private String nombre;
	private int puntosVida;
	private boolean vivo;
	private int disparosRecibidos = 0;
	
	
	
	public void recibirDisparo() {
		puntosVida -= utils.utils.obtenerNumeroAzar(5, 25);
		if(puntosVida <= 0) {
			vivo = false;
			puntosVida = 0;
		}
		disparosRecibidos ++;
	}
	
	
	public malvado() {
		puntosVida = (utils.utils.obtenerNumeroAzar(50, 100));
		vivo = (true);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String newNombre) {
		nombre = newNombre;
	}
	
	public int getPuntosVida() {nombre
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
	
	
	public String toString () {nombre
		return nombre+ ":"+ puntosVida +":"+ vivo+":" + disparosRecibidos;
	}
	
	public int getDisparosRecibidos() {
		return disparosRecibidos;
	}
	
	public void setDisparosRecibidos(int newDisparosRecibidos) {
		newDisparosRecibidos = disparosRecibidos;
	}
	
	
	
	
	
	
	
	
	
}
