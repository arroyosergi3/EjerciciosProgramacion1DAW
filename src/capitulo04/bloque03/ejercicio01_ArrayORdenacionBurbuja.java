package capitulo04.bloque03;

import utils.utilsArrays;

public class ejercicio01_ArrayORdenacionBurbuja {

	public static void main(String[] args) {
		int array [] = new int [150];
		utilsArrays.inicializaArray(array, 0, 1000);
		utilsArrays.imprimeArray(array);
		ordenacionBurbuja(array);
		System.out.println();
		utilsArrays.imprimeArray(array);
		
	}
	
	
	public static void ordenacionBurbuja (int a[]) {
		
		boolean hayCambios = true;
		int aux = 0;
		do {
			hayCambios = false;
		for(int i = 0; i < (a.length - 1);i++){
			
			if (a[i] > a[i+1]) {
				aux =  a[i];
				a[i] = a[i+1];
				a[i +1] = aux;
				hayCambios = true;
			}
			
		}
		
		}
		while (hayCambios == true);
		
	}

}
