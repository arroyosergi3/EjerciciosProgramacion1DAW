package capitulo01.bloque01;

import java.util.Scanner;

public class ejercicio04_MostrarMedia {

	public static void main(String[] args) {
		double num1;
		double num2;
		double num3;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número : ");
		num1 = sc.nextDouble();
		
		System.out.println("Introduzca un número : ");
		num2 = sc.nextDouble();
		
		System.out.println("Introduzca un número : ");
		num3 = sc.nextDouble();
		
		
		System.out.println("La media de los tres números es: " + ((num1 + num2 + num3) / 3));
		
	}

}
