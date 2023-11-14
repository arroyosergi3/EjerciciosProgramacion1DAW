package capitulo04.bloque07;

import java.util.Scanner;

import utils.utilsArrays;

public class Ejercicio02_desplazarArray {

	public static void main(String[] args) {
		int array[] = new int [10];
		
		Scanner sc = new Scanner(System.in); 
		for (int i = 0; i < 10; i++) {
			System.out.println("Dame un número");
			int n = sc.nextInt();
			array[i] = n;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + "	" );
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print( array[i] + "	");
		}
		System.out.println();
		
		System.out.println("Cuál es el inicio?");
		int ini = sc.nextInt();
		System.out.println("Cuál es el final?");
		int fin = sc.nextInt();
		
		array = desplazarArray(array, ini, fin);
		
		utilsArrays.imprimeArray(array);
		}

		
	

	public static int[] desplazarArray(int a[], int ini, int fin){
		
		if(ini < fin && ini >= 0 && ini <= 9&& fin >= 0 && fin <=9) {
			int right = 0, aux = 0;
			right = a[a.length - 1];
			for (int i = (a.length - 1); i > 0; i--) {
				if(i >= ini && i <= fin) {
					aux = a[ini-1] ; 
					a[fin+1] = right;
					a[fin + 1] = aux;
				}
				else a[i] = a[i - 1];
				
			}
			a[0] = right;			
		}
		return a;
	}
}
