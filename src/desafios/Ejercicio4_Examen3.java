package desafios;

import java.util.Scanner;

public class Ejercicio4_Examen3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos números deseas ver?");
		int n = sc.nextInt();
		mostrarPAresFibonacci(n);

	}

	public static void mostrarPAresFibonacci(int n) {
		int cont = 0;

		int a[] = new int[1000000000];

		for (int i = 0; cont < n; i++) {
			if (i == 0) {
				a[i] = 1;
				
			}
			else if (i == 1) {
				a[i] = 1;
				
			}
			else
			a[i] = a[i - 1] + a[i - 2];
			
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
				cont++;
			}
		}

	}

}
