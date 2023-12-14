package capitulo05.bloque01Herencia.coleccionAntiguedades;

public class Ceramica extends Antiguo{

	private String estilo;

	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	@Override
	public String toString() {
		return "Ceramica [estilo=" + estilo + ", añoF=" + añoF + ", precio=" + precio + ", origen=" + origen + "]";
	}
	
	
	
	
}
