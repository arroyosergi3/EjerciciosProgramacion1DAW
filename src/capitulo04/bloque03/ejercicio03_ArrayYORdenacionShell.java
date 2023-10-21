package capitulo04.bloque03;

import utils.utilsArrays;

public class ejercicio03_ArrayYORdenacionShell {

	public static void main(String[] args) {
		int array[] = new int[10];
		
		utilsArrays.inicializaArray(array, 0, 100);
		utilsArrays.imprimeArray(array);
		ordenacionShell(array);
		System.out.println();
		utilsArrays.imprimeArray(array);
	}
	
	
	public static void ordenacionShell(int a[]){
		int aux;
		boolean hayIntercambio = true;
		for(int i = a.length/4; i > 0; i /= 2) {
			
			do {
				hayIntercambio = false;
				int j = 0;
			for (j = 0 ; j < a.length - i; j ++) {
				
				System.out.println("comparo " + a[j] + " con " + a[j +i]);
				if(a[j] > a[j+i]){
					aux = a[j];
					a[j] = a[j+i];
					a[j+i] = aux;
					hayIntercambio = true;
					System.out.println("Intercambio " + a[j] + " con " + a[j + i]);
					utilsArrays.imprimeArray(a);
				}
			}
			} while(hayIntercambio == true);
			System.out.println("Divido el shell entre 2");
		}
	}

}
