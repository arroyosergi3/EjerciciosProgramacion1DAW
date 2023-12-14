package capitulo05.bloque01Herencia.coleccionAntiguedades;

public class Joya extends Antiguo{

	private String material;

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Joya [material=" + material + ", añoF=" + añoF + ", precio=" + precio + ", origen=" + origen + "]";
	}
	
	
	
	
	
	
}
