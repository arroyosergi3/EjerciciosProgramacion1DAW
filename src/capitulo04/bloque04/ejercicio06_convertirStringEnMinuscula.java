package capitulo04.bloque04;

import java.util.Scanner;

public class ejercicio06_convertirStringEnMinuscula {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa una cadena de caracteres: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        String resultado = convertirMayusculasAMinusculas(input);

	        System.out.println("Cadena convertida: " + resultado);
		
	}
	
		public static String convertirMayusculasAMinusculas(String s) {
			String resultado = "";

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (c >= 'A' && c <= 'Z') {
	                resultado += (char) (c + 32);
	            } else {
	                resultado += c;
	            }
	        }

	        return resultado;
	    
	}
	


}
