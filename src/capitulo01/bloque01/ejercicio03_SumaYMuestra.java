package capitulo01.bloque01;

import java.util.Scanner;

public class ejercicio03_SumaYMuestra {

	public static void main(String[] args) {
	int num1;
	int num2;
	int num3;
	Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número");
    num1 = sc.nextInt();
    
    System.out.println("Introduce un segundo número");
    num2 = sc.nextInt();
    
    System.out.println("Introduce el tercer número");
    num3 = sc.nextInt();
    
    System.out.println("La suma de los tres número introducidos es " + (num1 + num2 + num3));
	}

}
