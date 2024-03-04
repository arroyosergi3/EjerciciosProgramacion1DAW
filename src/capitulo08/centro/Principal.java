package capitulo08.centro;


public class Principal {

	static Principal instance = null;

	public static Principal getInstance() {
		if (instance == null) {
			instance = new Principal();
		}
		return instance;
	}
	

	
	public static void main(String[] args) {

	}

}
