package capitulo03.bloque03;

import java.util.Scanner;

public class ejercicio01_PideNumYSacarSumYMedia {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int num = 1, numPos = 0, numNeg = 0;
	

	for (int i = 0; num != 0; i++) {
		System.out.println("Introduce un número");
		num = sc.nextInt();
		if (num == 0) break;
		if (num < 0) numNeg++;
		else numPos++;
	}
	System.out.println(numPos + " números son positivos");
	System.out.println(numNeg + " números son negativos");
}
}
