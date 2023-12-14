package capitulo05.bloque01Herencia.articulosComestibles;

public class Perecederos extends Articulo{

	private String fCad;

	
	
	public String getfCad() {
		return fCad;
	}



	public void setfCad(String fCad) {
		this.fCad = fCad;
	}



	@Override
	public String toString() {
		return "Perecedero [fCad=" + fCad + ", codigo=" + codigo + ", precio=" + precio + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
	
	
}
