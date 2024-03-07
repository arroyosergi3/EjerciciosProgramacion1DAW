package capitulo07.bloque02;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Ejercicio04_Dates {
	
	
    public static void main(String[] args) {
        String date = JOptionPane.showInputDialog("Introduce una fecha (dias/mes/año hh:mm:ss)");
        
        //date == fecha en String
        Date fecha = null;

        try {
            fecha = new Date(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(date).getTime());
        } catch (ParseException e) {
            System.out.println("El formato de la fecha es incorrecto");
            System.exit(1);
        }

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);

        System.out.println("Fecha introducida con Simple Date Format: " + fecha.toString());
        System.out.println("Año "+new SimpleDateFormat("yyyy").format(fecha) + "\nMes " +
                           (new SimpleDateFormat("MM").format(fecha)) + "\nDia " +
                           new SimpleDateFormat("dd").format(fecha) + "\nHora " +
                           new SimpleDateFormat("hh").format(fecha) + "\nMinutos " +
                           new SimpleDateFormat("mm").format(fecha) + "\nSegundos " +
                           new SimpleDateFormat("ss").format(fecha));
        
        System.out.println("Fecha introducida: " + fecha.toString());
        System.out.println("Año " + calendario.get(Calendar.YEAR) + "\nMes " +
                           (calendario.get(Calendar.MONTH) + 1) + "\nDia " +
                           calendario.get(Calendar.DAY_OF_MONTH) + "\nHora " +
                           calendario.get(Calendar.HOUR_OF_DAY) + "\nMinutos " +
                           calendario.get(Calendar.MINUTE) + "\nSegundos " +
                           calendario.get(Calendar.SECOND));
        System.out.println("\nCampos de Calendar:");
        calendario.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println("Calendario mas 2 dias: " + calendario.getTime());

        calendario.setTime(fecha);
        calendario.add(Calendar.DAY_OF_MONTH, -14);
        System.out.println("Calendario menos 14 dias: " + calendario.getTime());

        calendario.setTime(fecha);
        calendario.add(Calendar.DAY_OF_MONTH, 300);
        System.out.println("Calendario mas 300 dias: " + calendario.getTime());

        calendario.setTime(fecha);
        calendario.add(Calendar.YEAR, 4);
        System.out.println("Calendario mas 4 años: " + calendario.getTime());
    }
}
