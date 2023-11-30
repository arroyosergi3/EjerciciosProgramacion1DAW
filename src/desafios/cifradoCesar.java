package desafios;

import java.util.Scanner;

public class cifradoCesar {

	public static void main(String[] args) {

        String cadenaEscrita, cadenaCambiada;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba el texto que desea ");
        cadenaEscrita = sc.nextLine();
        cadenaCambiada = convierteString(cadenaEscrita);
        System.out.println(cadenaCambiada);
        
    }
	public static String convierteString (String cad) {
        Scanner sc = new Scanner(System.in);
        int pidepasa;
         
        System.out.println("Cuantos numeros vas a pasar");
        pidepasa = sc.nextInt();
        
        String convierte = "";
        for (int i = 0; i < cad.length(); i++) {
                char b = cad.charAt(i);
                if (b+pidepasa > 'Z' && b+pidepasa < 'A') {
                    convierte += (char) (b+pidepasa - 26);
                } 
                else convierte += (char) (b + pidepasa);
        }
        return convierte;
    }

}
