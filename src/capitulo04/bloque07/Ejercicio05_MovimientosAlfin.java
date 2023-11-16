package capitulo04.bloque07;


import java.util.Scanner;

public class Ejercicio05_MovimientosAlfin {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int tablero[][] = new int [8][8];

System.out.println("¿Cuál es la fila del alfil?");
int fila = sc.nextInt();
sc.nextLine();
System.out.println("¿Cuál es la columna del alfil?");
String columna = sc.nextLine();

fila --;
int columnanum = 0;
if (columna.equals("a") || columna.equals("A")){
columnanum = 0;
}
if (columna.equals("b") || columna.equals("B")){
columnanum = 1;
}if (columna.equals("c") || columna.equals("C")){
columnanum = 2;
}if (columna.equals("d") || columna.equals("D")){
columnanum = 3;
}if (columna.equals("e") || columna.equals("E")){
columnanum = 4;
}if (columna.equals("f") || columna.equals("F")){
columnanum = 5;
}if (columna.equals("g") || columna.equals("G")){
columnanum = 6;
}if (columna.equals("h") || columna.equals("H")){
columnanum = 7;
}


movimientosAlfil(tablero, fila, columnanum);


}



public static void movimientosAlfil(int m[][], int filaAlfil, int columnaAlfil) {
   System.out.println("Los movimientos posibles son:");

   for (int i = filaAlfil, j = columnaAlfil; i < m.length && j < m[i].length; i++, j++) {
       if (i >= 0 && i < 7) {
           char letraColumna = (char) ('A' + j);
           System.out.println("Alfil " + letraColumna + (i + 1));
       }
   }

   for (int i = filaAlfil, j = columnaAlfil; i < m.length && j >= 0; i++, j--) {
       if (i >= 0 && i < 7) {
           char letraColumna = (char) ('A' + j);
           System.out.println("Alfil " + letraColumna + (i + 1));
       }
   }

   for (int i = filaAlfil, j = columnaAlfil; i >= 0 && j < m[i].length; i--, j++) {
       if (i >= 0 && i < 7) {
           char letraColumna = (char) ('A' + j);
           System.out.println("Alfil " + letraColumna + (i + 1));
       }
   }

   for (int i = filaAlfil, j = columnaAlfil; i >= 0 && j >= 0; i--, j--) {
       if (i >= 0 && i < 7) {
           char letraColumna = (char) ('A' + j);
           System.out.println("Alfil " + letraColumna + (i + 1));
       }
   }
}











}