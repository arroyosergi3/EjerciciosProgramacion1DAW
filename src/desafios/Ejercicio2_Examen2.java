package desafios;

import utils.utils;

public class Ejercicio2_Examen2 {

	public static void main(String[] args) {
		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = utils.obtenerNumeroAzar(0, 100);
			System.out.print(array[i] + " ");
		}

		nuevoSinRepetir(array);
	}

	public static void nuevoSinRepetir(int a[]) {
		int array[] = new int[a.length];
		boolean esta;

		for (int i = 0; i < array.length; i++) {
			do {
				int v = utils.obtenerNumeroAzar(0, 4);
				esta = false; 
				for (int j = 0; j < i; j++) {
					if (a[v] == array[j]) {
						esta = true;
						break; 
					}
				}
				if (!esta) {
					array[i] = a[v];
				}
			} while (esta);
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
