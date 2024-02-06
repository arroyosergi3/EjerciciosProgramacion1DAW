package utils;

import java.util.Scanner;

public class utils {

	public static int obtenerNumeroAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;

}
	
	public static int pideNumeroEntero (String mensaje) {
		int n = 0;
		boolean esNumeroCorrecto;
		Scanner sc = new Scanner(System.in);
		
		do {
			esNumeroCorrecto = false;
			try {
				System.out.println(mensaje);
				n = Integer.parseInt(sc.nextLine());
				esNumeroCorrecto = true;
			}
			catch (Exception e) {
				System.out.println("No ha introducido un número");
			}
		} while (esNumeroCorrecto == false);
		
		return n;
	}


	public static int obtenerEnteroEntreLimites (String mensajeAlUsuario, int limiteInf,
			int limiteSup) {
		int numeroADelvolver = 0;
		
		Scanner sc = new Scanner(System.in);
		boolean datoCorrecto;
		do {
			try {
				datoCorrecto = true;
				System.out.println(mensajeAlUsuario);
				numeroADelvolver = sc.nextInt();

				if (numeroADelvolver < limiteInf || numeroADelvolver > limiteSup) {
					datoCorrecto = false;
					System.out.println("ERROR, debes introducir un número entre " +
							limiteInf + " y " + limiteSup);
				}
			}
			catch (Exception ex) {
				System.out.println("ERROR, no has introducido un dato númerico entre " + 
						limiteInf + " y " + limiteSup);
				sc.next();
				datoCorrecto = false;
			}
		} while (!datoCorrecto);

		return numeroADelvolver;
	}



}

