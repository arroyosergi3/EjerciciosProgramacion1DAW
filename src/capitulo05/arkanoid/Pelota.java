package capitulo05.arkanoid;

public class Pelota {
	
	private int x;
	private int y;
	
	
	
	public Pelota() {
		
	}
	
	
	public void setx(int newX) {
		x = newX ;
	}
	
	public int getx() {
		return x;
	}
	
	public void sety(int newY) {
		y = newY ;
	}
	
	public int gety() {
		return y;
	}
	
	public String toString() {
		return "("+x + "," + y + ")";
	}
	
	
	
	
	
	
	
	
	
	
	

}
