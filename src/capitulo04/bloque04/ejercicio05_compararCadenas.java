package capitulo04.bloque04;

import java.util.Scanner;

public class ejercicio05_compararCadenas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		int resultado;
		System.out.println("Introduce una cadena de carácteres");
		str1 = sc.nextLine();
		System.out.println("Introduce otra cadena de carácteres");
		str2 = sc.nextLine();
		resultado = compararCadenas(str1, str2);
		
		System.out.println("-1 = string1 > string 2 \n 0 = Los strings son iguales"
				+ "\n 1 = string 1 < string 2");
		System.out.println("El resultado de la comparación es: " + resultado);
		
		
		
		
		
	}
	
	public static int compararCadenas(String s1, String s2){
		for(int i= 0; i < s1.length(); i++) {
			if(s1.length() > s2.length()) return -1;
			else if (s2.length() > s1.length()) return 1;
			if(s1.length() > i && s2.length() > i) {
				if(s1.charAt(i)<s2.charAt(i)) {
					return -1;
					
				}
				else if(s1.charAt(i) > s2.charAt(i)) {
					return 1;
				}
				
				}
			}
			
		
		
		return 0;
	}


}
