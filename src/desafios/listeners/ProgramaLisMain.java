package desafios.listeners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaLisMain {

//	Crear el "Event", que contiene información útil sobre el evento recibido.
//	Crear el "Listener", es una interface que contiene la estructura de 
//	notificación de los eventos producidos.
//	Una clase que controle aquello en lo que se puede producir el evento. Esta clase: 
//	1- Realiza la acción que puede producir el evento; 
//	2- Posee una lista de listeners a los que notificar eventos; 
//	3- Posee métodos para agregar y eliminar listeners y para disparar cada tipo de evento; 
//	Objetos que se convierten en listeners y son notificados.
	
	
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
