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
	 * Imprime el array en pantalla
	 * @param array1
	 */
	public static void imprimeArray(int array1[]){
	for (int i = 0; i < array1.length;i++) {
		System.out.print(array1[i] + " ");
	}
	System.out.println();
	}
	
	/**
	 * Multiplicar array por factor
	 * @param a
	 * @param factor
	 */
	public static void multiplicaValoresPorFactor (int a[], int factor) {
		for (int i = 0; i < a.length; i++){
			a [i] = (a[i] * factor);
		}
	}
	
	/**
	 * Desplazar un lugar a derecha
	 * @param a
	 * @return
	 */
	public static int [] desplazaUnoDerecha (int a[]) {
		
		int right = 0;
		right = a[a.length - 1];
		for (int i = (a.length - 1); i > 0;i--){
			a[i] = a[i-1];
		}
		a[0] = right;
		return a;
	}
	
	
	
	
	
	
	
	

}
