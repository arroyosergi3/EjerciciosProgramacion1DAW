package desafios;

import java.util.Scanner;

public class Ejercicio3_Examen3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número entre 1 y 1.000.000");
		int n = sc.nextInt();
		if(n < 1000000) {
			System.out.println("La suma de las cifras es " +(sumarCifras(n)));
		}
		else System.out.println("Error, numero introducido no valido");
		
		
		
	}
	
	public static int sumarCifras(int n){
		int suma = 0;
		for (int i = 1000000; i >= 1; i/= 10) {
//			System.out.println("i vale " + i);
			if(i < n) {
				suma += (n / i);
				n = n -(n/i * i);
			}
			
//			System.out.println("Suma vale " + suma);
		}
		return suma;
	}
	
	
	

}
