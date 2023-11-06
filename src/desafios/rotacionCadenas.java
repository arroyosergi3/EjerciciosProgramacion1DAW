package desafios;

import java.util.Scanner;

public class rotacionCadenas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean esRotacion;
		System.out.println("Introduce una cadena de carácteres");
		String str = sc.nextLine();
		System.out.println("Introduce otra cadena de carácteres");
		String cadena = sc.nextLine();
		esRotacion = rotacionDeCadenas(str, cadena);
		if (esRotacion) System.out.println("Sí es una cadena");
		else System.out.println("No es una cadena");
		
		
	}
	
//	public static boolean rotacionCadenas(String s, String c) {
//		boolean esta = false;
//		int aComprobar[] = new int[s.length()];
//		int comprobar[] = new int[s.length()];
//		
//		for(int i = 0; i < s.length(); i++){
//			aComprobar[i] = s.charAt(i);
//			comprobar[i] = c.charAt(i);
//		}
//		for (int j = 0; j < c.length();j++) {
//			utils.utilsArrays.desplazaCiclicoDerecha(comprobar,j);
//			for(int k = 0; k < comprobar.length; k++) {
//				if (aComprobar[k] == comprobar[k]){
//					esta = true;
//				}
//				else {
//					esta = false;
//					break;
//				}
//			}
//		}
//		if (esta == true) return true;
//		else return false;
		
		public static boolean rotacionDeCadenas (String s, String c) {
		    if (s.length() != c.length()) {
		        return false; // Las cadenas no pueden ser rotaciones si tienen longitudes diferentes
		    }

		    String duplicada = c + c; // Duplicamos la cadena c

		    return duplicada.contains(s);
		}

		
	}
	
	
	
	

