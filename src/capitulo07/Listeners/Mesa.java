package capitulo07.Listeners;

public class Mesa implements CalculadoraListener {

	
	
	
	
	@Override
	public void sumaOMultiplicacionSuperiorA1000(CalculadoraEvent e) {
		System.out.println("Soy una mesa y me han notificado sumaOMultiplicacionSuperiorA1000 con números: " + e.getNum1() + " y " + e.getNum2());
	}

	@Override
	public void resultadoNegativo(CalculadoraEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void divisorCero(CalculadoraEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void raizNegativa(CalculadoraEvent e) {
		// TODO Auto-generated method stub

	}

}
