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
	public static void desplazaUnoDerecha (int a[]) {
		
		int right = 0;
		right = a[a.length - 1];
		for (int i = (a.length - 1); i > 0;i--){
			a[i] = a[i-1];
		}
		a[0] = right;
	}
	
	/**
	 * Desplazar las veces que diga
	 * @param a
	 * @param posiciones
	 */
	public static void desplazaCiclicoDerecha(int a[], int posiciones) {
		int right = 0;
		right = a[a.length - 1];
		for (; posiciones >= 1; posiciones--) {

			right = a[(a.length - 1)];

			for (int cambio = (a.length - 1); cambio >= 1; cambio--) {
				a[cambio] = a[(cambio - 1)];
			}
			a[0] = right;
		}
		
	}
	
	/**
	 * Desplazar las veces que quieras en la dirección que quieras
	 * @param a
	 * @param posiciones
	 * @param direccion
	 */
	public static void desplazaCiclicoYDireccion (int a[], int posiciones, int direccion) {
		if (direccion == 1) {
			int right = 0;
			right = a[a.length - 1];
			for (; posiciones >= 1; posiciones--) {

				right = a[(a.length - 1)];

				for (int cambio = (a.length - 1); cambio >= 1; cambio--) {
					a[cambio] = a[(cambio - 1)];
				}
				a[0] = right;
			}

		}
		if (direccion == 2) {
			int left = 0;
			left = a[0];
			for (; posiciones >= 1; posiciones--) {

				left = a[0];

				for (int cambio = 0; cambio < (a.length - 1); cambio++) {
					a[cambio] = a[(cambio + 1)];
				}
				a[a.length - 1] = left;
				
			}

			
		}
		if (direccion != 1 && direccion != 2) {System.out.println("Error, dirección no válida");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
