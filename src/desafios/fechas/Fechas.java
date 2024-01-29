package desafios.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;



public class Fechas {

	
	public static void main(String[] args) {
		
		
		// DE STRING A DATE CON CALENDAR
//		String s = "2023-02-09 10.30.27";
//		Date f = null;
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
//		try {
//			f = sdf.parse(s);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(f);
//		cal.add(Calendar.DAY_OF_YEAR, -14);
//		System.out.println("Calendar dos semanas atras: " + cal.get(Calendar.YEAR) + 
//				"-" + (cal.get(Calendar.MONTH) + 1) + 
//				"-" + cal.get(Calendar.DAY_OF_MONTH) + 
//				" " + cal.get(Calendar.HOUR_OF_DAY) + 
//				"." + cal.get(Calendar.MINUTE) + 
//				"." + cal.get(Calendar.SECOND) 
//				);
//		
//		
//		
//		
		//DIFERENCIA DE HORAS
		
//		Calendar ahoraEnGalapagos = Calendar.getInstance(TimeZone.getTimeZone("Pacific/Galapagos"));
//		Calendar ahoraEnLisboa = Calendar.getInstance(TimeZone.getTimeZone("Europe/Lisbon"));
//		
//		int horaEnGalapagos = ahoraEnGalapagos.get(Calendar.HOUR_OF_DAY);
//		int horaEnLisboa = ahoraEnLisboa.get(Calendar.HOUR_OF_DAY);
//
//		System.out.println("Diferencia horaria: " + Math.abs(horaEnGalapagos - horaEnLisboa));
//	
		
		
		//TODAS LAS ZONAS HORARIAS
		
		        String zonasHorarias[] = TimeZone.getAvailableIDs();
		        for (String str : zonasHorarias)
		            System.out.println("Zona horaria: " + str);
		    

//		
//		
		
		
		
	}

}
