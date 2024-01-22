package capitulo07.Listeners;

public interface CalculadoraListener {

	
	public void sumaOMultiplicacionSuperiorA1000(CalculadoraEvent e);
	
	public void resultadoNegativo(CalculadoraEvent e);
	
	public void divisorCero(CalculadoraEvent e);
	
	public void raizNegativa (CalculadoraEvent e);

	
}
