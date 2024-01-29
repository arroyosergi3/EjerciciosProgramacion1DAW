package desafios.listeners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaLisMain {

	
	
	
	private static List<ProgramaLisListener> listeners = new ArrayList<ProgramaLisListener>();
	
	
	
	public static void fireNumeroMayorA500(ProgramaLisEvent e){
		for (ProgramaLisListener programaLisListener : listeners) {
			programaLisListener.numeroMayorA500(e);
		}
	}
	
	public static void addListeners(ProgramaLisListener l) {
		listeners.add(l);
	}
	public static void removeListeners(ProgramaLisListener l ) {
		listeners.remove(l);
	}
	
	
	
	public static void main(String[] args) {
		ProgramaLisEvent p = new ProgramaLisEvent();
		
		Scanner sc = new Scanner(System.in);
		Mesa miMesa = new Mesa(4);
		Perro miPerro = new Perro("Tobby");
		addListeners(miPerro);
		addListeners(miMesa);
		System.out.println("Introduce un número");
		Integer n = Integer.parseInt(sc.nextLine());
		
		if(n > 500) {
			fireNumeroMayorA500(p);
		}
		
	}

}
