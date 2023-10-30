package capitulo04.bloque05;

import java.util.Scanner;

public class ejercicio01_EliminarEspaciosEnBlanco {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Ingresa una cadena de caracteres: ");
	     String linea = sc.nextLine();
	     eliminarEspaciosEnBlanco(linea);
	     
	     
	        
	        
	        
	}
	
	public static void eliminarEspaciosEnBlanco (String s) {
	
		String sinEspacios = s.replaceAll("\\s+", "");
		
		System.out.println(sinEspacios);
	}
	
	
	

}
