package capitulo6.bloque02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;



public class Ejercicio01_HashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		HashMap<Integer, Articulo> hm = new HashMap<Integer, Articulo>();
		do {
			System.out.println("Menú\n"
					+ "0.- Salir\n"
					+ "1.- Lista de Artículos\n"
					+ "2.- Crear un nuevo Artículo\n"
					+ "3.- Eliminar un Artículo\n"
					+ "4.- Actualizar un Artículo");
			 op = Integer.parseInt(sc.nextLine());
			 
			 
			 switch (op) {
			case 1: {
				listarArticulo(hm);
				break;
				
			}
			case 2:{
				crearArticulo(hm, sc);
				break;
			}
			case 3:{
				eliminarArticulo(hm, sc);
				break;
			}
			case 4:{
				actualizarArticulo(hm, sc);
				break;
				
			}
			
			}
			 
		}while(op != 0);
		System.out.println("Has salido del Programa");
		
	}
	
	public static void crearArticulo(HashMap<Integer, Articulo> hm, Scanner sc) {
		System.out.println("Dime el código del artículo");
		Integer c = Integer.parseInt(sc.nextLine());
		System.out.println("Dime el número de estantería");
		Integer n = Integer.parseInt(sc.nextLine());
		System.out.println("Dime el stock");
		Integer s = Integer.parseInt(sc.nextLine());
		Articulo a = new Articulo();
		a.setCodigo(c);
		a.setnEs(n);
		a.setStock(s);
		hm.put(c, a);
		
		
	}
	public static void listarArticulo(HashMap<Integer, Articulo> hm) {
		Iterator<Articulo> a = hm.values().iterator();
		while (a.hasNext()) {
			System.out.println(a.next());
		}
	}
	public static void eliminarArticulo(HashMap<Integer, Articulo> hm, Scanner sc) {
		System.out.println("Dime el código del artículo a eliminar");
		Integer coar = Integer.parseInt(sc.nextLine());
		hm.remove(coar);
	}
	public static void actualizarArticulo(HashMap<Integer, Articulo> hm, Scanner sc) {
		System.out.println("Qué artículo quieres modificar?");
		Integer c = Integer.parseInt(sc.nextLine());
		Articulo a = hm.get(c);
		System.out.println("Cuál es su nuevo Nº de Estantería?");
		a.setnEs(Integer.parseInt(sc.nextLine()));
		System.out.println("Cuál es su nuevo stock");
		a.setStock(Integer.parseInt(sc.nextLine()));
	}
}
