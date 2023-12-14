package capitulo05.bloque01Herencia.coleccionAntiguedades;

public class Alfombra extends Antiguo {

	public Alfombra() {
		
	}
	
	private int largo, ancho, grosor;

	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getGrosor() {
		return grosor;
	}
	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}
	@Override
	public String toString() {
		return "Alfombra [largo=" + largo + ", ancho=" + ancho + ", grosor=" + grosor + ", añoF=" + añoF + ", precio="
				+ precio + ", origen=" + origen + "]";
	}
	
	
	
}
