package capitulo04.bloque05;

import java.util.Scanner;

public class ejercicio02_CifradoCesar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de caracteres: ");
        String input = scanner.nextLine();
        input = cifradoCesar(input);
        System.out.println(input);
        
	
		
		
	}

	public static String cifradoCesar (String s) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Indica cuantas posiciones quieres mover: ");
        int desplazar = scanner.nextInt();

		String resultado="";
	 for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         if (c >= 'A' && c <= 'Z') {
             resultado += (char) (c + desplazar);
         } else {
             resultado += (char) (c + desplazar);
         }
     }
	 return resultado;
	}
}
