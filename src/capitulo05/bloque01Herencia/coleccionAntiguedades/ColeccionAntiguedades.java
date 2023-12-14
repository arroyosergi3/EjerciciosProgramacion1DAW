package capitulo05.bloque01Herencia.coleccionAntiguedades;

import java.util.Scanner;



public class ColeccionAntiguedades {

	public static void main(String[] args) {
		
		Antiguo articulos [] = new Antiguo[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < articulos.length; i++) {
			System.out.println("¿Que tipo de antiguedad es?\n1. Joya\n2. Libro\n3. Ceramica\n4. Alfombra");
			int n = Integer.parseInt(sc.nextLine());
			if(n >= 1 && n <= 4) {
				
				
				if(n == 1) {
					Joya j = new Joya();
					System.out.println("¿Cuál es el material de fabricacion?");
					j.setMaterial(sc.nextLine());
					
					articulos[i] = j;
					
					
				}
				else if(n == 2){
					Libro l = new Libro();
					System.out.println("¿Cuál es el autor?");
					l.setAutor(sc.nextLine());
					System.out.println("¿Cuál es el título?");
					l.setTitulo(sc.nextLine());
					articulos[i] = l;
				}
				else if(n == 3) {
					Ceramica c = new Ceramica();
					System.out.println("¿Cuál es el estilo?");
					c.setEstilo(sc.nextLine());
					articulos[i] = c;
				}
				else if(n == 4) {
					Alfombra a = new Alfombra();
					System.out.println("¿Cuál es el ancho?");
					a.setAncho(Integer.parseInt(sc.nextLine()));
					System.out.println("¿Cuál es el largo?");
					a.setLargo(Integer.parseInt(sc.nextLine()));
					System.out.println("¿Cuál es el grosor?");
					a.setGrosor(Integer.parseInt(sc.nextLine()));
					articulos[i] = a;
				}
				System.out.println("Cuál es el año de fabricación?");
				articulos[i].setAñoF(Integer.parseInt(sc.nextLine()));
				System.out.println("Cuál es el precio del artículo?");
				articulos[i].setPrecio(Integer.parseInt(sc.nextLine()));
				System.out.println("Cuál es el origen del artículo?");
				articulos[i].setOrigen(sc.nextLine());
				
				
			}
			else System.out.println("Error, no es una opción válida");
			
			
		}
		

		for (int i = 0; i < articulos.length; i++) {
			System.out.println(articulos[i].toString());
		}
		
		sc.close();		
	}
		
		
		
	}


