package capitulo02.bloque01;

import java.util.Scanner;

public class ejercicio03_Pido5VariablesYMuestroMayor {

	public static void main(String[] args) {

		double num1, num2, num3, num4, num5, aux, aux1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		num1 = sc.nextDouble();
		
		System.out.println("Introduce otro número: ");
		num2 = sc.nextDouble();
		
		System.out.println("Introduce otro número: ");
		num3 = sc.nextDouble();
		
		System.out.println("Introduce otro número: ");
		num4 = sc.nextDouble();
		
		System.out.println("Introduce otro número: ");
		num5 = sc.nextDouble();
		
		if (num1 > num2) {
			aux = num1;
		}
		else {
			aux = num2;
		}
		if (num3 > num4) {
			aux1 = num3;
		}
		else {
			aux1 = num4;
		}
		if(aux > num5) {
			aux = aux;
		}
		else {
			aux = num5;
		}
		if(aux1 > aux) {
			System.out.println("El número mayor es " + (int)aux1);
		}
		else {
			System.out.println("El número mayor es " + (int)aux);
		}
	}
}
			
