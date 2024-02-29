package gestionFabricanteGrafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import capitulo08.bloque01.crud.Fabricante;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Grafica1 extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField jtfId;
	public JTextField jtfCif;
	public JTextField jtfNombre;

	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafica1 frame = new Grafica1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Grafica1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{1.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblGestinDelFabricante = new JLabel("Gestión del Fabricante");
		lblGestinDelFabricante.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_lblGestinDelFabricante = new GridBagConstraints();
		gbc_lblGestinDelFabricante.insets = new Insets(0, 0, 5, 0);
		gbc_lblGestinDelFabricante.gridwidth = 2;
		gbc_lblGestinDelFabricante.gridx = 0;
		gbc_lblGestinDelFabricante.gridy = 0;
		contentPane.add(lblGestinDelFabricante, gbc_lblGestinDelFabricante);
		
		JLabel lblId = new JLabel("ID:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 1;
		contentPane.add(lblId, gbc_lblId);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.weightx = 1.0;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		contentPane.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblCif = new JLabel("CIF:");
		GridBagConstraints gbc_lblCif = new GridBagConstraints();
		gbc_lblCif.insets = new Insets(0, 0, 5, 5);
		gbc_lblCif.anchor = GridBagConstraints.EAST;
		gbc_lblCif.gridx = 0;
		gbc_lblCif.gridy = 2;
		contentPane.add(lblCif, gbc_lblCif);
		
		jtfCif = new JTextField();
		GridBagConstraints gbc_jtfCif = new GridBagConstraints();
		gbc_jtfCif.insets = new Insets(0, 0, 5, 0);
		gbc_jtfCif.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCif.gridx = 1;
		gbc_jtfCif.gridy = 2;
		contentPane.add(jtfCif, gbc_jtfCif);
		jtfCif.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 3;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 3;
		contentPane.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		contentPane.add(panel, gbc_panel);
		
		JButton btnInicio = new JButton("");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = new ConnectionManager().getConexion();
					Fabricante f = GestionFabricante.getPrimero(conn);
					
					jtfId.setText("" + f.getId());
					jtfCif.setText(""+f.getCif());
					jtfNombre.setText(""+f.getNombre());
					
					} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnInicio.setIcon(new ImageIcon(Grafica1.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/gotostart.png")));
		panel.add(btnInicio);
		
		JButton btnAtras = new JButton("");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection conn;
				
				try {
					conn = new ConnectionManager().getConexion();
					int idActual = Integer.parseInt(jtfId.getText()) - 1;
					Fabricante f = GestionFabricante.getFabricanteSiguienteAnterior(conn, idActual);
					cargaFabricanteEnPantalla(f);
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnAtras.setIcon(new ImageIcon(Grafica1.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/previous.png")));
		panel.add(btnAtras);
		
		JButton btnAlante = new JButton("");
		btnAlante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn;
				
				try {
					conn = new ConnectionManager().getConexion();
					int idActual = Integer.parseInt(jtfId.getText()) + 1;
					Fabricante f = GestionFabricante.getFabricanteSiguienteAnterior(conn, idActual);
					cargaFabricanteEnPantalla(f);
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnAlante.setIcon(new ImageIcon(Grafica1.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/next.png")));
		panel.add(btnAlante);
		
		JButton btnFin = new JButton("");
		btnFin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = new ConnectionManager().getConexion();
					Fabricante f = GestionFabricante.getUltimo(conn);
					

					jtfId.setText("" + f.getId());
					jtfCif.setText(""+f.getCif());
					jtfNombre.setText(""+f.getNombre());
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnFin.setIcon(new ImageIcon(Grafica1.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/gotoend.png")));
		panel.add(btnFin);
		
		JButton btnNuevo = new JButton("");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevo();
			}
		});
		
		
		
		
		btnNuevo.setIcon(new ImageIcon(Grafica1.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/nuevo.png")));
		panel.add(btnNuevo);
		
		JButton btnSave = new JButton("");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnSave.setIcon(new ImageIcon(Grafica1.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/guardar.png")));
		panel.add(btnSave);
		
		JButton btnDel = new JButton("");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
				
				
				
				
			}
		});
		btnDel.setIcon(new ImageIcon(Grafica1.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/eliminar.png")));
		panel.add(btnDel);
	}
	
	private void cargaFabricanteEnPantalla(Fabricante f) {
		if( f != null) {
			jtfId.setText("" + f.getId());
			jtfCif.setText(""+f.getCif());
			jtfNombre.setText(""+f.getNombre());
		}

	}
	
	private void nuevo() {
		jtfId.setText("");
		jtfCif.setText("");
		jtfNombre.setText("");
	}
	
	private void guardar() {
		
		
		
		try {
			Fabricante f = new Fabricante();
			f.setId(-1);
			if(!this.jtfId.getText().trim().equals("")){
				f.setId(Integer.parseInt(this.jtfId.getText()));
			}
			f.setCif(this.jtfCif.getText());
			f.setNombre(this.jtfNombre.getText());
			
			
			Connection conn = ConnectionManager.getConexion();
			if(f.getId() == -1) {
				int nuevoId = GestionFabricante.insercion(f, conn);
				jtfId.setText(""+nuevoId);
			}
			
			else {
				GestionFabricante.modificacion(f, conn);
				
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	
	private void eliminar () {
		try {
			String respuestas[] = new String[] {"Sí", "No"};
			int opcionElegida = JOptionPane.showOptionDialog(
					null, 
					"¿Realmente desea eliminar el registro?", 
					"Eliminación de fabricante", 
			        JOptionPane.DEFAULT_OPTION, 
			        JOptionPane.WARNING_MESSAGE, 
			        null, respuestas, 
			        respuestas[1]);
		    
			if(opcionElegida == 0) {
		      if (!this.jtfId.getText().trim().equals("")) {
		    	  int id = Integer.parseInt(this.jtfId.getText());
		    	  Connection conn = ConnectionManager.getConexion();
		    	  GestionFabricante.eliminacion(id, ConnectionManager.getConexion());
		    	  
		    	  
		    	  Fabricante fabriAMostrar = GestionFabricante.getFabricanteSiguienteAnterior(conn, (id - 1));
		    	  if(fabriAMostrar != null) {
		    		  cargaFabricanteEnPantalla(fabriAMostrar);
		    	  }
		    	  else {
		    		  fabriAMostrar = GestionFabricante.getFabricanteSiguienteAnterior(conn, (id + 1));
		    		  if (fabriAMostrar != null) {
						cargaFabricanteEnPantalla(fabriAMostrar);
					} else {
						nuevo();
					}
		    	  }
		      }
		    }			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	
	

}
