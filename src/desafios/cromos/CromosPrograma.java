package desafios.cromos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import capitulo6.bloque02.Articulo;


public class CromosPrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer op;
		HashMap<Integer, CromoBaloncesto> jugadores = new HashMap <Integer, CromoBaloncesto>();
		
		CromoBaloncesto jug1 = new CromoBaloncesto(1, "Mario Garrido", 15, 4);
		CromoBaloncesto jug2 = new CromoBaloncesto(2, "Chano Rodriguez", 84, 2);
		CromoBaloncesto jug3 = new CromoBaloncesto(3, "Sergio Guillem", 100, 3);
		
		jugadores.put(jug1.getId(), jug1);
		jugadores.put(jug2.getId(), jug2);
		jugadores.put(jug3.getId(), jug3);
		
		
		do {
			System.out.println("Menú\n"
					+ "0.- Abandonar Programa\n"
					+ "1.- Visualizar Valores\n"
					+ "2.- Introducir nuevo cromo\n"
					+ "3.- Eliminar un cromo\n"
					+ "4.- Imprimir datos mas puntos\n"
					+ "5.- Modificar valores\n"
					+ "6.- Imprimir datos menos rebotes\n");
			op = Integer.parseInt(sc.nextLine());
			
			switch (op) {
			case 0: {
				break;
			}
			case 1:{
				listarCromos(jugadores);
				break;
			}
			
			case 2:{
				addNewCromo(jugadores);
				break;
			}
			
			case 3:{
				deleteCromo(jugadores);
				break;
			}
			case 4:{
				morePoints(jugadores);
				break;
			}
			
			case 5:{
				modCromo(jugadores);
				break;
			}
			
			case 6:{
				lessRebotes(jugadores);
				break;
			}
			
			
			
			
			
			
			}
			
		
		} while (op != 0);
		
		
	
		
	
	
	
	
	
	
	}
	
	
	private static void listarCromos(HashMap<Integer, CromoBaloncesto> jugadores) {
		Iterator<CromoBaloncesto> a = jugadores.values().iterator();
		while (a.hasNext()) {
			System.out.println(a.next());
		}
	}
	
	private static void addNewCromo(HashMap<Integer, CromoBaloncesto> hm) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es el ID?");
		Integer i = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuál es el Nombre?");
		String n =sc.nextLine();
		System.out.println("¿Cuáles son los puntos?");
		Integer p = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuáles son los rebotes?");
		Integer r = Integer.parseInt(sc.nextLine());
		
		CromoBaloncesto j = new CromoBaloncesto(i, n, p, r);
		hm.put(i, j);
	}
	
	private static void deleteCromo (HashMap<Integer, CromoBaloncesto> hm) {
		System.out.println("¿Cuál es su ID?");
		Scanner sc = new Scanner(System.in);
		Integer i = Integer.parseInt(sc.nextLine());
		hm.remove(i);
		
	}
	
	private static void modCromo (HashMap<Integer, CromoBaloncesto> hm) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es el ID del cromo a modificar?");
		Integer i = Integer.parseInt(sc.nextLine());
		CromoBaloncesto a = hm.get(i);
		
		System.out.println("¿Cuál es el nuevo Nombre?");
		a.setNombre(sc.nextLine());
		System.out.println("¿Cuáles son los nuevos  puntos?");
		a.setPuntos(Integer.parseInt(sc.nextLine()));
		System.out.println("¿Cuáles son los nuevos rebotes?");
		a.setRebotes(Integer.parseInt(sc.nextLine()));
		
		
	}

	private static void morePoints(HashMap<Integer, CromoBaloncesto> hm) {
		CromoBaloncesto a = new CromoBaloncesto(null, null, -1, null);
		for (CromoBaloncesto i : hm.values()) {
			if (i.getPuntos() > a.getPuntos()) {
				a = i;
			}
		}
		System.out.println(a.toString());
	}
	
	private static void lessRebotes(HashMap<Integer, CromoBaloncesto> hm) {
		CromoBaloncesto a = new CromoBaloncesto(null, null, null, Integer.MAX_VALUE);
		for (CromoBaloncesto i : hm.values()) {
			if (i.getRebotes() < a.getRebotes()) {
				a = i;
			}
		}
		System.out.println(a.toString());
		
	}
	
	
	
}
