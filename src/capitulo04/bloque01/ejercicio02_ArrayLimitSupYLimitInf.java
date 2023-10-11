package capitulo04.bloque01;

import java.util.Scanner;

public class ejercicio02_ArrayLimitSupYLimitInf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Establece un número para el límite inferior");
		int botLimit = sc.nextInt();
		System.out.println("Establece un número para el límite superior");
		int topLimit = sc.nextInt();
		
		
		int numeros[] = new int[150];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (topLimit - botLimit) + botLimit);
			System.out.print(numeros[i] + " ");
		
		
		}
	}
}