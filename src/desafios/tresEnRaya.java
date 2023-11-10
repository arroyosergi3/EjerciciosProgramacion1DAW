package desafios;

import java.util.Scanner;

import javax.security.sasl.RealmCallback;


public class tresEnRaya {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tablero [][] = new int [3][3];
		int jugador;
		inicializarTablero(tablero);
		imprimirTablero(tablero);
		
		do {
			
			System.out.println("¿Qué jugador empieza?");
			jugador = sc.nextInt();
			if(jugador > 0 && jugador < 3){
				break;
			}
			System.err.println("ERROR, JUGADOR NO PERMITIDO");
		}while(jugador != 1 || jugador != 2);
		
		
		
			
		
		
		do {
			realizarMovimiento(tablero, jugador);
			if(verificarGanador(tablero, jugador)) {
				break;
			}
			imprimirTablero(tablero);
			jugador = cambiarTurno(jugador);
		} while( verificarGanador(tablero, jugador) == false && hayEmpate(tablero) == false);
		if(hayEmpate(tablero)) {
			System.out.println();
			System.out.println("EMPATE");
		}
		else {
			imprimirTablero(tablero);
			System.out.println();
			System.out.println("JUGADOR " + jugador + " WINS");
		}
	}
	
	
	public static void inicializarTablero(int tablero[][]){
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = 0;
			}
		}
		
	}
	
	public static void imprimirTablero(int tablero[][]){
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public static void realizarMovimiento(int tablero[][], int jugador){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nLe toca al jugador " + jugador);
		imprimirTablero(tablero);
		int fila, columna;
		System.out.println("¿En qué fila quieres poner la ficha?");
		fila = sc.nextInt();
		
		System.out.println("¿En qué colummna quieres poner la ficha?");
		columna = sc.nextInt();
		
		if(fila > 2 || fila < 0 || columna > 2 || columna < 0) {
        	System.err.println("ERROR, MOVIMIENTO NO PERMITIDO");
			realizarMovimiento(tablero, jugador);
		}
		
		
		
			if(jugador == 1){
				for (int i = 0; i < tablero.length; i++) {
					for (int j = 0; j < tablero.length; j++) {
						if(fila == i && columna == j){
							if(esMovimientoValido(tablero, fila, columna)) {
								tablero[i][j] = jugador;
							}
							else realizarMovimiento(tablero, jugador);
							
						}
					}
				}
			}
			
			
			
			if(jugador == 2){
				for (int i = 0; i < tablero.length; i++) {
					for (int j = 0; j < tablero.length; j++) {
						if(fila == i && columna == j){
							if(esMovimientoValido(tablero, fila, columna)) {
								tablero[i][j] = jugador;
							}
							else realizarMovimiento(tablero, jugador);

						}
					}
				}
			}
			
		
			
	}
	
	public static boolean esMovimientoValido(int tablero[][], int fila, int columna) {
	    for (int i = 0; i < tablero.length; i++) {
	        for (int j = 0; j < tablero.length; j++) {
	            if (i == fila && j == columna) {
	                if (tablero[i][j] != 0 ) {
	                	System.err.println("ERROR, MOVIMIENTO NO PERMITIDO");
	                    return false;
	                }
	            }
	        }
	    }
	    
	    return true;
	}

	
	public static boolean verificarGanador(int tablero[][], int jugador) {
	    for (int i = 0; i < tablero.length; i++) {
	        if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
	            (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
	            return true;
	        }
	    }
	   
		
	    if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
	        (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
	        return true;
	    }

	    return false;
	}
	
	
	public static boolean hayEmpate(int tablero [][]){
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if( tablero[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static int cambiarTurno (int jugador){
		int cambio = jugador;
		
			if(jugador == 1) {
				cambio = 2;
			}
			if (jugador == 2){
				cambio = 1;
		
			}
			
		return cambio;
	}

	

	
	
	
	
	
	

}
