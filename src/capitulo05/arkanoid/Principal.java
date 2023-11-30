package capitulo05.arkanoid;

public class Principal {

	public static void main(String[] args) {
		boolean seguirJugando = false ;
		Juego juego = new Juego();
		
		do {
			juego.ronda();
			
			
			
			
		}while(seguirJugando);
		
		System.out.println("El primer ladrillo en ser destruido ha sido "+ juego.primero.toString());
		System.out.println("El último ladrillo en ser destruido ha sido "+ juego.ultimo.toString());
		
		
	}

}
