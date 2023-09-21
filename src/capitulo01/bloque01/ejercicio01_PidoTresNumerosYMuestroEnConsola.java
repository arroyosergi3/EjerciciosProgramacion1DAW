package capitulo01.bloque01;

import java.util.Scanner;

public class ejercicio01_PidoTresNumerosYMuestroEnConsola {

	public static void main(String[] args) {

		int numEntero;
		float numFlotante;
		double numDouble;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		numEntero = sc.nextInt();
		System.out.println("Introduzca un número flotante: ");
		numFlotante = sc.nextFloat();
		System.out.println("Introduzca un número entero: ");
		numDouble = sc.nextDouble();
		System.out.println("El entero es: " + numEntero +
				" el flotante es: " + numFlotante +
				" el double es " + numDouble);
	}

}
