package capitulo05.bloque01Herencia.articulosComestibles;

import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		
		Articulo articulos [] = new Articulo[4];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < articulos.length; i++) {
			System.out.println("El nuevo articulo es pedecedero o no pedecedero?\n"
					+ "0: Pedecedero\n1: No Pedecedero");
			int n = Integer.parseInt(sc.nextLine());
			if(n >= 0 && n <= 1) {
				
				
				if(n == 0) {
					Perecederos p = new Perecederos();
					System.out.println("Cuál es la fecha de caducidad?");
					p.setfCad(sc.nextLine());
					
					articulos[i] = p;
					
					
				}
				else {
					NoPerecederos np = new NoPerecederos();
					articulos[i] = np;
				}
				System.out.println("Cuál es el código del artículo?");
				articulos[i].setCodigo(Integer.parseInt(sc.nextLine())); 
				System.out.println("Cuál es el nombre del artículo?");
				articulos[i].setNombre(sc.nextLine());
				System.out.println("Cuál es el precio del artículo?");
				articulos[i].setPrecio(Integer.parseInt(sc.nextLine()));
				
			}
			else System.out.println("Error, no es una opción válida");
			
			
		}
		

		for (int i = 0; i < articulos.length; i++) {
			System.out.println(articulos[i].toString());
		}
		
		sc.close();		
	}

}
