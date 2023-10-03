package capitulo03.bloque02;

import java.util.Scanner;

public class ejercicio02_MayYMenDeNumUsuario {

	public static void main(String[] args) {
		
		int num = 0, high, low, repeat;
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuantos numeros vas a introducir?");
		repeat = sc.nextInt();
		
		for (int i = 0; i < 1; i++) {
			System.out.println("Dame un número");
			num = sc.nextInt();
		}
		high = num;
		low = num;
		
		for (int i = 0; i < (repeat - 1); i++) {
			System.out.println("Dame un número");
			num = sc.nextInt();
			if (num > high) high = num;
			else if (num < low) low = num;
	}
		System.out.println("El número mayor es " + high);
		System.out.println("El número menor es " + low);

		
	}

}
