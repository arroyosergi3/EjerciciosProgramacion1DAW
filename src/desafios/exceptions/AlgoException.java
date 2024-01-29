package desafios.exceptions;

public class AlgoException extends Exception {

//	La clase que termina en "Exception" tiene que extender de "Exception", y solo lleva metodos
//	constructores (Pasando mensaje)
	
	
	public AlgoException(String s) {
		super(s);
	}
	
}
