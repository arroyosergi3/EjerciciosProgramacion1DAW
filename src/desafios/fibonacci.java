package desafios;

public class fibonacci {

	public static void main(String[] args) {
		int a [] = new int[20];
		a[0] = 1;
		a[1] = 1;
		
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i-1] + a[i- 2] ;
			
		}
		utils.utilsArrays.imprimeArray(a);
	}

}
