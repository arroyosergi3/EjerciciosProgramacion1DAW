package capitulo07.bloque03;

import javax.swing.JOptionPane;

public class PidePalabra {

	public static void main(String[] args) {
		
		try {
			pideFrase();
		} catch (PalabraBombillaException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	
	
	
	public static void pideFrase() throws PalabraBombillaException{
		String s = JOptionPane.showInputDialog("Introduce una frase con \"bombilla\"");
		
		if (s.isBlank()) {
			throw new PalabraBombillaException("Error, la frase está en blanco");
		}
		if (s.split("\\s+").length < 3) {
			throw new PalabraBombillaException("Error, la frase es muy corta(tamaño promedio)");
		}
		if (s.contains("bombilla") == false) {
			throw new PalabraBombillaException("Error, la frase no contiene la palabra \"bombilla\"");
		}
		if (s.contains("tonto") || s.contains("tonta")  || s.contains("idiota")) {
			throw new PalabraBombillaException("Error, la frase contiene palabras soeces");
		}
		
		System.out.println("La frase es correcta");

		
		
	}
}
	
	
	


