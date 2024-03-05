package capitulo08.centro;

import javax.swing.JFrame;

import capitulo08.centro.view.PanelPrincipal;

public class Principal extends JFrame {

	static Principal instance = null;

	public static Principal getInstance() {
		if (instance == null) {
			instance = new Principal();
		}
		return instance;
	}
	
	public Principal() {
		
		super("Gestion Centros");
		this.setBounds(0,0,800,600);
		
		PanelPrincipal panel = new PanelPrincipal();
		this.getContentPane().add(panel);
	}

	
	public static void main(String[] args) {
		Principal.getInstance().setVisible(true);
	}

}
