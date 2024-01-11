package capitulo07.bloque01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Ejercicio04_FicheroDePropiedades {

	private static Properties propiedades = null;

	public Ejercicio04_FicheroDePropiedades () {
		super();
	}
	
	/**
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {
				// Una forma de leer el fichero de propiedades
//				propiedades.load(propiedades.getClass().getResourceAsStream("/tutorialJava/capitulo6_Recursos/ejemplo.properties"));

				// Otra forma de leer el fichero de propiedades
				File file = new File("/home/diurno/git/EjerciciosProgramacion1DAW/src/capitulo07/bloque01/prueba.properties");
				System.out.println("Fichero encontrado: " + file.exists());
				propiedades.load(new FileReader(file));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}

	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty (String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static Float getFloatProperty (String nombrePropiedad) {
		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
	}
	
	public static Boolean getBooleanProperty(String nombrePropiedad) {
		return Boolean.parseBoolean(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	public static void main(String[] args) {
		String s = Ejercicio04_FicheroDePropiedades.getProperty("String");
		Float f = Ejercicio04_FicheroDePropiedades.getFloatProperty("float");
		Integer i = Ejercicio04_FicheroDePropiedades.getIntProperty("int");
		Boolean b = Ejercicio04_FicheroDePropiedades.getBooleanProperty("boolean");
		
		System.out.println("String: " + s
						+ "\nFloat: " + f 
						+ "\nInt: " + i 
						+ "\nBoolean: " + b);
		
		
	
	}

}
