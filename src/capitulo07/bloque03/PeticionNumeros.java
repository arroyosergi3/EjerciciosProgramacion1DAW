package capitulo07.bloque03;

import java.util.Scanner;

public class PeticionNumeros {
	
	public static void main (String [] args){
		boolean fin = false;
		
		
		try {
			
			do {
				pideNumeroPar(fin);
				
			} while (fin == false);
		} catch (NoEsParException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public static void pideNumeroPar(boolean f) throws NoEsParException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número");
		int n = Integer.parseInt(sc.nextLine());
		if(n % 2 != 0) {
			throw new NoEsParException("Error, el número introducido no es par");
		}
		else
			System.out.println("El numero introducido es par");
		f = true;
		
	}
	
	
	
	
}
