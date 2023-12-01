package capitulo05.arkanoid;

public class ladrillo {
	private String color;
	private int x;
	private int y;
	private int ancho = 100;
	private int alto = 50;
	private int puntosVida;
	
	
	
	public ladrillo () {
		x = utils.utils.obtenerNumeroAzar(0, 800);
		y = utils.utils.obtenerNumeroAzar(0, 500);
		puntosVida = utils.utils.obtenerNumeroAzar(1, 3);
		asignarColor();
		}
	
	private void asignarColor() {
		String colores [] = new String[] {"rojo", "verde", "azul"};
		
		if(puntosVida == 1) {
			
			color = colores[utils.utils.obtenerNumeroAzar(0, 2)];
		}
		else if(puntosVida == 2) {
			color ="plateado";
		}
		else color = "dorado";
	}
	
	public int getXLadrillo(){
		return x;
	}
	
	public void setXLadrillo(int newX) {
		x = newX;
	}
	
	public int getYLadrillo() {
		return y;
	}
	
	public void setYLadrillo(int newY) {
		y = newY;
	}
	
	public int getPuntosVida() {
		return puntosVida;
	}
	
	public void setPuntosVida(int newPuntosVida) {
		puntosVida = newPuntosVida;
	}
	
	public void setAnchoLadrillo(int newAncho) {
		ancho = newAncho;
	}
	
	public int getAnchoLadrillo() {
		return ancho;
	}
	
	public void setAltoLadrillo(int newAlto) {
		ancho = newAlto;
	}
	
	public int getAltoLadrillo() {
		return alto;
	}

	
	public String toString() {
		return "ladrillo [color=" + color + ", x=" + x + ", y=" + y 
				+ ", puntosVida=" + puntosVida + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
