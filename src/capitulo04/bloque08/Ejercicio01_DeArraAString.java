package capitulo04.bloque08;

public class Ejercicio01_DeArraAString {

	public static void main(String[] args) {
		int a[] = new int []{72,79,76,65};
		System.out.println(stringFromArray(a));
	
	}
	
	public static StringBuffer stringFromArray(int a[]){
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			s.append((char)a[i]);
		}
		return s;
		
	}

}
