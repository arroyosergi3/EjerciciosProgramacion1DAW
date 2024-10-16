package capitulo05.barajaDeCartas;

public class Carta {

	private int valor, id;
	private String palo;
	
	
	
	//Constructor
	public Carta () {
		
	}
	
	//GETTERS Y SETTER // TOSTRING
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		switch(valor) {
		case 1:
			sb.append("As"); break;
		case 11:
			sb.append("J"); break;
		case 12:
			sb.append("Q"); break;
		case 13:
			sb.append("K"); break;
		default:
			sb.append(valor);
		}
		
		sb.append(":");
		
		if (palo.equalsIgnoreCase("Corazones")) sb.append("C");
		else if (palo.equalsIgnoreCase("Tréboles")) sb.append("T");
		else if (palo.equalsIgnoreCase("Diamantes")) sb.append("D");
		else sb.append("P");
		
		return sb.toString();
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
