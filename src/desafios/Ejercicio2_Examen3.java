package desafios;


import utils.utils;
import utils.utilsArrays;

public class Ejercicio2_Examen3 {

	public static void main(String[] args) {
		int a[] = new int [10];
		utilsArrays.inicializaArray(a, 0, 10);
		utilsArrays.imprimeArray(a);
		encontrar2MayorNota(a);
		
		
		
		
		
	}
	
	
	public static void encontrar2MayorNota(int a[]){
		utilsArrays.ordenacionBurbuja(a);
		utilsArrays.imprimeArray(a);
		System.out.println("La segunda mayor nota es " + (a[a.length-2]));
	}
	
	
	
	

}
