package capitulo07.listeners;

public class SuperTipo implements CalculadoraListener {

	
	
	@Override
	public void sumaOMultiplicacionSuperiorA1000(CalculadoraEvent e) {
		System.out.println("El resultado recibido ha sido mayor a 1000 ");
	}
	
	

	@Override
	public void resultadoNegativo(CalculadoraEvent e) {
		System.out.println("El resultado recibido ha sido negativo ");		
	}

	@Override
	public void divisorCero(CalculadoraEvent e) {
		System.out.println("El divisor recibido ha sido 0 " );
		
	}

	@Override
	public void raizNegativa(CalculadoraEvent e) {
		System.out.println("La raíz recibida es negativa " );
		
	}
	
	
	
	
}
