package capitulo05.barajaDeCartas;


public class Poker {

	
	private Jugador jugadores[] = new Jugador[5];
	private Baraja baraja = new Baraja();
	private String nombre [] = new String [] {"Valera", "Alba","Ale", "Georgie","Javi"};
	
	public Poker() {
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugador();
			jugadores[i].setNombre(nombre[i]);
			baraja.repartirCartas(jugadores[i]);
		}
		
	}
	
	
	
	
//	public void repartir() {
//		for (int i = 0; i < jugadores.length; i++) {
//			baraja.repartirCartas(jugadores[i]);
//		}
//	}
	
	
	public void imprimirManos() {
		for (int i = 0; i < jugadores.length; i++) {
			for (int j = 0; j < jugadores[i].getMano().length; j++) {
				System.out.println(jugadores[i].getMano());
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
