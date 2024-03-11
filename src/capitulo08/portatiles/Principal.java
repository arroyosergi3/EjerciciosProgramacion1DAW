package capitulo08.portatiles;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import capitulo08.centroEducativo.vista.Menu;
import capitulo08.centroEducativo.vista.PanelCurso;
import capitulo08.centroEducativo.vista.PanelEstudiante;
import capitulo08.centroEducativo.vista.PanelMateria;
import capitulo08.centroEducativo.vista.PanelProfesor;
import capitulo08.portatiles.views.PanelPortatil;

public class Principal extends JFrame{

	static Principal instance = null;

	public static Principal getInstance() {
		if (instance == null) {
			instance = new Principal();
		}
		return instance;
	}
	

	

	public Principal() {
		super("Gestion de Portatiles");
		this.setBounds(0,0,800,600);
		
		PanelPortatil panel = new PanelPortatil();
		this.getContentPane().add(panel);
	}
	



	public static void main(String[] args) {

		Principal.getInstance().setVisible(true);
		
	}

}
