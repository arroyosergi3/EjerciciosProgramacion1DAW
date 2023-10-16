package capitulo03.bloque05;

import java.util.Scanner;

public class ejercicio04_JuegoNumAleatorio {
	public static void main(String[] args) {
		float sum = 0;
		int mayor = 0, menor = 0;
		int numDado = -1;
		int random = (int) Math.round(Math.random() * 100);
		Scanner sc = new Scanner(System.in);
		while (numDado != random) {
			System.out.println("Introducce el numero que estoy pensando");
			numDado = sc.nextInt();
			if (numDado < random)
				System.out.println("El numero es mayor");
			if (numDado > random)
				System.out.println("El numero es menor");
		}
		System.out.println("Enhorabuena es correcto");
	}
}
