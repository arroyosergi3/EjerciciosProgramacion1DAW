package capitulo6.bloque01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio01_ListaInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		List<Integer> lista = new ArrayList<Integer>();
		
		do {
			System.out.println("Menú\n1. Abandonar Prgrama\n2. Crear Aleatoriamente Lista de Valores"
					+ "\n3. Calcular Suma, Media, Mayor y Menor\n4. Agregar Cantidad de Nuevos Valores"
					+ "\n5. Eliminar Elementos de Intervalo\n6. Imprimir Lista");
			n = Integer.parseInt(sc.nextLine());
			switch(n) {
			case 1:{
				System.out.println("Has abandonado el programa");
				break;
			}
			case 2:{
					System.out.println("Dame la longitud de la lista");	
					int l = Integer.parseInt(sc.nextLine());
					System.out.println("Dame el valor mínimo");	
					int mi = Integer.parseInt(sc.nextLine());
					System.out.println("Dame el valor máximo");	
					int ma = Integer.parseInt(sc.nextLine());
					crearLista(lista, l, mi, ma);
					break;
					
			}
			case 3:{
				operaciones(lista);
				break;
			}
			case 4:{
				
			}
			case 5:{
				
			}
			case 6:{
				imprimirLista(lista);
				
				break;
			}
			
			
			}
			
	
		}while(n != 1);
	}
			
	
	
	
	public static void crearLista(List<Integer> l, int lon, int vmin, int vmax) {
		l.clear();
		for (int i = 0; i < lon ;i++) {
			l.add(Integer.valueOf(utils.utils.obtenerNumeroAzar(vmin, (vmax))));
		}
	}
	public static void operaciones(List<Integer> l) {
	
		int suma = 0, media;
		Integer menor, mayor;
		menor = l.get(0);
		mayor = l.get(0);
		for (int i = 0; i < l.size(); i++) {
			suma += l.get(i).intValue();
			if(menor.intValue() > l.get(i).intValue()) {
				menor = l.get(i);
			}
			if(mayor.intValue() < l.get(i).intValue()) {
				mayor = l.get(i);
			}
		}
		
		media = suma / l.size();
		System.out.println("La suma es " + suma + "\nLa media es " + media + "\nEl"
		+ " mayor es " + mayor + "\nEl menor es "+ menor);
		
	}
	public static void imprimirLista(List <Integer> l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
		System.out.println();
	}
	
	
	
	

}
