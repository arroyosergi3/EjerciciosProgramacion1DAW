package capitulo08.idiomasQuerida;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import capitulo08.centroEducativo.vista.Menu;
import capitulo08.centroEducativo.vista.PanelCurso;
import capitulo08.centroEducativo.vista.PanelEstudiante;
import capitulo08.centroEducativo.vista.PanelMateria;
import capitulo08.centroEducativo.vista.PanelProfesor;
import capitulo08.idiomasQuerida.views.PanelAltaUsuarios;
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
		super("Gestion de Altas de Usuario");
		this.setBounds(0,0,800,600);
		
		PanelAltaUsuarios panel = new PanelAltaUsuarios() ;
		this.getContentPane().add(panel);
	}
	



	public static void main(String[] args) {

		Principal.getInstance().setVisible(true);
		
	}

}
