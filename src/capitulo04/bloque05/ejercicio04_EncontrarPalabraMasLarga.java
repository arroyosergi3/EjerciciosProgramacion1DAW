package capitulo04.bloque05;

import java.util.Scanner;

public class ejercicio04_EncontrarPalabraMasLarga {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("Introduce una cadena de carácteres");
		str = sc.nextLine();
		
		encontrarPalabraMasLarga(str);
		
		
		
	}
	
	
	public static void encontrarPalabraMasLarga(String c){
		int contadorLetras = 0, mayor = 0;
		String palabraMasLarga ="", candidato ="";
		
		for( int i = 0; i < c.length() ; i++ ){
			
			
			if (c.charAt(i) != ' ') {
				contadorLetras++;
				candidato += (char) c.charAt(i);
			}
			if (c.charAt(i) == ' ') {
				
				contadorLetras = 0;
				candidato = "";
			}
			
			if (contadorLetras > mayor) {
				
				mayor = contadorLetras;
				palabraMasLarga = candidato;
				
			}
			
			
			
		
		
	}
//		System.out.println("La palabra mas larga tiene " + mayor + " letras");
		
		System.out.println("La palabra más larga es " + palabraMasLarga);

}
}
