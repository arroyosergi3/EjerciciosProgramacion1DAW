package capitulo07.bloque01;
import java.util.Scanner;

public class Ejercicio02_ContraseniaRequisitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] ca;
		do {
			System.out.println("Introduce una contraseña");
			String c = sc.nextLine();
			ca = new char[c.length()]; 
			for (int i = 0; i < ca.length; i++) {
				ca[i] = c.charAt(i);
			}
			
		} while (contraseniaValida(ca) == false);
		System.out.println("Esa contraseña SI es válida");
	}
	
	public static boolean contraseniaValida(char[] c) {
		boolean digito = false, may = false, min = false, noalnu = false;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if(Character.isDigit(c[i])) {
					digito=true;
					break;
				}
				if(Character.isLowerCase(c[i])) {
					min= true;
					break;
				}
				if(Character.isUpperCase(c[i])) {
					may=true;
					
				}
				if(Character.isLetterOrDigit(c[i])== false) {
					noalnu=true;
					break;
				}
			}
			if(digito  && min && may && noalnu) {
				return true;
			}
		}
		System.err.println("Contraseña no valida");
		return false;
	}

}
