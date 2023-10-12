package capitulo04.bloque01;

import java.util.Scanner;

public class ejercicio06_ArrayYSumarIndicesPares {
	public static void main(String[] args) {

		int numeros[] = new int[150];
		int pairAdd = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
			if (i % 2 == 0) pairAdd += numeros[i];
			
		}
		System.out.println("\nLa suma de los números con índices pares es " + pairAdd);

		
}
}
