package capitulo03.bloque01;

import java.util.Scanner;

public class ejercicio02_Usuariopidenumysumamayorque10 {

	public static void main(String[] args) {

		int num, sum = 0, repeat;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿Cuantos numeros vas a sumar?");
		repeat = sc.nextInt();
		System.out.println("Dame un número");
		for (int i = 0; i < repeat; i++) {

			num = sc.nextInt();
			if (num > 10) sum += num;
	}
		System.out.println("La suma de los mayores de 10 es: " + sum);

}
}
