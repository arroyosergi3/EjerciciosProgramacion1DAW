package capitulo04.bloque01;

import java.util.Scanner;

public class ejercicio04_ArrayYBuscarValor {
	public static void main(String[] args) {

		int numeros[] = new int[150];
		int searchedNum;
		int posicion = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nIntroduce el número que deseas buscar");
		searchedNum = sc.nextInt();
		boolean encontrado = false;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == searchedNum) { 
				encontrado = true;
				posicion = i;
				break;
			}
		}
		if (encontrado = true) System.out.println("El número " + searchedNum + " se encuentra en la posición " + posicion);
		else System.out.println("El valor no se encuentra");
	}
}
