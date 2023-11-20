package utils;

public class utilsArrays {
	/**
	 * Cambia el signo de los valores del array
	 * 
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
	public static void inicializaArray(int a[], int botLimit, int topLimit) {
		for (int i = 0; i < a.length; i++) {
			a[i] = utils.obtenerNumeroAzar(botLimit, topLimit);
		}
	}

	/**
	 * Imprime el array en pantalla
	 * 
	 * @param array1
	 */
	public static void imprimeArray(int array1[]) {
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Multiplicar array por factor
	 * 
	 * @param a
	 * @param factor
	 */
	public static void multiplicaValoresPorFactor(int a[], int factor) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (a[i] * factor);
		}
	}

	/**
	 * Desplazar un lugar a derecha
	 * 
	 * @param a
	 * @return
	 */
	public static void desplazaUnoDerecha(int a[]) {

		int right = 0;
		right = a[a.length - 1];
		for (int i = (a.length - 1); i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = right;
	}

	/**
	 * Desplazar las veces que diga
	 * 
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
	 * 
	 * @param a
	 * @param posiciones
	 * @param direccion
	 */
	public static void desplazaCiclicoYDireccion(int a[], int posiciones, int direccion) {
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
		if (direccion != 1 && direccion != 2) {
			System.out.println("Error, dirección no válida");
		}
	}

	/**
	 * Ordenación Burbuja
	 * @param a
	 */
	public static void ordenacionBurbuja(int a[]) {

		boolean hayCambios = true;
		int aux = 0;
		do {
			hayCambios = false;
			for (int i = 0; i < (a.length - 1); i++) {

				if (a[i] > a[i + 1]) {
					aux = a[i];
					a[i] = a[i + 1];
					a[i + 1] = aux;
					hayCambios = true;
				}

			}

		} while (hayCambios == true);

	}
	
	/**
	 * Ordenación por seleccion
	 * @param a
	 */
	public static void ordenacionSeleccion(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			int posicionMenor = i;
			int aux;
			for (int j = i + 1; j < a.length - 1; j++) {
				
				if (a[posicionMenor] > a[j]) {
					posicionMenor = j;
				}
				
			}
			aux = a[i];
			a[i] = a[posicionMenor];
			a[posicionMenor] = aux;
		}

	}
	
	/**
	 * Ordenación Array por Insercción directa
	 * @param a
	 */
	public static void ordenacionInserccionDirecta(int a[]) {
		int aux, j;
		for (int i = 1; i < a.length; i++) {
			 aux = a[i];
			for (j = i; j > 0 && a[j-1] > aux ; j--){
				 a[j] = a[j-1];
			}
			a[j] = aux;

		}
	}
	
	
	/**
	 * Ordenación Shell
	 * @param a
	 */
	public static void ordenacionShell(int a[]){
		int aux;
		boolean hayIntercambio = true;
		for(int i = a.length/4; i > 0; i /= 2) {
			
			do {
				hayIntercambio = false;
				int j = 0;
			for (j = 0 ; j < a.length - i; j ++) {
				
				System.out.println("comparo " + a[j] + " con " + a[j +i]);
				if(a[j] > a[j+i]){
					aux = a[j];
					a[j] = a[j+i];
					a[j+i] = aux;
					hayIntercambio = true;
					System.out.println("Intercambio " + a[j] + " con " + a[j + i]);
					utilsArrays.imprimeArray(a);
				}
			}
			} while(hayIntercambio == true);
			System.out.println("Divido el shell entre 2");
		}
	}
	/**
	 * Secuencia de Fibonacci
	 * @param n
	 */
	public static void fibonacci(int n) {
		int a [] = new int[n];
		a[0] = 1;
		a[1] = 1;
		
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i-1] + a[i- 2] ;
			
	}
		

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
