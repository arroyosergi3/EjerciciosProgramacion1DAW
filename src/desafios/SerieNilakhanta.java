package desafios;

public class SerieNilakhanta {

	public static void main(String[] args) {
		double pi = 3;
		double denom = 4;
		
			for (int i = 2;(Math.PI - pi) >= 0.0001; i+= 2) {
				
				pi += denom /(i*(i+1)*(i+2));
				denom = -denom;
			}
		
		System.out.println(pi);
	}

}
