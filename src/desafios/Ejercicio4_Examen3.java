package desafios;

import java.util.Scanner;

public class Ejercicio4_Examen3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos números deseas ver?");
		int n = sc.nextInt();
		mostrarPAresFibonacci(n);

	}
	 public static int fibonacci(int i){
	        if (i <= 1) {
	            return i;
	        } else {
	            return fibonacci(i - 1) + fibonacci(i - 2);
	        }
	 }
	public static void mostrarPAresFibonacci(int n) {
		int cont = 0;
		for (int i = 1; cont < n; i++) {
			if(fibonacci(i) % 2 == 0) {
				System.out.print(fibonacci(i) + " ");
				cont ++;
			}
		}
	}
		

	

}
