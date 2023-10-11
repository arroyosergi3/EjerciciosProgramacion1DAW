package capitulo04.bloque01;

public class ejercicio03_ArrayYMostrarAlContrario {
	public static void main(String[] args) {
		float sum = 0;
		int mayor = 0, menor = 0;
		int numeros[] = new int[150];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nOrden Inverso");
		for (int i = (numeros.length -1); i >= 0; i--) {
			System.out.print(numeros [i] + " ");
		}
	}
}