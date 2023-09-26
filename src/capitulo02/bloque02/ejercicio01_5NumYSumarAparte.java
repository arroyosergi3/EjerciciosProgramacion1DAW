package capitulo02.bloque02;

import java.util.Scanner;

public class ejercicio01_5NumYSumarAparte {

	public static void main(String[] args) {

		Double num1, num2, num3, num4, num5, sumneg, sumbaj, summed, sumgran;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número:");
		num1 = sc.nextDouble();
		System.out.println("Introduce otro número:");
		num2 = sc.nextDouble();
		System.out.println("Introduce otro número:");
		num3 = sc.nextDouble();
		System.out.println("Introduce otro número:");
		num4 = sc.nextDouble();
		System.out.println("Introduce otro número:");
		num5 = sc.nextDouble();
		
		
		sumneg = (double)0;
		sumbaj = (double)0;
		summed = (double)0;
		sumgran = (double)0;
		
		if (num1 < 0) {
			sumneg = +num1;
		}
		else {
			if(num1 <=25){
				sumbaj = +num1;	
				}
			else{
				if(num1 <= 250){
					summed = +num1;
				}
				else{
					sumgran = +num1;
				}
			}
		}
		
		
		if (num2 < 0) {
			sumneg = +num2;
		}
		else {
			if(num2 <=25){
				sumbaj = +num2;	
				}
			else{
				if(num2 <= 250){
					summed = +num2;
				}
				else{
					sumgran = +num2;
				}
			}
		}
		
		if (num3 < 0) {
			sumneg = +num3;
		}
		else {
			if(num3 <=25){
				sumbaj = +num3;	
				}
			else{
				if(num3 <= 250){
					summed = +num3;
				}
				else{
					sumgran = +num3;
				}
			}
		}
		
		
		if (num4 < 0) {
			sumneg = +num4;
		}
		else {
			if(num4 <=25){
				sumbaj = +num4;	
				}
			else{
				if(num4 <= 250){
					summed = +num4;
				}
				else{
					sumgran = +num4;
				}
			}
		}
		
		if (num5 < 0) {
			sumneg = +num5;
		}
		else {
			if(num5 <=25){
				sumbaj = +num5;	
				}
			else{
				if(num5 <= 250){
					summed = +num5;
				}
				else{
					sumgran = +num5;
				}
			}
		}

		
		System.out.println("La suma de los negativos es " + sumneg);
		System.out.println("La suma de los bajos es " + sumbaj);
		System.out.println("La suma de los medios es " + summed);
		System.out.println("La suma de los grandes es " + sumgran);
		
		
		
		
		
		
		
		
		
		
		
	}

}
