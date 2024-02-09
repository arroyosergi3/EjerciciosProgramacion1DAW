package capitulo08.bloque01.crud;

import java.sql.SQLException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args)  {
		Scanner sc =  new Scanner(System.in);
		int op = 0;
		System.out.println("¿Qué tabla quieres gestionar?\n0.- Salir\n1.- Fabricante\n2.- Cliente\n3.- Concesionario\n4.- Coche\n5.- Venta");
		op = Integer.parseInt(sc.nextLine());
		
		switch (op) {
		case 0: {
			break;
			
		}
		case 1: {
			try {
				Fabricante.main(args);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		case 2: {
			try {
				Cliente.main(args);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		}
		case 3: {
			try {
				Concesionario.main(args);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		}
		case 4: {
			try {
				Coche.main(args);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		}
		case 5: {
			try {
				Venta.main(args);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		}
		
		}
		
		
	}








}
