package capitulo02.bloque01;

import java.util.Scanner;

public class ejercicio01_Pido2VariablesYMuestroMayor {

	public static void main(String[] args) {

		double num1, num2;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		num1 = sc.nextDouble();
		
		System.out.println("Introduce otro número: ");
		num2 = sc.nextDouble();
		
		if (num1 > num2) {
			System.out.println("El número menor es: " + (int)num1);
		}
		else {
			System.out.println("El número menor es: " + (int)num2);
		}
	}

}
