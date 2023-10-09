package capitulo03.bloque04;

import java.util.Scanner;

public class ejercicio04_ImprimeNumEnBinario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bin = 1024;
		System.out.println("Introduzca el numero que se desea convertir en binario:");
		int num = sc.nextInt();
		if(num == 0) System.out.println("El número pedido es 0");
		while(bin != 0){
			if ((num & bin) == bin) System.out.print("1");
			else System.out.print("0");
			bin /= 2;
		}
	

}
}