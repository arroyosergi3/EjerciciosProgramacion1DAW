package capitulo04.bloque03;

import utils.utilsArrays;

public class ejercicio04_ArrayOrdenacionSeleccion {

	public static void main(String[] args) {
		int array[] = new int[150];

		utilsArrays.inicializaArray(array, 0, 100);
		utilsArrays.imprimeArray(array);
		ordenacionSeleccion(array);
		System.out.println();
		utilsArrays.imprimeArray(array);

	}

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

}
