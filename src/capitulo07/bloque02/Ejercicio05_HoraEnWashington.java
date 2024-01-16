package capitulo07.bloque02;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio05_HoraEnWashington {

	public static void main(String[] args) {
		Calendar roma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		Calendar washingtondc = Calendar.getInstance(TimeZone.getTimeZone("Etc/GMT+5"));
		
		System.out.println("La hora en Roma es: "+ roma.get(Calendar.HOUR_OF_DAY));
		System.out.println("La hora en Whasington es: " + washingtondc.get(Calendar.HOUR_OF_DAY) );
		System.out.println("La diferencia horaria es: " + Math.abs(washingtondc.get(Calendar.HOUR_OF_DAY) - roma.get(Calendar.HOUR_OF_DAY)));
	}

}
