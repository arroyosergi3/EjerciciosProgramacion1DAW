package desafios;

import java.util.Scanner;

public class Ejercicio5_Examen3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un limite inferior");
		int botLimit = sc.nextInt();
		System.out.println("Dime un limite superior");
		int topLimit = sc.nextInt();
		sumaFactoriales(botLimit, topLimit);
		
		
		
		
	}
	
	
	
	public static void sumaFactoriales(int bl, int tl) {
	    int sum = 0;

	    for (int i = bl; i <= tl; i++) {
	        int f = 1; 
	        for (int j = 1; j <= i; j++) {
	            f *= j;
	        }
	        sum += f;
	    }

	    System.out.println("La suma de los factoriales es " + sum);
	}


}
