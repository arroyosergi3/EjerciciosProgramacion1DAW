package capitulo04.bloque02;

import java.util.Scanner;

import utils.utilsArrays;

public class ejercicio06_ArrayYDesplazarNumPedidoYDireccion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];
		int direction;
		int positions;
		utilsArrays.inicializaArray(array, 0, 100);
		utilsArrays.imprimeArray(array);
		System.out.println("Indica el número de veces que se desea desplazar:");
		positions = sc.nextInt();
		System.out.println("Indica la dirección de movimiento:\n 1. Derecha \n 2. Izquierda. ");
		direction = sc.nextInt();
		desplazaCiclico(array,positions,direction);
		utilsArrays.imprimeArray(array);

	}
	
	public static void desplazaCiclico (int a[], int posiciones, int direccion) {
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



