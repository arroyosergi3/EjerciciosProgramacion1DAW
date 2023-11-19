package desafios;


import java.util.Scanner;

import utils.utils;

public class Ejercicio3_Examen1 {

	public static void main(String[] args) {
		int array[] = new int [10];
		rellenarArray(array);
		imprimeArray(array);
		System.out.println();
		eliminaElemento(array);
		imprimeArray(array);
		
	}
	
	public static void rellenarArray (int a[]){
		for (int i = 0; i < a.length; i++) {
			a[i] = utils.obtenerNumeroAzar(0, 100);
		}
	}
	public static void imprimeArray (int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static void eliminaElemento (int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué posicion quieres eliminar?");
		int n = sc.nextInt();
		
		for (int i = 0; i < (a.length -1); i++) {
			if( i >= n){
				a[i] = a[i+1];
			}

		}
		a[a.length -1 ] = utils.obtenerNumeroAzar(0, 100);
		
		
		
	}
	
	
	
	
	
	
	

}
