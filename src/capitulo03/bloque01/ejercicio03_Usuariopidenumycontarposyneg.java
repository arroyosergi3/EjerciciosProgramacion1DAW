package capitulo03.bloque01;

import java.util.Scanner;

public class ejercicio03_Usuariopidenumycontarposyneg {

	public static void main(String[] args) {

		int num, sumneg = 0, sumpos = 0, repeat;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿Cuantos numeros vas a sumar?");
		repeat = sc.nextInt();
		System.out.println("Dame un número");
		for (int i = 0; i < repeat; i++) {

			num = sc.nextInt();
			if (num < 0) sumneg += 1;
			if (num > 0) sumpos += 1;
			
	}
		System.out.println("Se han introducido " + sumpos + " números positivos");
		System.out.println("Se han introducido " + sumneg + " números negativos");

}
}
