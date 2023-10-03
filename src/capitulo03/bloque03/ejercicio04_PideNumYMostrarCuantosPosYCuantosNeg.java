package capitulo03.bloque03;

import java.util.Scanner;

public class ejercicio04_PideNumYMostrarCuantosPosYCuantosNeg {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int num = 1, sumAll = 0, rep=0;
	
	
	for (int i = 0; num != 0; i++) {
		System.out.println("Introduce un número");
		num = sc.nextInt();
		sumAll += num;
		rep = i;
	}
	
	System.out.println("La suma de los número es: " + sumAll);
	System.out.println("La media de los número es: " + (sumAll/rep));

}
}
