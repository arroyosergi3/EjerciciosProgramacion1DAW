package capitulo04.bloque08;

import java.util.Scanner;

import utils.utilsArrays;

public class Ejercicio02_ReemplazarValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		utilsArrays.inicializaArray(a, 0, 100);
		utilsArrays.imprimeArray(a);
		System.out.println("¿Qué valor desea remplazar?");
		int n = sc.nextInt();
		System.out.println("¿Por qué valor lo desea remplazar?");
		int r = sc.nextInt();
		a = findAndReplace(a, n, r);
		utilsArrays.imprimeArray(a);
		
		
	}
	
	public static int[] findAndReplace(int a[], int valor, int reemplazar){
		for (int i = 0; i < a.length; i++) {
			if(a[i] == valor){
				  a[i] = reemplazar;
			}
		}
		return a;
	}

}
