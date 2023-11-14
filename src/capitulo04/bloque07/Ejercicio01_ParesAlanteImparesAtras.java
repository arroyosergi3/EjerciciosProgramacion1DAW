package capitulo04.bloque07;

import utils.utilsArrays;

public class Ejercicio01_ParesAlanteImparesAtras {

	public static void main(String[] args) {
		int array[] = new int[20];
		utilsArrays.inicializaArray(array, 0, 100);
		utilsArrays.imprimeArray(array);
		System.out.println("Array con pares a la izquierda e impares a la derecha");
		array = paresPrimero(array);
		utilsArrays.imprimeArray(array);
	}

	public static int[] paresPrimero(int a[]) {
		int array[] = new int[a.length];
		int contpar = 0, contimpar = a.length -1 ;
		for (int i = 0; i < array.length; i++) {
			if (a[i] % 2 == 0) {
				array[contpar] = a[i];
				contpar++;
			} else {
				array[contimpar] = a[i];
				contimpar --;

				}
			}
		

		return array;
	}

}
