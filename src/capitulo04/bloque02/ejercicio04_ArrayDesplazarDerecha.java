package capitulo04.bloque02;

import utils.utilsArrays;

public class ejercicio04_ArrayDesplazarDerecha {

	public static void main(String[] args) {
		int array[] = new int [5];
		utilsArrays.inicializaArray(array, 0, 100);
		utilsArrays.imprimeArray(array);
		desplazaCiclicoDerecha(array);
		utilsArrays.imprimeArray(array);

		
		
	}
	

	
	
	public static void desplazaCiclicoDerecha (int a[]) {
	
		int right = 0;
		right = a[a.length - 1];
		for (int i = (a.length - 1); i > 0;i--){
			a[i] = a[i-1];
		}
		a[0] = right;
	}
	
}
