package capitulo07.bloque02;

public class Ejercicio01_CortarGraficas {

	public static void main(String[] args) {
		
		double x= 0, y1, y2;
		
		do {
			y1 = Math.sqrt(x);
			y2 = -Math.log(x);
			
			x += 0.000001;
		}while(Math.abs(y1 - y2 )>0.0001);
		System.out.println("El punto en el que se corta es: " + x + "," + y1);
		
		
	}

}
