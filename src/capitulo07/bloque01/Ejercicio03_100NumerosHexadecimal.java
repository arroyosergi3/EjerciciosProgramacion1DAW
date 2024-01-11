package capitulo07.bloque01;


public class Ejercicio03_100NumerosHexadecimal {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			pasarHexadecimal(i);
		}
		
		
		
		
	}
	
	
	public static void pasarHexadecimal(int a) {
		
		System.out.println(Integer.toHexString(a));
	}

}
