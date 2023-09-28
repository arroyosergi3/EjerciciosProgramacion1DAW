package capitulo02.bloque02;

import java.util.Scanner;

public class ejericio02_5NumYDecirCuantosHay {

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
			sumneg = sumneg + 1;
		}
		else {
			if(num1 <=25){
				sumbaj = sumbaj + 1;	
				}
			else{
				if(num1 <= 250){
					summed = summed + 1;
				}
				else{
					sumgran = sumgran + 1;
				}
			}
		}
		
		
		if (num2 < 0) {
			sumneg = sumneg + 1;
		}
		else {
			if(num2 <=25){
				sumbaj = sumbaj + 1;	
				}
			else{
				if(num2 <= 250){
					summed = summed + 1;
				}
				else{
					sumgran = sumgran + 1;
				}
			}
		}
		
		if (num3 < 0) {
			sumneg = sumneg + 1;
		}
		else {
			if(num3 <=25){
				sumbaj = sumbaj + 1;	
				}
			else{
				if(num3 <= 250){
					summed = summed +1;
				}
				else{
					sumgran = sumgran + 1;
				}
			}
		}
		
		
		if (num4 < 0) {
			sumneg = sumneg + 1;
		}
		else {
			if(num4 <=25){
				sumbaj = sumbaj + 1;	
				}
			else{
				if(num4 <= 250){
					summed = summed +1;
				}
				else{
					sumgran = sumgran + 1;
				}
			}
		}
		
		if (num5 < 0) {
			sumneg = sumneg + 1;
		}
		else {
			if(num5 <=25){
				sumbaj = sumbaj + 1;	
				}
			else{
				if(num5 <= 250){
					summed = summed + 1;
				}
				else{
					sumgran = sumgran + 1;
				}
			}
		}

		
		System.out.println("La suma de los negativos es " + sumneg);
		System.out.println("La suma de los bajos es " + sumbaj);
		System.out.println("La suma de los medios es " + summed);
		System.out.println("La suma de los grandes es " + sumgran);
		
	}

}
