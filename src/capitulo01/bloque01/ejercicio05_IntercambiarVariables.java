package capitulo01.bloque01;

import java.util.Scanner;

public class ejercicio05_IntercambiarVariables {

	public static void main(String[] args) {
		double num1;
		double num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número : ");
		num1 = sc.nextDouble();
		
		System.out.println("Introduzca un número : ");
		num2 = sc.nextDouble();
		
		System.out.println("Valor de la variable 1 antes : " + num1);
		System.out.println("Valor de la variable 2 antes : " + num2);
		System.out.println("Valor de la variable 1 después : " + (num1 + num2 - num1));
		System.out.println("Valor de la variable 2 después : " + (num1 + num2 - num2));
		
		
		
		
	}

}
