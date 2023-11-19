package desafios;

import java.util.Iterator;

public class Ejercicio1_Examen2 {

	public static void main(String[] args) {
		int matriz[][] = new int [][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		if(matriz.length == matriz[0].length){
			if(comprobarOrdenados(matriz)) {
				System.out.println("La matriz está ordenada");
			}
			else System.out.println("La matriz NO está ordenada");
		}
	}
	
	
	public static boolean comprobarOrdenados(int m[][]) {
		int a[] = new int[(m.length * m[0].length)];
		int index = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				a[index] = m[i][j];
				index++;
			}
		}
		
		for (int i = a.length -1; i > 1; i--) {
			if(a[i] > a[i-1]) {
				
			}
			else return false;
		}
		return true;
		
	}

}
