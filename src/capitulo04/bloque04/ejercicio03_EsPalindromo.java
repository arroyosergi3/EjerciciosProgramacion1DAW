package capitulo04.bloque04;

import java.util.Scanner;

public class ejercicio03_EsPalindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		boolean esPalindromo;
		
		System.out.println("Introduce una cadena de carácteres");
		str = sc.nextLine();
		esPalindromo = esPalindromo(str);
		System.out.println();
		if (esPalindromo == true)
			System.out.println("Es Palíndromo");
		else
			System.out.println("No es Palíndromo");
	}

	public static boolean esPalindromo(String cad) {

		for (int i = 0; i < cad.length(); i++) {

			if (cad.charAt(i) != cad.charAt(cad.length() - (1 - i))) {
				return false;
			} else
				return true;

		}
		return false;
	}

}
