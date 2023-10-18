package utils;

public class utils {

	public static int obtenerNumeroAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;

}
}
