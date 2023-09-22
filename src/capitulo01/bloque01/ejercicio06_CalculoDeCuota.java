package capitulo01.bloque01;

import java.util.Scanner;

public class ejercicio06_CalculoDeCuota {

	public static void main(String[] args) {
		float Euribor;
		float Diferencial;
		float Capital;
		int Plazos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el euribor: ");
		Euribor = sc.nextFloat();
		System.out.println("Introduzca el Diferencial: ");
		Diferencial = sc.nextFloat();
		System.out.println("Introduzca el Capital: ");
		Capital = sc.nextFloat();
		System.out.println("Introduzca los plazos: ");
		Plazos = sc.nextInt();
		
		Double Im;
		Double Ia;
		
		Ia = (double)(Euribor + Diferencial);
		Im = (double)((Ia / 12) / 100);
		
		Double Cuota;
		Double Numerador;
		Double Denominador;
		
		Numerador = Math.pow(Im * (1 + Im), Plazos);
		Denominador = Math.pow((1 + Im) + 1, Plazos);
		
		Cuota = (Capital * (Numerador / Denominador));
		System.out.println("La cuota mesnual es: " + Cuota );
		

	}

}
