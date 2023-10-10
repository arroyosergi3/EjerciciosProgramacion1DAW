package capitulo03.bloque05;

import java.util.Scanner;

public class ejercicio04_JuegoNumAleatorio {

	public static void main(String[] args) {
		int numDado = 0, cont = 5;
		int random = (int) Math.round(Math.random() * 100);
		Scanner sc = new Scanner(System.in);
		while (numDado != random && cont > 0 ){
			System.out.println("Introduce un número del 0 al 100");
			numDado = sc.nextInt();
			if(numDado < random) System.out.println("El número es mayor");
			if(numDado > random) System.out.println("El número es menor");
			if (numDado == random) System.out.println("Enhorabuena, has acertado");
			cont--;
			if (cont == 0) System.out.println("Lo siento, has perdido");
		}
		
	}

}
