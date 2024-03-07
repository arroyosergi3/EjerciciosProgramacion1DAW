package capitulo08.centroEducativo.vista;

import javax.swing.JPanel;

import capitulo08.centroEducativo.controladores.ControladorEstudiantes;
import capitulo08.centroEducativo.entidades.Estudiante;

import java.awt.BorderLayout;

public class PanelEstudiante extends JPanel {

	private static final long serialVersionUID = 1L;
	private PanelDatosPersonales panelDatos = new PanelDatosPersonales();

	/**
	 * Create the panel.
	 */
	public PanelEstudiante() {
		setLayout(new BorderLayout(0, 0));
		this.add(panelDatos, BorderLayout.CENTER);

		this.panelDatos.setRunnableMostrarPrimerRegistro(new Runnable() {
			@Override
			public void run() {
				mostrarPrimero();
			}
		});

		this.panelDatos.setRunnableMostrarAnteriorRegistro(new Runnable() {

			@Override
			public void run() {
				mostrarAnterior();

			}
		});

		this.panelDatos.setRunnableMostrarSiguienteRegistro(new Runnable() {

			@Override
			public void run() {
				mostrarSiguiente();

			}
		});

		this.panelDatos.setRunnableMostrarUltimoRegistro(new Runnable() {
			
			@Override
			public void run() {
				mostrarUltimo();
				
			}
		});

		this.panelDatos.setRunnableMostrarAnteriorRegistro(new Runnable() {

			@Override
			public void run() {
				mostrarAnterior();

			}
		});

	}

	private void mostrarPrimero() {
		// En teoría aquí se produce una llamada a un controlador de estudiante
		// que obtiene un objeto de tipo estudiante y que lo envía para ser
		// mostrado
		Estudiante mockEstudiante = new Estudiante();
		mockEstudiante = ControladorEstudiantes.getPrimero();
		mostrarEntidad(mockEstudiante);
	}

	private void mostrarAnterior() {

		Estudiante mockEstudiante = new Estudiante();
		mockEstudiante = ControladorEstudiantes.getFabricanteSiguienteAnterior(panelDatos.getId() - 1);
		mostrarEntidad(mockEstudiante);

	}

	private void mostrarSiguiente() {

		Estudiante mockEstudiante = new Estudiante();
		mockEstudiante = ControladorEstudiantes.getFabricanteSiguienteAnterior(panelDatos.getId() + 1);
		mostrarEntidad(mockEstudiante);

	}

	private void mostrarUltimo() {
		Estudiante mockEstudiante = new Estudiante();
		mockEstudiante = ControladorEstudiantes.getUltimo();
		mostrarEntidad(mockEstudiante);
	}

	private void mostrarEntidad(Estudiante e) {
		this.panelDatos.setId(e.getId());
		this.panelDatos.setNombre(e.getNombre());
		
		//ME QUEDO POR AQUI
	}

}
