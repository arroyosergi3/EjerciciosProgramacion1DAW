package capitulo6.bloque01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio02_ListaString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		List<String> lista = new ArrayList<String>();
		List<String> portapapeles = new ArrayList<String>();
		
		do {
			System.out.println("Menú\n1. Abandonar Prgrama\n2. Agregar una linea al texto"
					+ "\n3. Añadir linea en posicion\n4. Editar una línea"
					+ "\n5. Borrar Lineas\n6. Cortar\n"
					+ "7. Pegar\n8. Imprime lista");
			n = Integer.parseInt(sc.nextLine());
			switch(n) {
			case 1:{
				System.out.println("Has abandonado el programa");
				break;
			}
			case 2:{
					System.out.println("Dame la linea que quieras añadir");	
					String s = sc.nextLine();
					aniadirLista(lista, s);
					break;
					
			}
			case 3:{
					System.out.println("Dame la posición en la que añadirla");
					int pos = Integer.parseInt(sc.nextLine());
					System.out.println("Dame la línea que quieres añadir");
					String s = sc.nextLine();
					aniadirEnPos(lista, s, pos);
					
					
				break;
			}
			case 4:{
				
				System.out.println("Dame la posición que quieres editar");
				int pos = Integer.parseInt(sc.nextLine());
				editarLinea(lista, pos);
				break;
			}
			case 5:{
				System.out.println("Dame la posición que quieres borrar");
				int pos = Integer.parseInt(sc.nextLine());
				borrarLinea(lista, pos);
				break;
			}
			case 6:{
				System.out.println("Dame la posición inicial");
				int posI = Integer.parseInt(sc.nextLine());
				System.out.println("Dame la posición final");
				int posF = Integer.parseInt(sc.nextLine());
				portapapeles = cortarLineas(lista, posI, posF);
				break;
			}
			case 7:{
				System.out.println("En qué posición lo quieres pegar?");
				int p = Integer.parseInt(sc.nextLine());
				pegarLineas(portapapeles, lista, p);
				break;
			}
			case 8:{
				imprimirLista(lista);
				break;
}
			}
			
	
		}while(n != 1);
		
	}
	
	
	
	
	public static void aniadirLista(List<String> l, String s) {
		l.add(s);
	}
	public static void aniadirEnPos(List <String> l, String s, int p) {
		l.add(p, s);
	}
	public static void  editarLinea(List <String> l, int p) {
		Scanner sc = new Scanner(System.in);
		for (int i = l.size() -1 ; i >= 0; i--) {
			if(p == i) {
				System.out.println(l.get(i));
				System.out.println("Dame una línea");
				String s = sc.nextLine();
				l.set(p, s);
			}
		}
	}
	public static void borrarLinea(List <String> l, int p) {
		for (int i = l.size() - 1; i >= 0; i--) {
			if(i == p) {
				l.remove(i);
			}
		}
	}
	public static List cortarLineas(List <String> l, int i, int f) {

		List <String> portapapeles = new ArrayList<String>();
		for (int j = f; j >= i; j--) {
				portapapeles.add(l.get(j));
				borrarLinea(l, j);
		}
		return portapapeles;

	}
	public static void pegarLineas(List <String> port,List <String> l, int p){
		
            l.addAll(p, port);
        
    }
	public static void imprimirLista(List <String> l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
