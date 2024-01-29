package desafios.listeners;

public class Perro implements ProgramaLisListener{

	String nombre;

	
	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void numeroMayorA500(ProgramaLisEvent e) {

		System.out.println("Soy un perro y guau guau");
	}
	 
}
