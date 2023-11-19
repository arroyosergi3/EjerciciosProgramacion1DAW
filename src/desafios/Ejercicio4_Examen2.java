package desafios;

public class Ejercicio4_Examen2 {

	public static void main(String[] args) {
		char a[] = new char[] {'H','o','l','a', ' ' , 'M','u','n','d','o'};
		
		String m = minusculas(a);
		System.out.println(m);
	}
	
	
	public static String minusculas (char frase[]) {
		String s = "";
		for (int i = 0; i < frase.length; i++) {
			if(frase[i] > 65 && frase[i] < 90) {
				frase[i] += 32;
			}
			s += frase[i];
		}
		
		
		
		
		return s;
	}

}
