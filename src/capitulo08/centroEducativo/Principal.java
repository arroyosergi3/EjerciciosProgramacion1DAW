package capitulo08.centroEducativo;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import capitulo08.centroEducativo.vista.Menu;
import capitulo08.centroEducativo.vista.PanelCurso;
import capitulo08.centroEducativo.vista.PanelEstudiante;
import capitulo08.centroEducativo.vista.PanelMateria;
import capitulo08.centroEducativo.vista.PanelProfesor;

public class Principal extends JFrame{

	static Principal instance = null;

	public static Principal getInstance() {
		if (instance == null) {
			instance = new Principal();
		}
		return instance;
	}
	
	JTabbedPane panelTabbed;
	PanelCurso panelCurso;
	PanelMateria panelMateria;
	PanelEstudiante panelEstudiante;
	PanelProfesor panelProfesor;
	
	public PanelCurso getPanelCurso() {
		return panelCurso;
	}





	public void setPanelCurso(PanelCurso panelCurso) {
		this.panelCurso = panelCurso;
	}





	public PanelMateria getPanelMateria() {
		return panelMateria;
	}





	public void setPanelMateria(PanelMateria panelMateria) {
		this.panelMateria = panelMateria;
	}





	public PanelEstudiante getPanelEstudiante() {
		return panelEstudiante;
	}





	public void setPanelEstudiante(PanelEstudiante panelEstudiante) {
		this.panelEstudiante = panelEstudiante;
	}





	public PanelProfesor getPanelProfesor() {
		return panelProfesor;
	}





	public void setPanelProfesor(PanelProfesor panelProfesor) {
		this.panelProfesor = panelProfesor;
	}





	public void setPanelTabbed(JTabbedPane panelTabbed) {
		this.panelTabbed = panelTabbed;
	}





	public Principal() {
		super("Gestion de centro Educativo");
		this.setBounds(0,0,800,600);
		panelTabbed = new JTabbedPane();
		
		 panelCurso = new PanelCurso();
		 panelMateria = new PanelMateria();
		 panelEstudiante = new PanelEstudiante();
		 panelProfesor = new PanelProfesor();
		Menu menu = new Menu();
		
		panelTabbed.addTab("Cursos", panelCurso);
		panelTabbed.addTab("Materias", panelMateria);
		panelTabbed.addTab("Estudiantes", panelEstudiante);
		panelTabbed.addTab("Profesores", panelProfesor);
		
		this.setJMenuBar(menu);
		
		panelTabbed.setSelectedIndex(0);
		
		this.getContentPane().add(panelTabbed);
		
	}
	
	
	
	
	
	public JTabbedPane getPanelTabbed() {
		return panelTabbed;
	}





	public static void main(String[] args) {

		Principal.getInstance().setVisible(true);
		
	}

}
