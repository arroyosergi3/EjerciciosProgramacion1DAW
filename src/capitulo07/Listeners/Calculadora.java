package capitulo07.Listeners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Calculadora {

	private static List<CalculadoraListener> listeners = new ArrayList<CalculadoraListener>();

	
	public void addCalculadoraListeners( CalculadoraListener l) {
		listeners.add(l);
	}
	
	public void removeCalculadoraListeners( CalculadoraListener l) {
		listeners.remove(l);
	}
	
	private static void fireSumaMayorA1000(int n1, int n2) {
		CalculadoraEvent e = new CalculadoraEvent();
		e.setNum1(n1);
		e.setNum2(n2);
		for (CalculadoraListener calculadoraListener : listeners) {
			calculadoraListener.sumaOMultiplicacionSuperiorA1000(e);
		}
	}
	
	private static void fireMultiplicaMayorA1000(int n1, int n2) {
		CalculadoraEvent e = new CalculadoraEvent();
		e.setNum1(n1);
		e.setNum2(n2);
		for (CalculadoraListener calculadoraListener : listeners) {
			calculadoraListener.sumaOMultiplicacionSuperiorA1000(e);
		}
	}
	
	private static void fireDivisor0(int n1, int n2) {
		CalculadoraEvent e = new CalculadoraEvent();
		e.setNum1(n1);
		e.setNum2(n2);
		for (CalculadoraListener calculadoraListener : listeners) {
			calculadoraListener.divisorCero(e);
		}
	}
	
	private static void fireRaizNegativa(int n1) {
		CalculadoraEvent e = new CalculadoraEvent();
		e.setNum1(n1);
		for (CalculadoraListener calculadoraListener : listeners) {
			calculadoraListener.raizNegativa(e);
		}
	}
	
	private static void fireResultadoNegativo(int n1, int n2) {
		CalculadoraEvent e = new CalculadoraEvent();
		e.setNum1(n1);
		e.setNum2(n2);
		for (CalculadoraListener calculadoraListener : listeners) {
			calculadoraListener.resultadoNegativo(e);
		}
	}
	
	public static void main(String[] args) {
		int op;
		SuperTipo st = new SuperTipo();
		listeners.add(st);
		
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Seleccione una opcion\n"
					+ "1.- Suma\n"
					+ "2.- Resta\n"
					+ "3.- Multiplicación\n"
					+ "4.- División\n"
					+ "5.- Raíz Cuadrada\n"
					+ "0.- Salir");
			 op = Integer.parseInt(sc.nextLine());
			 
				switch (op) {
				case 1:{
					System.out.println("Dame el primer número ");
					int n1 = Integer.parseInt(sc.nextLine());
					System.out.println("Dame el segundo número ");
					int n2 = Integer.parseInt(sc.nextLine());
					System.out.println("La suma es " + (n1+n2));
					if((n1+n2) > 1000) {
					
						fireSumaMayorA1000(n1, n2);
					}
					break;
				}
				
				case 2:{
					System.out.println("Dame el primer número ");
					int n1 = Integer.parseInt(sc.nextLine());
					System.out.println("Dame el segundo número ");
					int n2 = Integer.parseInt(sc.nextLine());
					System.out.println("La resta es " + (n1-n2));
					if(n2>n1) {
						fireResultadoNegativo(n1, n2);
					}
					break;
				}
				
				case 3:{
					System.out.println("Dame el primer número ");
					int n1 = Integer.parseInt(sc.nextLine());
					System.out.println("Dame el segundo número ");
					int n2 = Integer.parseInt(sc.nextLine());
					System.out.println("La multiplicacion es " + (n1*n2));
					if((n1 * n2) > 1000) {
						fireMultiplicaMayorA1000(n1, n2);
					}
					break;
				}
				
				case 4:{
					System.out.println("Dame el primer número ");
					int n1 = Integer.parseInt(sc.nextLine());
					System.out.println("Dame el segundo número ");
					int n2 = Integer.parseInt(sc.nextLine());
					if(n2 == 0) {
						fireDivisor0(n1, n2);
					}
					System.out.println("La división es " + (n1/n2));
					
					break;
				}
				
				case 5:{
					System.out.println("Dame el  número ");
					int n1 = Integer.parseInt(sc.nextLine());
					if(n1 < 0) {
						fireRaizNegativa(n1);
					}
					System.out.println("La raiz es " + (Math.sqrt(n1)));
					break;
				}
				
				case 0:{
					break;
				}
				
				
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + op);
				}
				
		} while (op != 0);
		
		
		

	
	}

}
