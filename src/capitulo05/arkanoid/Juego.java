package capitulo05.arkanoid;

public class Juego {
	private ladrillo pared [] = new ladrillo[20];
	private ladrillo orden[] = new ladrillo[pared.length];
	private Pelota pelota = new Pelota();
	private int numero1 = 0;
	private int indice = 0;

//	private String juego ="Arkanoid";
//	private int idJuego = 0;
	
	public Juego() {
		for (int i = 0; i < pared.length; i++) {
			pared[i] = new ladrillo();
		}
	}
	
	public void ronda() {
		boolean hayLadrillos = true;
		
		do {
					
					hayLadrillos = false;
					pelota.setx(utils.utils.obtenerNumeroAzar(0, 800));
					pelota.sety(utils.utils.obtenerNumeroAzar(0, 500));
					
					
				for (int i = 0; i < pared.length; i++) {
					
					//Mostrar ladrillos si tienen vida
					if(pared[i].getPuntosVida() > 0) {
						hayLadrillos = true;
						System.out.println(pared[i].toString());

					}
						
					
					//Si le doy
										
					if(pelota.getx() > pared[i].getXLadrillo() && 
							pelota.getx() < (pared[i].getXLadrillo()+pared[i].getAnchoLadrillo()) &&
							pelota.gety() > pared[i].getYLadrillo() &&
							pelota.gety() < (pared[i].getYLadrillo() + pared[i].getAltoLadrillo())) {
							
						
							if(pared[i].getPuntosVida() > 0) {
								pared[i].setPuntosVida(pared[i].getPuntosVida() - 1);
								
								if(pared[i].getPuntosVida() == 0) {
									orden[indice] = pared[i];
									indice++;
									pared[i].setPuntosVida(-99); 
								}
								
								
							
		//						if(numero1 == 0 && pared[i].getPuntosVida() == 0) {
		//							primero = pared[i];
		//							numero1++;
		//						}
							}
							
				} //cierra if

						
			} // cierra for
				
				
				
			
			
			
			
		}while(hayLadrillos);
		

		ladrillo primero = new ladrillo();
		ladrillo ultimo = new ladrillo();
		
			System.out.println();
		for (int i = 0; i < orden.length; i++) {
			
				  primero = orden[0];
				  ultimo = orden[orden.length-1];
			
			System.out.println(orden[i]);
		}
		System.out.println();
		System.out.println("El primer ladrillo destruido ha sido " + primero.toString());
		System.out.println("El ultimo ladrillo destruido ha sido " + ultimo.toString());
	
			
		
		
		
		
		
	}
	
	public ladrillo[] getPared() {
		return pared;
	}
	
	public void setPared(ladrillo[] newPared) {
		pared = newPared;
	}
	
	public Pelota getPelota() {
		return pelota;
	}
	
	public void setPelota(Pelota newPelota) {
		pelota = newPelota;
	}
	
	
//	public String toString () {
//		return juego +" : " + idJuego;
//	}
//	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
