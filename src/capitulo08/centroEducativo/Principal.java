package capitulo08.centroEducativo;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

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
	
	
	public Principal() {
		super("Gestion de centro Educativo");
		this.setBounds(0,0,800,600);
		JTabbedPane panelTabbed = new JTabbedPane();
		
		PanelCurso panelCurso = new PanelCurso();
		PanelMateria panelMateria = new PanelMateria();
		PanelEstudiante panelEstudiante = new PanelEstudiante();
		PanelProfesor panelProfesor = new PanelProfesor();
		
		panelTabbed.addTab("Cursos", panelCurso);
		panelTabbed.addTab("Materias", panelMateria);
		panelTabbed.addTab("Estudiantes", panelEstudiante);
		panelTabbed.addTab("Profesores", panelProfesor);
		
		panelTabbed.setSelectedIndex(0);
		
		this.getContentPane().add(panelTabbed);
		
	}
	
	
	
	public static void main(String[] args) {

		Principal ventana = new Principal();
		ventana.setVisible(true);
	}

}
