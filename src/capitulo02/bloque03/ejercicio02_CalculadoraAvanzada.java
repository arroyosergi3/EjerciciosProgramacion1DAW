package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejercicio02_CalculadoraAvanzada {

	public static void main(String[] args) {
		String str;
		int opcion, numero1, numero2;
		
		System.out.println("Menú:");
		System.out.println("1.- Raíz");
		System.out.println("2.- Potencia");
		System.out.println("3.- Módulo");
		
		str = JOptionPane.showInputDialog("Introduzca la opción: ");
		opcion = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el primer número: ");
		numero1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca el segundo número: ");
		numero2 = Integer.parseInt(str);
		
		switch(opcion) {
		case 1:
			System.out.println("La raíz vale: " + (Math.pow(numero1, 1 / (float) numero2)));
			break;
		case 2:
			System.out.println("La Potencia vale: " + (Math.pow(numero1, numero2)));
			break;
		case 3:
			System.out.println("El módulo de la división es: " + (numero1 % (float)numero2));
			break;
		default:
			System.out.println("La opción " + opcion + " no está contemplada");
		}
	}

}

