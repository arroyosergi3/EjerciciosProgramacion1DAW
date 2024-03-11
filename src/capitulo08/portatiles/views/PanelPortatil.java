package capitulo08.portatiles.views;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;


import capitulo08.centroEducativo.vista.PanelCurso;

import capitulo08.portatiles.controllers.ConnectionManager;
import capitulo08.portatiles.controllers.ControladorMarca;
import capitulo08.portatiles.controllers.ControladorPortatil;
import capitulo08.portatiles.entities.Marca;
import capitulo08.portatiles.entities.Portatil;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class PanelPortatil extends JPanel {
	
	static PanelPortatil instance = null;

	public static PanelPortatil getInstance() {
		if (instance == null) {
			instance = new PanelPortatil();
		}
		return instance;
	}

	private static final long serialVersionUID = 1L;
	private JTextField jtfId;
	private JTextField jtfModelo;
	private JTextField jtfSerialNumber;
	private JTextField jtfFechaVenta;
	private final ButtonGroup btgrProcesadores = new ButtonGroup();
	private JComboBox<Marca> jcbMarca;
	JCheckBox chkbxVendido;
	JRadioButton rdbt1Procesador;
	JRadioButton rdbt2Procesadores;
	JRadioButton rdbt3Procesadores;
	JRadioButton rdbt4Procesadores;
	
	

	/**
	 * Create the panel.
	 */
	public PanelPortatil() {
		setLayout(new BorderLayout(0, 0));

		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);

		JButton btnPrimero = new JButton("");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarPrimero();
			}
		});
		btnPrimero.setIcon(
				new ImageIcon(PanelPortatil.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/gotostart.png")));
		toolBar.add(btnPrimero);

		JButton btnAnterior = new JButton("");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarAnterior();
			}
		});
		btnAnterior.setIcon(
				new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/previous.png")));
		toolBar.add(btnAnterior);

		JButton btnSiguiente = new JButton("");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarSiguiente();
			}
		});
		btnSiguiente
				.setIcon(new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/next.png")));
		toolBar.add(btnSiguiente);

		JButton btnUltimo = new JButton("");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarUltimo();
			}
		});
		btnUltimo.setIcon(
				new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/gotoend.png")));
		toolBar.add(btnUltimo);

		JButton btnNuevo = new JButton("");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevo();
			}
		});
		btnNuevo.setIcon(
				new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/nuevo.png")));
		toolBar.add(btnNuevo);

		JButton btnGuardar = new JButton("");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnGuardar.setIcon(
				new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/guardar.png")));
		toolBar.add(btnGuardar);

		JButton btnDel = new JButton("");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			}
		});
		btnDel.setIcon(
				new ImageIcon(PanelCurso.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/eliminar.png")));
		toolBar.add(btnDel);

		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel = new JLabel("Gestión de Ordenadores Portátiles");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("ID:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.gridwidth = 2;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		panel.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Marca:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		jcbMarca = new JComboBox<Marca>();
		GridBagConstraints gbc_jcbMarca = new GridBagConstraints();
		gbc_jcbMarca.insets = new Insets(0, 0, 5, 5);
		gbc_jcbMarca.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbMarca.gridx = 1;
		gbc_jcbMarca.gridy = 2;
		panel.add(jcbMarca, gbc_jcbMarca);

		JButton btnVerMarca = new JButton("Ver Marca");
		GridBagConstraints gbc_btnVerMarca = new GridBagConstraints();
		gbc_btnVerMarca.insets = new Insets(0, 0, 5, 0);
		gbc_btnVerMarca.gridx = 2;
		gbc_btnVerMarca.gridy = 2;
		panel.add(btnVerMarca, gbc_btnVerMarca);

		JLabel lblNewLabel_3 = new JLabel("Modelo:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);

		jtfModelo = new JTextField();
		GridBagConstraints gbc_jtfModelo = new GridBagConstraints();
		gbc_jtfModelo.gridwidth = 2;
		gbc_jtfModelo.insets = new Insets(0, 0, 5, 0);
		gbc_jtfModelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfModelo.gridx = 1;
		gbc_jtfModelo.gridy = 3;
		panel.add(jtfModelo, gbc_jtfModelo);
		jtfModelo.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Serial Number:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);

		jtfSerialNumber = new JTextField();
		GridBagConstraints gbc_jtfSerialNumber = new GridBagConstraints();
		gbc_jtfSerialNumber.insets = new Insets(0, 0, 5, 0);
		gbc_jtfSerialNumber.gridwidth = 2;
		gbc_jtfSerialNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfSerialNumber.gridx = 1;
		gbc_jtfSerialNumber.gridy = 4;
		panel.add(jtfSerialNumber, gbc_jtfSerialNumber);
		jtfSerialNumber.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Numero de Procesadores:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.gridheight = 2;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);

		 rdbt1Procesador = new JRadioButton("1 Procesador");
		btgrProcesadores.add(rdbt1Procesador);
		GridBagConstraints gbc_rdbt1Procesador = new GridBagConstraints();
		gbc_rdbt1Procesador.insets = new Insets(0, 0, 5, 5);
		gbc_rdbt1Procesador.gridx = 1;
		gbc_rdbt1Procesador.gridy = 5;
		panel.add(rdbt1Procesador, gbc_rdbt1Procesador);

		 rdbt2Procesadores = new JRadioButton("2 Procesadores");
		btgrProcesadores.add(rdbt2Procesadores);
		GridBagConstraints gbc_rdbt2Procesadores = new GridBagConstraints();
		gbc_rdbt2Procesadores.insets = new Insets(0, 0, 5, 0);
		gbc_rdbt2Procesadores.gridx = 2;
		gbc_rdbt2Procesadores.gridy = 5;
		panel.add(rdbt2Procesadores, gbc_rdbt2Procesadores);

		 rdbt3Procesadores = new JRadioButton("3 Procesadores");
		btgrProcesadores.add(rdbt3Procesadores);
		GridBagConstraints gbc_rdbt3Procesadores = new GridBagConstraints();
		gbc_rdbt3Procesadores.insets = new Insets(0, 0, 5, 5);
		gbc_rdbt3Procesadores.gridx = 1;
		gbc_rdbt3Procesadores.gridy = 6;
		panel.add(rdbt3Procesadores, gbc_rdbt3Procesadores);

		 rdbt4Procesadores = new JRadioButton("4 Procesadores");
		btgrProcesadores.add(rdbt4Procesadores);
		GridBagConstraints gbc_rdbt4Procesadores = new GridBagConstraints();
		gbc_rdbt4Procesadores.insets = new Insets(0, 0, 5, 0);
		gbc_rdbt4Procesadores.gridx = 2;
		gbc_rdbt4Procesadores.gridy = 6;
		panel.add(rdbt4Procesadores, gbc_rdbt4Procesadores);

		JLabel lblNewLabel_6 = new JLabel("Vendido:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 7;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);

		 chkbxVendido = new JCheckBox("");
		GridBagConstraints gbc_chkbxVendido = new GridBagConstraints();
		gbc_chkbxVendido.insets = new Insets(0, 0, 5, 5);
		gbc_chkbxVendido.gridx = 1;
		gbc_chkbxVendido.gridy = 7;
		panel.add(chkbxVendido, gbc_chkbxVendido);

		JLabel lblNewLabel_7 = new JLabel("Fecha de Venta:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 8;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);

		jtfFechaVenta = new JTextField();
		GridBagConstraints gbc_jtfFechaVenta = new GridBagConstraints();
		gbc_jtfFechaVenta.insets = new Insets(0, 0, 5, 5);
		gbc_jtfFechaVenta.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFechaVenta.gridx = 1;
		gbc_jtfFechaVenta.gridy = 8;
		panel.add(jtfFechaVenta, gbc_jtfFechaVenta);
		jtfFechaVenta.setColumns(10);

		JButton btnTotal = new JButton("Numero Total de Portatiles");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numeroDePortatiles();
			}
		});
		GridBagConstraints gbc_btnTotal = new GridBagConstraints();
		gbc_btnTotal.insets = new Insets(0, 0, 0, 5);
		gbc_btnTotal.gridx = 1;
		gbc_btnTotal.gridy = 9;
		panel.add(btnTotal, gbc_btnTotal);
		cargarTodasMarcas();
		cargarPrimero();

	}

	private void guardar() {

		try {
			Portatil o = new Portatil();
			o.setId(-1);
			if (!this.jtfId.getText().trim().equals("")) {
				o.setId(Integer.parseInt(this.jtfId.getText()));
			}
			o.setModelo(this.jtfModelo.getText());
			o.setSn(this.jtfSerialNumber.getText());
			o.setVendido(this.chkbxVendido.isSelected());
			o.setnProc(numeroProcesadores());
			if(this.chkbxVendido.isSelected()) {
				o.setFechaVenta(this.jtfFechaVenta.getText());
			}
			else {
				o.setFechaVenta(null);
			}
			
			o.setIdMarca(ControladorMarca.getidMarca((Marca)this.jcbMarca.getSelectedItem()));
			
			Connection conn = ConnectionManager.getConexion();
			if (o.getId() == -1) {
				int nuevoId = ControladorPortatil.insercion(o, conn);
				jtfId.setText("" + nuevoId);
			}

			else {
				ControladorPortatil.modificacion(o, conn);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	private void cargarPrimero() {
		Portatil o = ControladorPortatil.getPrimero();
		cargaCursoEnPantalla(o);
	}
	
	private void cargarAnterior() {
		Portatil o = ControladorPortatil.getFabricanteSiguienteAnterior((Integer.parseInt(jtfId.getText())-1));
		cargaCursoEnPantalla(o);
	}
	private void cargarSiguiente(){
		Portatil o = ControladorPortatil.getFabricanteSiguienteAnterior((Integer.parseInt(jtfId.getText())+1));
		cargaCursoEnPantalla(o);
	}
	
	private void cargarUltimo() {
		Portatil o = ControladorPortatil.getUltimo();
		cargaCursoEnPantalla(o);
				
	}
	
	

	private void eliminar() {
		try {
			String respuestas[] = new String[] { "Sí", "No" };
			int opcionElegida = JOptionPane.showOptionDialog(null, "¿Realmente desea eliminar el registro?",
					"Eliminación de Curso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, respuestas,
					respuestas[1]);

			if (opcionElegida == 0) {
				if (!this.jtfId.getText().trim().equals("")) {
					int id = Integer.parseInt(this.jtfId.getText());
					ControladorPortatil.eliminacion(id, ConnectionManager.getConexion());

					Portatil cursoAMostrar = ControladorPortatil.getFabricanteSiguienteAnterior((id - 1));
					if (cursoAMostrar != null) {
						cargaCursoEnPantalla(cursoAMostrar);
					} else {
						cursoAMostrar = ControladorPortatil.getFabricanteSiguienteAnterior((id + 1));
						if (cursoAMostrar != null) {
							cargaCursoEnPantalla(cursoAMostrar);
						} else {
							nuevo();
						}
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private void cargaCursoEnPantalla(Portatil o) {
		if (o != null) {
			Marca m = ControladorMarca.seleccionarItemJComboBox(o.getIdMarca());
			if (o != null) {
				jtfId.setText("" + o.getId());
				jtfModelo.setText("" + o.getModelo());
				jtfSerialNumber.setText("" + o.getSn());
				chkbxVendido.setSelected(o.isVendido());
				if (chkbxVendido.isSelected()) {
					jtfFechaVenta.setEnabled(true);
					jtfFechaVenta.setText("" + o.getFechaVenta());
				}
				else {
					jtfFechaVenta.setEnabled(false);
					jtfFechaVenta.setText("");
				}
				seleccionBoton(o.getnProc());
				jcbMarca.setSelectedItem(m);
				
		}
		
			
			
		}

	}

	private void nuevo() {
		jtfId.setText("");
		jtfModelo.setText("");
		jtfSerialNumber.setText("");
		jtfFechaVenta.setText("");

	}

	private void cargarTodasMarcas() {
		List<Marca> l = ControladorMarca.getTodos();
		for (Marca o : l) {
			jcbMarca.addItem(o);
		}

	}
	
	
	
	private void seleccionBoton(int n) {
		if(n == 1) {
			rdbt1Procesador.setSelected(true);
		}
		if(n == 2) {
			rdbt2Procesadores.setSelected(true);
		}
		if(n ==3) {
			rdbt3Procesadores.setSelected(true);
		}
		if(n == 4) {
			rdbt4Procesadores.setSelected(true);
		}
		
		
	}
	
	public void numeroDePortatiles() {
		JOptionPane.showMessageDialog(null, "Total de portátiles: " + ControladorPortatil.getNuemroPortatiles());
	}
	
	public int numeroProcesadores() {
		if(rdbt1Procesador.isSelected()) {
			return 1;
		}
		if(rdbt2Procesadores.isSelected()) {
			return 2;
		}
		if(rdbt3Procesadores.isSelected()) {
			return 3;
		}
		if(rdbt4Procesadores.isSelected()) {
			return 4;
		}
		return 5;
	}
	
	

}
