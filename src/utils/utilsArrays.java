package utils;

public class utilsArrays {
	/**
	 * Cambia el signo de los valores del array
	 * @param array
	 */

	public static void cambiaSignoEnValores(int array[]) {

		for (int i = 0; array.length > i; i++) {
			array[i] = array[i] * -1;
		}

	}
	/**
	 * Inicializa un array
	 */
	public static void inicializaArray(int a[], int botLimit, int topLimit){
	for (int i = 0; i < a.length; i++) {
		a[i] = utils.obtenerNumeroAzar(botLimit, topLimit);
	}
	}
	/**
	 * 
	 * @param array1
	 */
	public static void imprimeArray(int array1[]){
	for (int i = 0; i < array1.length;i++) {
		System.out.print(array1[i] + " ");
	}
	}


}
