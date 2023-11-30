package capitulo05.invasionTierra;

public class CampoBatalla {

	private String nombre;
	private humano[] humanos = new humano[20];
	private malvado[] malvados = new malvado[20];

	public void muestraEstadoActual(){
		for (int i = 0; i < humanos.length; i++) {
			System.out.print(humanos[i] + " -  " );
		}
		System.out.println();

		for (int i = 0; i < malvados.length; i++) {
			System.out.print(malvados[i] + " -  " );
		}
		System.out.println();
	}
	
	
	public CampoBatalla() {
		//inicializo el array de humanos y de malvados
		for (int i = 0; i < humanos.length; i++) {
			humanos[i] = new humano();
			humanos[i].setNombre("Humano - " + i);

			malvados[i] = new malvado();
			malvados[i].setNombre("Malvado - " + i) ;

		}
		//al ultimo humano y malvado le duplico la vida
		//humanos[humanos.length -1].setPuntosVida(humanos[humanos.length - 1].getPuntosVida() * 2);
		malvados[malvados.length - 1].setPuntosVida(malvados[malvados.length -1].getPuntosVida() * 2);
		humano ultimoHumano = humanos[humanos.length-1];
		ultimoHumano.setPuntosVida(ultimoHumano.getPuntosVida() * 2);
		malvado ultimoMalvado = malvados[malvados.length -1 ];
		ultimoMalvado.setPuntosVida(ultimoMalvado.getPuntosVida() * 2);
		
		
		//mezclo los humanos
		mezclaHumanos();
		mezclaMalvados();
		
		
		//comienza la batalla
		humano primerHumanoVivo = getPrimerHumanoVivo();
		if(primerHumanoVivo != null){ //existe al menos 1 humano vivo
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void mezclaHumanos ()
	{
		for (int i = 0; i < humanos.length; i++) {
			int indiceAzar1 = utils.utils.obtenerNumeroAzar(0, humanos.length-1);
			int indiceAzar2 = utils.utils.obtenerNumeroAzar(0, humanos.length-1);
			humano aux = humanos[indiceAzar1];
			humanos[indiceAzar1] = humanos[indiceAzar2];
			humanos[indiceAzar2] = aux;
		}
	}
	
	public void mezclaMalvados ()
	{
		for (int i = 0; i < humanos.length; i++) {
			int indiceAzar1 = utils.utils.obtenerNumeroAzar(0, malvados.length-1);
			int indiceAzar2 = utils.utils.obtenerNumeroAzar(0, malvados.length-1);
			malvado aux = malvados[indiceAzar1];
			malvados[indiceAzar1] = malvados[indiceAzar2];
			malvados[indiceAzar2] = aux;
		}
	}
	
	
	public humano getPrimerHumanoVivo() {
		for (int i = 0; i < humanos.length; i++) {
			if(humanos[i].isVivo()) {
				return humanos[i];
			}
			
		}
		
		return null;
	}
	
	public malvado getPrimerMalvadoVivo() {
		for (int i = 0; i < malvados.length; i++) {
			if(malvados[i].isVivo()) {
				return malvados[i];
			}
			
		}
		
		return null;
	}
	
	public humano getHumanoMasDificil() {
		humano dificil = humanos[0];
		for (int i = 0; i < humanos.length; i++) {
			if(humanos[i].getDisparosRecibidos() > dificil.getDisparosRecibidos() && humanos[i].isVivo()== false) {
				dificil = humanos[i]  ;
			}
		}
		return dificil;
	}
	public humano getHumanoMasFacil() {
		humano facil = humanos[0];
		for (int i = 0; i < humanos.length; i++) {
			if(humanos[i].getDisparosRecibidos() < facil.getDisparosRecibidos()&& humanos[i].isVivo() == false) {
				facil = humanos[i]  ;
			}
		}
		return facil;
	}
	
	public malvado getMalvadoMasDificil() {
		malvado dificil = malvados[0];
		for (int i = 0; i < malvados.length; i++) {
			if(malvados[i].getDisparosRecibidos() > dificil.getDisparosRecibidos()&& malvados[i].isVivo() == false) {
				dificil = malvados[i]  ;
			}
		}
		return dificil;
	}
	
	public malvado getMalvadoMasFacil() {
		malvado facil = malvados[0];
		for (int i = 0; i < malvados.length; i++) {
			if(malvados[i].getDisparosRecibidos() < facil.getDisparosRecibidos() && malvados[i].isVivo() == false) {
				facil = malvados[i]  ;
			}
		}
		return facil;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
