package desafios;

import java.util.Scanner;

public class codificacionRunLength {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean numVal = true;
		System.out.println("Introduce una cadena de carácteres");
		String str = sc.nextLine();
//		String str= "AAAAEEEIIU";
//		String str= "4A3E2I";
		do {
		System.out.println("¿Qué quieres hacer? \n 0: Comprimir \n 1: Descomprimir");
		int n = sc.nextInt();
		if( n == 0) str = comprimirRunLength(str);
		if( n == 1) str = descomprimirRunLength(str);
		if (n != 0 && n != 1) {
			System.out.println("Error, no ha seleccinado ninguna opcion válida");
			numVal = false;
		}
		}while(numVal == false);
		
		
		System.out.println(str);
		
	}
	
	public static String comprimirRunLength(String s) {

		s += " ";
		int contador = 1;
		String resultado="";
		for(int i= 0; i < s.length()-1;i++) {
			
			if (s.charAt(i) == s.charAt(i+1)){
				contador++;
			}
			if (s.charAt(i) != s.charAt(i+1)) {
			resultado +=contador;
			resultado +=s.charAt(i);
			contador = 1;
			}
			if (i == (s.length()-1)) {
				resultado += contador;
				resultado += s.charAt(i);
			}
		}
		
		
		return resultado;
		
	} 

	
	public static String descomprimirRunLength(String s) {
		String resultado="";
		
		for (int i = 0; i < s.length()-1; i+=2) {
			
			int repeticiones = Integer.parseInt(""+s.charAt(i));
			
			for(int j = 0; j < repeticiones ; j++) {
				resultado += (char)s.charAt(i + 1);
			}
		}

		return resultado;
	}

}
