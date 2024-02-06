package desafios;

public class NumEuler {

	public static void main(String[] args) {
		double euler = 0;
		
		for (int i = 0; i < 15; i++) {
			euler += 1d / factorial(i);
		}
		System.out.println("E: " + euler);
	}

	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int factorial (int n) {
		if (n == 0) {
			return 1;
		}
		else {
			for (int i = n-1; i > 1; i--) {
				n = n * i;
			}
			
			return n;
		}
	}

}
	
	

