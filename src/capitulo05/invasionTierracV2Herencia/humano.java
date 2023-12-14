package capitulo05.invasionTierracV2Herencia;

public class humano extends Personaje{

	
	public humano() {
		super();
		this.puntosVida+=50;
	}
	
	
	@Override
	public String toString() {
		return "Humano = " + super.toString();
	}
	

	
	
	
	
}
