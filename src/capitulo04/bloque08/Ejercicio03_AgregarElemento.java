package capitulo04.bloque08;

import java.util.Scanner;

import utils.utilsArrays;

public class Ejercicio03_AgregarElemento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		int add[] = new int[a.length + 1];
		utilsArrays.inicializaArray(a, 0, 100);
		utilsArrays.imprimeArray(a);
		System.out.println("¿Qué valor quieres añadir?");
		int v = sc.nextInt();
		add = addInteger(a, v);
		utilsArrays.imprimeArray(add);
		
	}
	
	
	public static int[] addInteger(int a[],int n ){
		int ar[] = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			ar[i] = a[i];
		}
		ar[ar.length - 1] = n;
		
		return ar;
	}

}
