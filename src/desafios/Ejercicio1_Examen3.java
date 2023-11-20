package desafios;


import utils.utils;
import utils.utilsArrays;

public class Ejercicio1_Examen3 {

	public static void main(String[] args) {

		int a[] = new int [100];
		for (int i = 0; i < a.length; i++) {
			a[i] = utils.obtenerNumeroAzar(0, 100);
		}
		utilsArrays.imprimeArray(a);
		eliminarDuplicados(a);
		
	}
	
	 public static void eliminarDuplicados(int[] array) {
	        for (int i = 0; i < array.length - 1; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] == array[j]) {
	                    array[j] = 0;
	                }
	            }
	        }
	        utilsArrays.imprimeArray(array);
	    }
	

}
