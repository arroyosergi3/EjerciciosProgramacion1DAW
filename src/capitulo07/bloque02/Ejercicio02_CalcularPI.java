package capitulo07.bloque02;

public class Ejercicio02_CalcularPI {

	public static void main(String[] args) {

        double miPI = 0;
        
        int signo = 1;
        
         for (int i = 1; Math.abs(miPI - Math.PI) > 0.000001; i += 2) {
                miPI += signo * 4.0 / i;
                signo *= -1;
            }
        System.out.println(miPI);

    }

}
