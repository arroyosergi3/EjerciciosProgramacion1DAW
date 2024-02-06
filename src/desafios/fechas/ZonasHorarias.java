package desafios.fechas;

import java.util.TimeZone;

public class ZonasHorarias {
	   public static void main(String[] args) {
	        String zonasHorarias[] = TimeZone.getAvailableIDs();
	        for (String str : zonasHorarias)
	            System.out.println("Zona horaria: " + str);
	    }
}
