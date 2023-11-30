package capitulo05.invasionTierra;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CampoBatalla campo = new CampoBatalla();
		campo.mezclaHumanos();
		campo.mezclaMalvados();
		campo.muestraEstadoActual();
		do {
			
			if(campo.getPrimerHumanoVivo() !=null) {
				campo.getPrimerMalvadoVivo().recibirDisparo();
				
				
			}
			
			if(campo.getPrimerHumanoVivo()!=null) {
				campo.getPrimerHumanoVivo().recibirDisparo();
			}
			
			System.out.println();
			
			campo.muestraEstadoActual();
			//sc.nextLine();
			
			
			
			
			
			
			
		}while(campo.getPrimerMalvadoVivo() != null && campo.getPrimerHumanoVivo()!=null);
		
		
		
		if(campo.getPrimerHumanoVivo()!=null) {
			System.out.println("HAN GANADO LOS HUMANOS");
		}
		else {
			if(campo.getPrimerMalvadoVivo() != null) {
				System.out.println("HAN GANADO LOS MALVADOS");
			}
			else System.out.println("HAN QUEDADO EMPATE");
		}
		
		
		
		
		
		System.out.println("El humano más fácil ha sido: " + campo.getHumanoMasFacil());
		System.out.println("El humano más difícil ha sido: " + campo.getHumanoMasDificil());
		System.out.println("El malvado más fácil ha sido: " + campo.getMalvadoMasFacil());
		System.out.println("El malvado más difícil ha sido: " + campo.getMalvadoMasDificil());
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
