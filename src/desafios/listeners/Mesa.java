package desafios.listeners;

public class Mesa implements ProgramaLisListener{

	int patas;

	
	
	public Mesa(int patas) {
		super();
		this.patas = patas;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	@Override
	public void numeroMayorA500(ProgramaLisEvent e) {

		System.out.println("Soy una mesa y el numero es mayor a 500");
	}
	 
	
}
