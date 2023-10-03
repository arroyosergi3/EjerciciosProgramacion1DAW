package capitulo03.bloque03;

import java.util.Scanner;

public class ejercicio01_PideNumYSacarSumYMedia {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int num = 1;
	

	for (int i = 0; num != 0; i++) {
		System.out.println("Introduce un número");
		num = sc.nextInt();
		if (num == 0) break;
		System.out.println(num + " * " + 0 + " = " +(num * 0));
		System.out.println(num + " * " + 1 + " = " +(num * 1));
		System.out.println(num + " * " + 2 + " = " +(num * 2));
		System.out.println(num + " * " + 3 + " = " +(num * 3));
		System.out.println(num + " * " + 4 + " = " +(num * 4));
		System.out.println(num + " * " + 5 + " = " +(num * 5));
		System.out.println(num + " * " + 6 + " = " +(num * 6));
		System.out.println(num + " * " + 7 + " = " +(num * 7));
		System.out.println(num + " * " + 8 + " = " +(num * 8));
		System.out.println(num + " * " + 9 + " = " +(num * 9));
		System.out.println(num + " * " + 10 + " = " +(num * 10));
		
		
		
	}
}
}
