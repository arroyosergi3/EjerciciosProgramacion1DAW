package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejercicio03_CalculadoraMasAvanzada {

	public static void main(String[] args) {
		String str;
		int opcion, numero1, numero2;
		
		System.out.println("Menú:");
		System.out.println("1.- Cálculo de la hipotenusa de un triángulo");
		System.out.println("2.- Cálculo de la superficie de una circunferencia");
		System.out.println("3.- Cálculo del perímetro de una circunferencia");
		System.out.println("4.- Cálculo del área de un rectángulo");
		System.out.println("5.- Cálculo del área de un triángulo");
		
	
		str = JOptionPane.showInputDialog("Introduzca la opción: ");
		opcion = Integer.parseInt(str);
		
		
		switch(opcion){
		case 1:
			str = JOptionPane.showInputDialog("Introduzca la longitud del cateto 1: ");
			numero1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduzca la longitud del cateto 2: ");
			numero2 = Integer.parseInt(str);
			System.out.println("La hipotenusa mide: " + ((numero1 * numero1) + (numero2 * numero2)));
		break;
		
		case 2:
			str = JOptionPane.showInputDialog("Introduzca la longitud del radio de la circunferencia: ");
			numero1 = Integer.parseInt(str);
			System.out.println("La superficie de la circunferencia es: " + (Math.PI * (numero1*numero1)));
		break;
			
		case 3:
			str = JOptionPane.showInputDialog("Introduzca la longitud del radio de la circunferencia: ");
			numero1 = Integer.parseInt(str);
			System.out.println("La longitud del perímetro es: " + (2 * Math.PI * numero1));
		break;
		
		case 4:
			str = JOptionPane.showInputDialog("Introduzca la longitud de la base: ");
			numero1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduzca la longitud de la altura: ");
			numero2 = Integer.parseInt(str);
			System.out.println("El área del rectángulo es: " + (numero1*numero2));
		break;
			
		case 5:
			str = JOptionPane.showInputDialog("Introduzca la longitud de la base: ");
			numero1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduzca la longitud de la altura: ");
			numero2 = Integer.parseInt(str);
			System.out.println("El área del rectángulo es: " + ((numero1*numero2)/2));
		break;
		default:
			System.out.println("Opción  incorrecta");
		
		
		
		
		
		}
	}
}
