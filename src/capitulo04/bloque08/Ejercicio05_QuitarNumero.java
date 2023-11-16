package capitulo04.bloque08;

import java.util.Scanner;

import utils.utilsArrays;

public class Ejercicio05_QuitarNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		utilsArrays.inicializaArray(a, 0, 100);
		utilsArrays.imprimeArray(a);
		System.out.println("¿Qué número quieres quitar?");
		int  n = sc.nextInt();
		int v = capitulo04.bloque08.Ejercicio04_ContarOcurrenciasEnArray.countOccurrences(a, n);
		int arr[] = new int [a.length - v];
		 arr = removeInteger(a, n);
		 utilsArrays.imprimeArray(arr);
		
		
		
		
		
		
	}
	
	public static int[] removeInteger(int a[], int n) {
	    int v = capitulo04.bloque08.Ejercicio04_ContarOcurrenciasEnArray.countOccurrences(a, n);
	    int arr[] = new int[a.length - v];
	    int index = 0;

	    for (int i = 0; i < a.length; i++) {
	        if (a[i] != n) {
	            arr[index] = a[i];
	            index++;
	        }
	    }

	    return arr;
	}

	

}
