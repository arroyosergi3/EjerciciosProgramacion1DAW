package capitulo05.barajaDeCartas;


public class Jugador {
	private String nombre;
	private Carta mano[] = new Carta[5];
	
	public Jugador() {
		for (int i = 0; i < mano.length; i++) {
			mano[i] = new Carta();
		}
	}

	
	
	
	
	
	
	
	
	
	//GETTERS;SETTERS Y TOSTRING
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carta[] getMano() {
		return mano;
	}

	public void setMano(Carta[] mano) {
		this.mano = mano;
	}
	
	
//	public String manoToString() {
//		String cartas ="Jugador ";
//		for (int i = 0; i < mano.length; i++) {
//			cartas += mano[i].toString();
//					}
//		return cartas;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


