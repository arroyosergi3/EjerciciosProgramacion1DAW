package capitulo6.tresEnRaya;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TresEnRaya extends JPanel{
	
	JFrame ventana = new JFrame("Tres en Raya");
	
	private static final int JFRAME_WIDTH=700;
	private static final int JFRAME_HEIGHT=700;

	List<Cuadros> cuadros = new ArrayList<Cuadros>();
	
	private static TresEnRaya instance = null;
	
	
	public static int JUGADOR_1= 1;
	public static int JUGADOR_2= 2;
	private int turnoActual = JUGADOR_1;

	private int matrizJugadas[][] = new int[3][3];
	
	
	public TresEnRaya() {
		SoundRepository.getInstance();
		SpritesRepository.getInstance();
		JPanel panel = (JPanel) ventana.getContentPane();
		panel.setLayout(new BorderLayout());
		panel.add(this, BorderLayout.CENTER);
		
		
		ventana.setBounds(0,0,JFRAME_WIDTH, JFRAME_HEIGHT);
		
		inicializarCuadrosDelTablero();
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1) {
					for (Cuadros cuadro : cuadros) {
						if(cuadro.seHaHechoClicSobreCuadro(e.getX(), e.getY())) {
							cuadro.clic(turnoActual);
							if(turnoActual == JUGADOR_1) {
								turnoActual = JUGADOR_2;
								SoundRepository.getInstance().playSound(SoundRepository.EFECTO_J_1);
							}
							else {
								turnoActual = JUGADOR_1;
								SoundRepository.getInstance().playSound(SoundRepository.EFECTO_J_2);

							}
						}
					}
				}
			}
		});
		
		SoundRepository.getInstance().loopSound(SoundRepository.MUSICA_DE_FONDO);
		
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			cerrarAplicacion();
		}
		});		
		ventana.setVisible(true);
		
		this.requestFocus();
	}
	public static TresEnRaya getInstance() {
		if (instance == null) {
			instance = new TresEnRaya();
		}
		return instance;
	}
	
	private void inicializarCuadrosDelTablero() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.cuadros.add(new Cuadros(i,j));
			}
		}
	}
	
	public void cerrarAplicacion() {
		String [] opciones = {"Aceptar", "Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(ventana, "¿Desea cerrar la aplicación?", "Salir de la aplicación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if(eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		for (Cuadros cuadro : cuadros) {
			cuadro.paint(g);
		}
	}
	
	public static void main(String[] args) {
		TresEnRaya.getInstance();

	}
	public int[][] getMatrizJugadas() {
		return matrizJugadas;
	}
	public void setMatrizJugadas(int[][] matrizJugadas) {
		this.matrizJugadas = matrizJugadas;
	}

	
	
	
	
}
