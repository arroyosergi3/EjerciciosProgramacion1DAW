package desafios.fechas;

import java.util.Calendar;
import java.util.Date;

public class OperacionesCalendar {
	
	  public static void main(String[] args) {
          // Obtener la fecha actual
          Date fechaActual = new Date();
          System.out.println("Fecha actual: " + fechaActual);

          // Sumar dos semanas a la fecha actual
          Date nuevaFecha = sumarSemanas(fechaActual, 2);
          System.out.println("Fecha después de sumar 2 semanas: " + nuevaFecha);
      }

	  
	  
      private static Date sumarSemanas(Date fecha, int semanas) {
          // Convertir Date a Calendar
          Calendar calendar = Calendar.getInstance();
          calendar.setTime(fecha);

          // Sumar las semanas a la fecha
          calendar.add(Calendar.WEEK_OF_YEAR, semanas);
          
       // Sumar las semanas a la fecha
         // calendar.add(Calendar.WEEK_OF_YEAR, semanas)
          
          

          // Convertir Calendar de nuevo a Date
          return calendar.getTime();
      }

}
