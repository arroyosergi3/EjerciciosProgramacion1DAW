package desafios;

import java.util.Scanner;

import javax.security.sasl.RealmCallback;


public class tresEnRaya {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tablero [][] = new int [3][3];
		int jugador, fila, columna, turno = 0;
		inicializarTablero(tablero);
		imprimirTablero(tablero);
		
		System.out.println("¿Qué jugador empieza?");
		jugador = sc.nextInt();
		
		do {
			System.out.println("Le toca al jugador " + jugador);
			System.out.println("¿En qué fila quieres poner la ficha?");
			fila = sc.nextInt();
			System.out.println("¿En qué colummna quieres poner la ficha?");
			columna = sc.nextInt();
			realizarMovimiento(tablero, fila, columna, jugador);
			imprimirTablero(tablero);
			jugador = cambiarTurno(jugador);
			
			
			
		} while( verificarGanador(tablero, jugador) == false || hayEmpate(tablero) == false);
		
		if(verificarGanador(tablero, jugador)) {
			System.out.println("JUGADOR " + jugador + " WINS");
		}
		if(hayEmpate(tablero)) {
			System.out.println("EMPATE");
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
				System.out.print(tablero[i][j] + "	");
			}
			System.out.println();
		}
		
	}
	public static void realizarMovimiento(int tablero[][], int fila, int columna, int jugador){
		
		
		if(jugador == 1){
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero.length; j++) {
					if(fila == i && columna == j){
						if(esMovimientoValido(tablero, fila, columna)) {
							tablero[i][j] = jugador;
						}
						
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
						
					}
				}
			}
		}
		
			
	}
	
	public static boolean esMovimientoValido(int tablero[][], int fila, int columna) {
	    for (int i = 0; i < tablero.length; i++) {
	        for (int j = 0; j < tablero.length; j++) {
	            if (i == fila && j == columna) {
	                if (tablero[i][j] != 0) {
	                    System.out.println("Error, movimiento no permitido");
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
		int cambio = 0;
		if(jugador == 1) {
			cambio = 2;
		}
		if (jugador == 2){
			cambio = 1;
		}
		return cambio;
	}

	
	
	
	
	
	

}
