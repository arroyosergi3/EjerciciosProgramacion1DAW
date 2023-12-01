package capitulo05.arkanoid;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		boolean seguirJugando = false ;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			Juego juego = new Juego();
			juego.ronda();
//			System.out.println("El primer ladrillo en ser destruido ha sido "+ juego.primero.toString());
//			System.out.println("El último ladrillo en ser destruido ha sido "+ juego.ultimo.toString());
			
			
			System.out.println("¿Quieres seguir jugando?\n1: Si \n2: No");
			int n = sc.nextInt();
			if(n == 1) {
				seguirJugando = true;
			}
			else if(n == 2) {
				System.out.println("FIN DEL JUEGO");
				break;
			}
			else if (n > 2 || n<0) {
				System.err.println("OPCION NO VÁLIDA");
			}
			
			
			
		}while(seguirJugando);
		sc.close();
		
		
		
	}

}
