package capitulo04.bloque02;

import java.util.Scanner;

import utils.utilsArrays;

public class ejercicio03_ArrayYMultiplicar {

	public static void main(String[] args) {
		int array[] = new int[150];
		int factor = 0;
		utils.utilsArrays.inicializaArray(array, 0, 100);
		
		utilsArrays.imprimeArray(array);
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el número por el que quieres multiplicar los números del array: ");
		factor = sc.nextInt();
		multiplicaValoresPorFactor(array, factor);
		System.out.println();
		utilsArrays.imprimeArray(array);
	}

	
	
	
	public static void multiplicaValoresPorFactor (int a[], int factor) {
		for (int i = 0; i < a.length; i++){
			a [i] = (a[i] * factor);
		}
	}
}
