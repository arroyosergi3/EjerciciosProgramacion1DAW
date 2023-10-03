package capitulo03.bloque02;

import java.util.Scanner;

public class ejercicio03_TodosMultiDeNum {

	public static void main(String[] args) {
		int num, res = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué numero quieres multiplicar?");
		num = sc.nextInt();
		
		for(int i = 0; num * i < 100 ; i++ ){
			res = (num * i);
			System.out.println(num + " x " + i + " = " + res);
		}
	}
}
