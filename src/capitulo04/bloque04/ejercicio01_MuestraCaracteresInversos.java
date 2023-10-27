package capitulo04.bloque04;

import java.util.Scanner;

public class ejercicio01_MuestraCaracteresInversos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
	
		System.out.println("Introduce una cadena de cracteres");
		str = sc.nextLine();
		
		imprimeArrayInvertido(str);
		
		
	}
	public static void imprimeArrayInvertido(String cad) {
		for (int i = cad.length()-1 ; i >= 0; i--) {
			System.out.print(cad.charAt(i)); 
		}
		System.out.println();

}
}
