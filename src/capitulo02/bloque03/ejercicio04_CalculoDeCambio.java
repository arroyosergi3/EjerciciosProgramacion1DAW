package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejercicio04_CalculoDeCambio {

	public static void main(String[] args) {
		
		String str;
		Double importe, total, cambio;
		int monedas100, monedas50, monedas25, monedas5, monedas1;
		
		str = JOptionPane.showInputDialog("Introduzca el importe: ");
		importe = Double.parseDouble(str);
		
		str = JOptionPane.showInputDialog("Introduzca el total : ");
		total = Double.parseDouble(str);
		
		cambio = total - importe;
		monedas100 = ((int)(cambio / 100));
		monedas50 = ((int) (cambio % 100) / 50);
		monedas25 = ((int) (cambio % 50) / 25);
		monedas5 = ((int) (cambio % 25) / 5);
		monedas1 = ((int) (cambio % 5) / 1);
		
		System.out.println("El cambio será: " + monedas100 + " monedas de 100, "
							+ monedas50 + " monedas de 50, " + monedas25 +" monedas de 25, "
							+ monedas5 + " monedas de 5, " + monedas1 + " monedas de 1.");
	}

}
