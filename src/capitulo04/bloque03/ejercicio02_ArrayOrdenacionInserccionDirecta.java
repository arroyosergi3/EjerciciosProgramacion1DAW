package capitulo04.bloque03;

import utils.utilsArrays;

public class ejercicio02_ArrayOrdenacionInserccionDirecta {

	public static void main(String[] args) {
		int array[] = new int[150];
		
		utilsArrays.inicializaArray(array, 0, 1000);
		utilsArrays.imprimeArray(array);
		ordenacionInserccionDirecta(array);
		System.out.println();
		utilsArrays.imprimeArray(array);

	}

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
}
