package capitulo04.bloque06;

import java.util.Scanner;

import utils.utils;

public class ejercicio01_matrices {

	public static void main(String[] args) {
		int matriz[][] = new int [5][5];
		int traspuesta[][] = new int [5][5];
		int opuesta[][] = new int [5][5];
		int sinFila [][] = new int[4][5];
		matriz = inicializaMatriz(matriz);
		imprimeMatriz(matriz);
//		int array[] = creaArrayConMatriz(matriz);
//		
//		System.out.println("La matriz es positiva: " + esMatrizPositiva(matriz) );
//		System.out.println("La matriz es positiva: " + esMatrizDiagonal(matriz) );
//		System.out.println("La matriz es positiva: " + esMatrizTriangularSuperior(matriz) );
//		System.out.println("La matriz es positiva: " + esMatrizDispersa(matriz) );
//		System.out.println();
//		traspuesta = creaMatrizTraspuesta(matriz);
//		imprimeMatriz(traspuesta);
//		for (int i = 0; i < array.length; i++) {
//			System.out.print( array[i] + " ");
//		}
//		
//		System.out.println();
//		opuesta = creaMatrizOpuesta(matriz);
//		imprimeMatriz(opuesta);
//		
//		sinFila = eliminaFilaMatriz(matriz);
//		imprimeMatriz(sinFila);
		
		
		
		
		
	}
	
	public static int [][] inicializaMatriz(int m [][]){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = utils.obtenerNumeroAzar(0, 100);
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
	
	
	public static boolean esMatrizPositiva(int m [][]){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m [i][j] < 0) return false;
				
			}
		}
		return true;
	}
	
	
	public static boolean esMatrizDiagonal(int m[][]){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(i != j) {
					if(m[i][j] != 0) {
						return false;
					}
				}
				
			}
		}
		return true;
		
	}
	
	public static boolean esMatrizTriangularSuperior (int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(i > j){
					if(m[i][j] !=0) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	
	public static boolean esMatrizDispersa(int m[][]){
		boolean hay0fila = false;
		boolean hay0columna= false;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j] == 0){
					hay0fila = true;
				}
				if(m[j][i] == 0){
					hay0columna = true;
				}				
			}
			if (hay0fila == false || hay0columna == false) {
				return false;
			}
		}
		return true;
	}
	
	
	public static int[] creaArrayConMatriz(int m[][]){
		int k = 0;
		int array[] = new int[(m[0].length * m.length)];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
					array[k] = m[i][j];
				k++;
			}
		}
		return array;
	}
	
	
	public static boolean esMatrizSimetrica (int m[][]){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j] != m[j][i]){
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static int[][] creaMatrizTraspuesta(int m[][]){
		int tras [][] = new int[m.length][m[0].length];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				tras[j][i] = m[i][j];
			}
		}
		return tras;
	}
	
	
	public static int [][] creaMatrizOpuesta(int m[][]){
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] *= -1;
			}
		}
		return m;
	}
	
	
	public static int[][] eliminaFilaMatriz(int m [][]){
		int sinFila [][] = new int[m.length - 1][m[0].length];
		int fila, k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué fila quieres eliminar?");
		fila = sc.nextInt();
		for (int i = 0; i < m.length; i++) {
	        if (i != fila) {
	            for (int j = 0; j < m[i].length; j++) {
	                sinFila[k][j] = m[i][j];
	            }
	            k++;
	        }
	    }
		
		return sinFila;
	}
	

}
