package capitulo01.bloque01;

import java.util.Scanner;

public class ejercicio02_MostrarNumeroAContinuacion {

	public static void main(String[] args) {

		int numEntero;
		float numFlotante;
		double numDouble;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		numEntero = sc.nextInt();
		System.out.println("El número entero es " + numEntero);
		
		System.out.println("Introduzca un número flotante: ");
		numFlotante = sc.nextFloat();
		System.out.println("El número flotante es " + numFlotante);
		
		System.out.println("Introduzca un número double: ");
		numDouble = sc.nextDouble();
		System.out.println("El double es: " + numDouble);
	}
}
