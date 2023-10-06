package capitulo03.bloque04;

import java.util.Scanner;

public class ejercicio02_NumPrimoONoConLimiteSinFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lowLimit, highLimit;

		System.out.println("Introduce un limite inferior");
		lowLimit = sc.nextInt();
		System.out.println("Introduce otro limite maximo");
		highLimit = sc.nextInt();

		while (lowLimit < highLimit) {
			boolean esPrimo = true;
			int i = 2;
			while (i < lowLimit) {
				if (lowLimit % i == 0)
					esPrimo = false;
				i++;
			}

			if (esPrimo == true)
				System.out.println("El número " + lowLimit + " es primo");
			else
				System.out.println("El número " + lowLimit + " es compuesto");
			lowLimit++;

		}
	}

}
