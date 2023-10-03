package capitulo03.bloque03;

import java.util.Scanner;

public class ejercicio01_PideNumYSacarSumYMedia {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int num = 1, high = 0, low = 0;
	

	for (int i = 0; num != 0; i++) {
		System.out.println("Introduce un número");
		num = sc.nextInt();
		if (num == 0) break;
		if (num > high ) high = num;
		if (num < low ) low = num;
		
		
	}
	
	System.out.println("El número mayor es: " + high  );
	System.out.println("El número menor es: " + low);

}
}
