package desafios;

import java.util.Scanner;

public class anamgrama {

	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la primera cadena de caracteres :");
        String cadena1 = sc.nextLine();
        System.out.println("Introduce la segunda cadena de caracteres :");
        String cadena2 = sc.nextLine();
        if (sonAnagramas(cadena1, cadena2)) {
            System.out.println("Las cadenas sí son anagramas entre sí");
        } else {
            System.out.println("Las cadenas no son anagramas entre sí.");
        }
    }
    public static boolean sonAnagramas(String s1, String s2) {
        // Si las longitudes son diferentes, no pueden ser anagramas
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] contadorCaracteres = new int[256]; // Un contador para los caracteres ASCII posibles
        // Incrementa el contador para cada carácter en la primera cadena
        for (int i = 0; i < s1.length(); i++) {
            contadorCaracteres[(int) s1.charAt(i)]++;
        }
        // Decrementa el contador para cada carácter en la segunda cadena
        for (int i = 0; i < s2.length(); i++) {
            contadorCaracteres[(int) s2.charAt(i)]--;
        }
        // Verifica que todos los contadores sean cero
        for (int i = 0; i < 256; i++) {
            if (contadorCaracteres[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
