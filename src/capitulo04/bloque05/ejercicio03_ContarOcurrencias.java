package capitulo04.bloque05;

import java.util.Scanner;

public class ejercicio03_ContarOcurrencias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, contar;
		
		System.out.println("Introduce una cadena de carácteres");
		str = sc.nextLine();
		System.out.println("Introduce una cadena a contar ");
		contar = sc.nextLine();
		contarCadena(str, contar);
		
		
		
		
	}
	
	
	public static void contarCadena (String cadenaPrincipal, String cadenaAContar ) {
		int contador = 0;
		boolean esta;
		
		for (int i = 0; i <= cadenaPrincipal.length() - cadenaAContar.length(); i++) {
			esta = true;
			
		
			for (int j = 0; j < cadenaAContar.length(); j++) {
				if (cadenaPrincipal.charAt(i + j) != cadenaAContar.charAt(j)) {
					esta = false;
					break;
				}
			
			
		}
			if (esta == true) contador++;
		}
		System.out.println("La cadena: " + "'" + cadenaAContar + "'"+ " aparece " + contador + " veces" );
		
		
		
		
		
		
	}

}
