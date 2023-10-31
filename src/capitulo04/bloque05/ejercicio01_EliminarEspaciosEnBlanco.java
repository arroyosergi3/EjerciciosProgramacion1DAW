package capitulo04.bloque05;

import java.util.Iterator;
import java.util.Scanner;

public class ejercicio01_EliminarEspaciosEnBlanco {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Ingresa una cadena de caracteres: ");
	     String linea = sc.nextLine();
	     eliminarEspaciosEnBlanco(linea);
	     
	     
	        
	        
	        
	}
	
	public static void eliminarEspaciosEnBlanco (String s) {
	
		String sinEspacios = "";
		for(int i = 0; i < s.length();i++) {
			if (s.charAt(i) != ' ') sinEspacios += s.charAt(i);
		}
		System.out.println(sinEspacios);
		
	}
		
	
	
	

}
