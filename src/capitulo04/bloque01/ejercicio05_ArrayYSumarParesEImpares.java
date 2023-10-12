package capitulo04.bloque01;

import java.util.Scanner;

public class ejercicio05_ArrayYSumarParesEImpares {
	public static void main(String[] args) {

		int numeros[] = new int[150];
		int searchedNum;
		int pairAdd = 0, oddAdd = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
			if (numeros[i] % 2 == 0) pairAdd += numeros[i];
			else oddAdd += numeros [i];
		}
		System.out.println("\nLa suma de los números pares es " + pairAdd);
		System.out.println("La suma de los números impares es " + oddAdd);

		
}
}
