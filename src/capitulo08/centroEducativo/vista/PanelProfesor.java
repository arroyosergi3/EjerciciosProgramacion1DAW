package capitulo08.centroEducativo.vista;

import javax.swing.JPanel;

import capitulo08.centroEducativo.entidades.Profesor;

import java.awt.BorderLayout;

public class PanelProfesor extends JPanel {

	private static final long serialVersionUID = 1L;
	private PanelDatosPersonales panelDatos = new PanelDatosPersonales();

	/**
	 * Create the panel.
	 */
	public PanelProfesor() {
		setLayout(new BorderLayout(0, 0));
		this.add(panelDatos, BorderLayout.CENTER);
		
		this.panelDatos.setRunnableMostrarPrimerRegistro(
				new Runnable() {					
					@Override
					public void run() {
						mostrarPrimero();
					}
				});		
	}

	
	private void mostrarPrimero() {
		// En teoría aquí se produce una llamada a un controlador de estudiante
		// que obtiene un objeto de tipo estudiante y que lo envía para ser
		// mostrado
		Profesor mockEstudiante = new Profesor();
		mockEstudiante.setId(1);
		mockEstudiante.setNombre("Rafa");
		mostrarEntidad(mockEstudiante);		
	}
	
	
	private void mostrarEntidad(Profesor e) {
		this.panelDatos.setId(e.getId());
	}
	
}






