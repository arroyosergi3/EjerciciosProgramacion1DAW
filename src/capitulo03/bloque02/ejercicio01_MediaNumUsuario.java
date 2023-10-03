package capitulo03.bloque02;

import java.util.Scanner;

public class ejercicio01_MediaNumUsuario {

	public static void main(String[] args) {
		int num, sum = 0, repeat;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿Cuantos numeros vas a sumar?");
		repeat = sc.nextInt();
		
		for (int i = 0; i < repeat; i++) {
			System.out.println("Dame un número");

			num = sc.nextInt();
			sum += num;
	}
		System.out.println("La media de los valores es : " + (sum / (float)repeat));
	}

}
