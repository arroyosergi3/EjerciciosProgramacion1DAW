package desafios;

import java.util.Scanner;


public class Ejercicio01_Examen1 {

	public static void main(String[] args) {
		int array [] = new int [10];
		array = pide10numyalmacena();
		imprimeArray(array);
		array = ordena(array);
		System.out.println();
		imprimeArray(array);
	}
		
		
	
public static int[] pide10numyalmacena () {
	int array [] = new int [10];
	Scanner sc = new Scanner(System.in); 
	
	for (int i = 0; i < array.length; i++) {
		System.out.println("Dame un número");
		array[i] = sc.nextInt();
	}
	return array;
}
public static void imprimeArray(int a[]) {
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
}
public static int[] ordena(int a[]) {

	boolean hayCambios = true;
	int aux = 0;
	do {
		hayCambios = false;
		for (int i = 0; i < (a.length - 1); i++) {

			if (a[i] > a[i + 1]) {
				aux = a[i];
				a[i] = a[i + 1];
				a[i + 1] = aux;
				hayCambios = true;
			}

		}

	} while (hayCambios == true);
	return a;

}
	
	
	
	
	
	
	
}
