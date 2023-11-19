package desafios;

public class Ejercicio3_Examen2 {

	public static void main(String[] args) {
		double a[] = new double [10];
		rafanacci(a);
		
	}
	
	
	public static void rafanacci(double a[]) {
	    for (int i = 0; i < a.length; i++) {
	        if (i == 0) {
	            a[i] = 1;
	        } else if (i == 1) {
	            a[i] = 0.5 * a[i - 1];
	        } else {
	            a[i] = a[i - 1] * a[i - 2] + 0.5 * a[i - 1];
	        }
	        System.out.print(a[i] + " ");
	    }
	}

	
	
	
	

}
