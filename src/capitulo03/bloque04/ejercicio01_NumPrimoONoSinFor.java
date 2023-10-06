package capitulo03.bloque04;

import java.util.Scanner;

public class ejercicio01_NumPrimoONoSinFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numPedido, i;
		i= 2;
		boolean esPrimo = true;

		System.out.println("Introduce un número");
		numPedido = sc.nextInt();

		while (i < numPedido) {
			if (numPedido % i == 0) esPrimo = false;	
			i++;
			}
			
		
		if (esPrimo == true) System.out.println("El número " + numPedido + " es primo");
		else System.out.println("El número " + numPedido + " es compuesto");
		
		
	}

}
