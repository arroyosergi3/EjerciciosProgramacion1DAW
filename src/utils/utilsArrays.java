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

}
