package capitulo04.bloque07;

import utils.utils;

public class Ejercicio04_mayorYMenorMatriz {

	public static void main(String[] args) {

		int matriz[][] = new int [6][10];
		matriz = inicializarMatrizSinRepetirNumeros(matriz);
		imprimeMatriz(matriz);
		mayorYMenorMatriz(matriz);
	}
	
	public static int[][] inicializarMatrizSinRepetirNumeros(int m[][] ) {
	    for (int i = 0; i < m.length; i++) {
	        for (int j = 0; j < m[i].length; j++) {
	            int n;
	            boolean repetido;
	            //saca números hasta que haya uno que no se repita
	            do {
	                n = utils.obtenerNumeroAzar(0, 1000);
	                repetido = false;

	                for (int k = 0; k < m.length; k++) {
	                    for (int k2 = 0; k2 < m[k].length; k2++) {
	                        if (n == m[k][k2]) {
	                            repetido = true;
	                            break;
	                        }
	                    }
	                }
	            } while (repetido);
	            //mete el valor del numero no repetido en la posicion de la matriz
	            m[i][j] = n;
	        }
	    }

	    return m;
	}

	public static void imprimeMatriz(int m [] []){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "	");
			}
			System.out.println();
		}
	}
	
	public static void mayorYMenorMatriz(int m[][]){
		int menor = m[0][0], mayor = m[0][0];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j] > mayor) {
					mayor = m[i][j];
				}
				if(m[i][j] < menor) {
					menor = m[i][j];
				}
			}
		}
		System.out.println("El número menor es: " + menor);
		System.out.println("El número mayor es: " + mayor);

	}
	

}
