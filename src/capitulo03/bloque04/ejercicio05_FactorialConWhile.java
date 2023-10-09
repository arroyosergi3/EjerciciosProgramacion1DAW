package capitulo03.bloque04;

import java.util.Scanner;

public class ejercicio05_FactorialConWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero cuyo factorial desea conocer:");
		double num = sc.nextDouble();
		double i = num - 1;
		while (i > 1) {
			num *= i;
			i--;
		}
		System.out.println("Valor del factorial: " + num);

	}

}
