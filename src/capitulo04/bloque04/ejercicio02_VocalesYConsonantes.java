package capitulo04.bloque04;

import java.util.Scanner;

public class ejercicio02_VocalesYConsonantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		
		System.out.println("Introduce una cadena de carácteres");
		str = sc.nextLine();
		cuentaVocalesYConsonantes(str);
		
		
	}

	public static void cuentaVocalesYConsonantes (String cad){
		int vocales = 0, consonantes = 0;
		for(int i = 0; i < cad.length(); i++){
			if (cad.charAt(i) >= 'a' && cad.charAt(i) <= 'z' || cad.charAt(i) >= 'A' && cad.charAt(i) <= 'Z' ){
				if(cad.charAt(i) == 'a' | cad.charAt(i) == 'e' | cad.charAt(i) == 'i' | cad.charAt(i) == 'o' | cad.charAt(i) == 'u' |
						cad.charAt(i) == 'A' | cad.charAt(i) == 'E' | cad.charAt(i) == 'I' | cad.charAt(i) == 'O' | cad.charAt(i) == 'U') {
					vocales++;
				}
				else consonantes ++;
			}
		
			
		}
		
		System.out.println("Hay " + vocales + " vocales");
		System.out.println("Hay " + consonantes + " consonantes");
		
	}
	
	
}
