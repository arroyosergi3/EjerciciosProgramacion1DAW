package desafios;


public class Ejercicio2_Examen1 {

	public static void main(String[] args) {
		int matriz[][] = new int [10][10];
		
		imprimeMatriz(matriz);
		matriz = rellenamatriz(matriz);
		System.out.println();
		imprimeMatriz(matriz);
		
		
		
	}
	
	public static void imprimeMatriz(int m [] []){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int[][] rellenamatriz (int m [][]){
		for (int i = 0; i < m.length; i++) {
			if (i != 4  && i != 5) {
				if(i % 2 != 0){
					for (int j = 0; j < m.length; j++) {
						if(j % 2 == 0) {
							m[i][j] = 1;
						}
						
					}
				}
				else {
					for (int j = 0; j < m.length; j++) {
						if(j % 2 != 0) {
							m[i][j] = 1;
						}
					}
				}
				
			}
			
		}
		
		return m;
	}
}
