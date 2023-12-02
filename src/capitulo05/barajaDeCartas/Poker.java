package capitulo05.barajaDeCartas;


public class Poker {

	
	Jugador jugadores[] = new Jugador[5];
	Baraja baraja = new Baraja();
	
	
	public Poker() {
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugador();
		}
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i].setNombre("Jugador " + i);
			
		}
	}
	
	
	
	
	public void repartir() {
		for (int i = 0; i < jugadores.length; i++) {
			baraja.repartirCartas(jugadores[i]);
		}
	}
	
	
	public void imprimirManos() {
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println(jugadores[i].manoToString());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
