package capitulo04.bloque02;

import utils.utilsArrays;

public class ejercicio02_arraysFormanOtroArray {

	public static void main(String[] args) {

		int array1[] = new int[150];
		int array2[] = new int[150];
		int a3[];

		utilsArrays.inicializaArray(array1, 0, 100);
		utilsArrays.inicializaArray(array2, 0, 100);

		a3 = creaTercerArray(array1, array2);

		utilsArrays.imprimeArray(array1);
		System.out.println();
		utilsArrays.imprimeArray(array2);
		System.out.println();
		utilsArrays.imprimeArray(a3);

	}

	/**
	 * 
	 */
	public static int[] creaTercerArray(int a1[], int a2[]) {
		int a3[] = new int[150];
		for (int i = 0; i < a1.length; i++) {
			if (i % 2 == 0)
				a3[i] = a1[i];

		}
		for (int i = 0; i < a1.length; i++) {
			if (i % 2 != 0)
				a3[i] = a2[i];
		}

		return a3;
	}

}
