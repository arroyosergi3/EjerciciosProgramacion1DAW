package capitulo02.bloque01;

import java.util.Scanner;

public class ejercicio06_PidoNumeroIndicoSiEsParOImpar {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número:");
		num = sc.nextInt();
		
		if (num %2 == 0) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El número es impar");
		}

	}

}
