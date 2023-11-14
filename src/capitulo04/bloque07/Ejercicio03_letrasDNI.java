package capitulo04.bloque07;

import java.util.Scanner;

public class Ejercicio03_letrasDNI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es tu DNI? (sin letra)");
		int dni = sc.nextInt();
		char letra = calcularLetraDNI(dni);
		System.out.println("El DNI es: " + dni+ letra);
	}
	
	
	public static char calcularLetraDNI(int dni){
		char a [] = new char [] {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		char letra = 'a';
		int pos;
		
		pos = dni % 23;
		
		for (int i = 0; i <= pos; i++) {
			if (pos == i) letra =  a[i];
		}
		
		return letra;

	}
}
