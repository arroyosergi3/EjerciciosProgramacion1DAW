package test;

public class ejerciciorangos {

	public static void main(String[] args) {
		int num, contador = 0;
		do {
			num = utils.utils.obtenerNumeroAzar(20, 30);
			if(num % 2 == 0) {
				System.out.print(num + " ");
				contador ++;
			}
			num = utils.utils.obtenerNumeroAzar(40, 50);
			if(num % 2 == 0) {
				System.out.print(num + " ");
				contador ++;
			}
			
		}while(contador < 10);
	}

}
