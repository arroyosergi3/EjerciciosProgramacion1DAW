package capitulo04.bloque08;

import java.util.Scanner;

import utils.utilsArrays;

public class Ejercicio04_ContarOcurrenciasEnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		utilsArrays.inicializaArray(a, 0, 100);
		utilsArrays.imprimeArray(a);
		System.out.println("¿Qué número quieres contar?");
		int n = sc.nextInt();
		int v = countOccurrences(a, n);
		System.out.println("El número "+ n + " se repite " + v + " veces");
		
		
		

	}
	
	public static int countOccurrences (int a[], int n) {
		int acc = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == n) {
				acc++;
			}
		}
		return acc;
	}

}
