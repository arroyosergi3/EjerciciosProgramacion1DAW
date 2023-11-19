package desafios;

import utils.utils;

public class Ejercicio4_Examen1 {

	public static void main(String[] args) {
		int array[] = new int [100];
		rellenarArray(array);
		calcualrValores(array);
		
	}
	
	
	
	public static void rellenarArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i] = utils.obtenerNumeroAzar(-100, 100);
		}
	}
	public static void calcualrValores (int a[]){
		int media = 0, cont = 0;
		for (int i = 0; i < a.length; i++) {
			media += a[i];
			//System.out.println("La media suma " + media);
		}
		media = media / a.length - 1;
		System.out.println("La media es " + media);
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] < media){
				cont++;
				
			}
			//System.out.println("El contador es " + cont);
		}
		
		System.out.println("El porcentaje de numeros menor que la "
				+ "media es " + ((cont * 100) / (a.length -1)) + "%"); 
		
	}

}
