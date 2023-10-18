package capitulo04.bloque02;

import java.util.Scanner;

import utils.utilsArrays;

public class ejercicio05_ArrayYDesplazarDerechaPidiendoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];
		int positions;
		utilsArrays.inicializaArray(array, 0, 100);
		utilsArrays.imprimeArray(array);
		System.out.println("Indica el número de veces que se desea desplazar:");
		positions = sc.nextInt();
		desplazaCiclicoDerecha(array, positions);
		utilsArrays.imprimeArray(array);

	}

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

}
