package test;

import utils.utils;
import utils.utilsArrays;

public class ejerciciosvarios {

	public static void main(String[] args) {
		int array[] = new int[20];
		boolean estaRepetido;
		
		do {
			estaRepetido = false;
			for (int i = 0; i < array.length; i++) {
				array[i] = utils.obtenerNumeroAzar(0, 40);
				for (int j = 0; j < i; j++) {
					if (array[i] == array[j]) {
						estaRepetido = true;
					}

				}
			}

		} while (estaRepetido == true);
		utilsArrays.imprimeArray(array);

	}
	

}
