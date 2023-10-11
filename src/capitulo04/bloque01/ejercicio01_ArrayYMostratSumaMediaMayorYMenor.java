package capitulo04.bloque01;

public class ejercicio01_ArrayYMostratSumaMediaMayorYMenor {
	public static void main(String[] args) {
		float sum = 0;
		int mayor = 0, menor = 0;
		int numeros[] = new int[150];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
		}
		for (int i = 0; i < numeros.length; i++) {
			sum += numeros[i];
		}
		System.out.println("\nLa suma de los valores del array es " + sum);
		System.out.println("La media de los valores del array es " + (sum / (float) numeros.length));
		menor = numeros[0];
		mayor = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < menor)
				menor = numeros[i];
			if (numeros[i] > mayor)
				mayor = numeros[i];
		}
		System.out.println("El número mayor es " + mayor);
		System.out.println("El número menor es " + menor);
	}
}