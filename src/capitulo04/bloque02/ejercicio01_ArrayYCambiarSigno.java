package capitulo04.bloque02;

public class ejercicio01_ArrayYCambiarSigno {

	public static void main(String[] args) {

		int array[] = new int[150];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 200 - 100);
			System.out.print(array[i] + " ");

		}
		
		System.out.println();
		cambiaSignoEnValores(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	/**
	 * 
	 * @param array
	 */
	public static void cambiaSignoEnValores(int array[]) {
		
		for (int i = 0; array.length > i; i++) {
			if (array[i] % 2 == 0) array[i] = array[i] * -1;
			
		}

	}

}
