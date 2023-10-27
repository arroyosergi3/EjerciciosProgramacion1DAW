package capitulo04.bloque04;

import java.util.Scanner;

public class ejercicio04_contarPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("Introduce una cadena de carácteres");
		str = sc.nextLine();
		contarPalabras(str);
		
		
	}
	
	
	public static void contarPalabras(String cad) {
	    int palabras = 0;

	    if (cad.length() > 0 && cad.charAt(0) != ' ') {
	        palabras++;
	    }

	    for (int i = 1; i < cad.length() - 1; i++) {
	        if (cad.charAt(i) != ' ' && cad.charAt(i + 1) == ' ') {
	            palabras++;
	        }
	    }

	    
	    
	    

	    System.out.println("Hay " + palabras + " palabras");
	}



}
