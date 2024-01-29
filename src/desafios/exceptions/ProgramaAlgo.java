package desafios.exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProgramaAlgo {

//	El método que lance las excepciones tiene que tener detrás de los argumentos de entrada la palabra 
//	"throws" y despues, el tipo de excepcion que lanza (El nombre de la clase que extiende de Exception)
	
//	El método que incorpore al que lanza las excepciones es al que se le tiene que poner 
//	el try-catch (Generalmente va a ser el main)
	
	private static void pideFrases() throws AlgoException {
		Scanner sc = new Scanner(System.in);
		String frase = "";
		
		
		do {
			System.out.println("Dame una frase: ");
			frase = sc.nextLine();
			String palabras[] = frase.split("[\s]+");
			List<String> listaPalabras = Arrays.asList(palabras);
			
			for (int i = 0; i < palabras.length; i++) {
				String palabra = palabras[i];
				if (listaPalabras.subList(0, i).contains(palabra)) {
					System.out.println("La palabra " + palabra + " está "
							+ "repetida");
					throw new AlgoException("La palabra " + 
							palabra + " está repetida en la frase: " + 
							frase);
				}
			}
			
		} while (!frase.equals(""));

	}
	
	
	
	public static void main(String[] args) {
		try {
			pideFrases();
		} catch (AlgoException e) {
			e.printStackTrace();
		}
	}

}
