package capitulo03.bloque01;

import java.util.Scanner;

public class ejercicio01_4numysumamayorque10 {

	public static void main(String[] args) {

		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dame un número");
		for (int i = 0; i < 4; i++) {

			num = sc.nextInt();
			if (num > 10) sum += num;
	}
		System.out.println("La suma de los mayores de 10 es: " + sum);

}
}
