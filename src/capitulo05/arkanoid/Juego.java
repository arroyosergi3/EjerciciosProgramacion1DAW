package capitulo05.arkanoid;

public class Juego {
	private ladrillo pared [] = new ladrillo[20];
	private Pelota pelota = new Pelota();
	private int numero1 = 0;
	public ladrillo primero;
	public ladrillo ultimo;
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
				if(pelota.getx() > pared[i].getXLadrillo() && pelota.getx() < (pared[i].getXLadrillo()+pared[i].getAnchoLadrillo()) && pelota.gety() > pared[i].getYLadrillo() && pelota.gety() < (pared[i].getYLadrillo() + pared[i].getAltoLadrillo())) {
					if(pared[i].getPuntosVida() > 0) {
						pared[i].setPuntosVida(pared[i].getPuntosVida() - 1);
						if(numero1 == 0 && pared[i].getPuntosVida() == 0) {
							primero = pared[i];
							numero1++;
						}
					}
					
				}
				if(pared[i].getPuntosVida() > 0) {
					hayLadrillos = true;
					pared[i].toString();
				}
				
				if (hayLadrillos == false){
					ultimo = pared[i]; 
				}
				
				}
			
			
			
			
			
		}while(hayLadrillos);
		
		
		
		
		
		
		
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
