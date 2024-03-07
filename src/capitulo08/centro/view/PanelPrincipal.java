package capitulo08.centro.view;

import javax.swing.JPanel;

import capitulo08.centro.controllers.ConnectionManager;
import capitulo08.centro.controllers.ControladorCentro;
import capitulo08.centro.controllers.ControladorMateria;
import capitulo08.centro.controllers.ControladorNivel;
import capitulo08.centro.entities.CentroEducativo;
import capitulo08.centro.entities.Materia;
import capitulo08.centro.entities.Nivel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class PanelPrincipal extends JPanel {

	private JComboBox<CentroEducativo> jcbCentro;
	private JComboBox<Nivel> jcbNivel;
	private JComboBox<Materia> jcbMateria;

	private static final long serialVersionUID = 1L;
	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfCodigo;
	private JTextField jtfUrlClassroom;
	private JTextField jtfFecha;
	JCheckBox chkAdmiteMatricula;

	/**
	 * Create the panel.
	 */
	public PanelPrincipal() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblGestionDeMaterias = new JLabel("Gestion de Materias");
		GridBagConstraints gbc_lblGestionDeMaterias = new GridBagConstraints();
		gbc_lblGestionDeMaterias.insets = new Insets(0, 0, 5, 0);
		gbc_lblGestionDeMaterias.gridwidth = 3;
		gbc_lblGestionDeMaterias.gridx = 0;
		gbc_lblGestionDeMaterias.gridy = 0;
		panel.add(lblGestionDeMaterias, gbc_lblGestionDeMaterias);

		JLabel lblCentro = new JLabel("Centro:");
		GridBagConstraints gbc_lblCentro = new GridBagConstraints();
		gbc_lblCentro.anchor = GridBagConstraints.EAST;
		gbc_lblCentro.insets = new Insets(0, 0, 5, 5);
		gbc_lblCentro.gridx = 0;
		gbc_lblCentro.gridy = 1;
		panel.add(lblCentro, gbc_lblCentro);

		jcbCentro = new JComboBox();
		GridBagConstraints gbc_jcbCentro = new GridBagConstraints();
		gbc_jcbCentro.insets = new Insets(0, 0, 5, 5);
		gbc_jcbCentro.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbCentro.gridx = 1;
		gbc_jcbCentro.gridy = 1;
		panel.add(jcbCentro, gbc_jcbCentro);

		JButton btnNiveles = new JButton("Cargar Niveles");
		btnNiveles.setIcon(null);
		btnNiveles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarTodosNiveles();
			}
		});
		GridBagConstraints gbc_btnNiveles = new GridBagConstraints();
		gbc_btnNiveles.insets = new Insets(0, 0, 5, 0);
		gbc_btnNiveles.gridx = 2;
		gbc_btnNiveles.gridy = 1;
		panel.add(btnNiveles, gbc_btnNiveles);

		JLabel lblNewLabel = new JLabel("Nivel:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		jcbNivel = new JComboBox();
		GridBagConstraints gbc_jcbNivel = new GridBagConstraints();
		gbc_jcbNivel.insets = new Insets(0, 0, 5, 5);
		gbc_jcbNivel.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbNivel.gridx = 1;
		gbc_jcbNivel.gridy = 2;
		panel.add(jcbNivel, gbc_jcbNivel);

		JButton btnCargarMaterias = new JButton("Cargar Materias");
		btnCargarMaterias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarTodasMaterias();
			}
		});
		GridBagConstraints gbc_btnCargarMaterias = new GridBagConstraints();
		gbc_btnCargarMaterias.insets = new Insets(0, 0, 5, 0);
		gbc_btnCargarMaterias.gridx = 2;
		gbc_btnCargarMaterias.gridy = 2;
		panel.add(btnCargarMaterias, gbc_btnCargarMaterias);

		JLabel lblNewLabel_1 = new JLabel("Materia:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		jcbMateria = new JComboBox();
		GridBagConstraints gbc_jcbMateria = new GridBagConstraints();
		gbc_jcbMateria.insets = new Insets(0, 0, 5, 5);
		gbc_jcbMateria.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbMateria.gridx = 1;
		gbc_jcbMateria.gridy = 3;
		panel.add(jcbMateria, gbc_jcbMateria);

		JButton btnVerMaterias = new JButton("Ver Materias");
		btnVerMaterias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarMateria();
			}
		});
		GridBagConstraints gbc_btnVerMaterias = new GridBagConstraints();
		gbc_btnVerMaterias.insets = new Insets(0, 0, 5, 0);
		gbc_btnVerMaterias.gridx = 2;
		gbc_btnVerMaterias.gridy = 3;
		panel.add(btnVerMaterias, gbc_btnVerMaterias);

		JLabel lblNewLabel_2 = new JLabel("Datos de la Materia");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 4;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("ID:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 5;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);

		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 5);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 5;
		panel.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 6;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);

		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 6;
		panel.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Código:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 7;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);

		jtfCodigo = new JTextField();
		GridBagConstraints gbc_jtfCodigo = new GridBagConstraints();
		gbc_jtfCodigo.insets = new Insets(0, 0, 5, 5);
		gbc_jtfCodigo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCodigo.gridx = 1;
		gbc_jtfCodigo.gridy = 7;
		panel.add(jtfCodigo, gbc_jtfCodigo);
		jtfCodigo.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("URL Classroom:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 8;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);

		jtfUrlClassroom = new JTextField();
		GridBagConstraints gbc_jtfUrlClassroom = new GridBagConstraints();
		gbc_jtfUrlClassroom.insets = new Insets(0, 0, 5, 5);
		gbc_jtfUrlClassroom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfUrlClassroom.gridx = 1;
		gbc_jtfUrlClassroom.gridy = 8;
		panel.add(jtfUrlClassroom, gbc_jtfUrlClassroom);
		jtfUrlClassroom.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Fecha Inicio:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 9;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);

		jtfFecha = new JTextField();
		GridBagConstraints gbc_jtfFecha = new GridBagConstraints();
		gbc_jtfFecha.insets = new Insets(0, 0, 5, 5);
		gbc_jtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFecha.gridx = 1;
		gbc_jtfFecha.gridy = 9;
		panel.add(jtfFecha, gbc_jtfFecha);
		jtfFecha.setColumns(10);

		chkAdmiteMatricula = new JCheckBox("Admite Matricula");
		GridBagConstraints gbc_chkAdmiteMatricula = new GridBagConstraints();
		gbc_chkAdmiteMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_chkAdmiteMatricula.gridx = 1;
		gbc_chkAdmiteMatricula.gridy = 10;
		panel.add(chkAdmiteMatricula, gbc_chkAdmiteMatricula);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 11;
		panel.add(btnGuardar, gbc_btnGuardar);

		cargarTodosCentros();

	}

	private void guardar() {

		if (!isCodigoValido()) {
			JOptionPane.showMessageDialog(null, "Error, el código tiene menos de 3 letras");
			return;
		}

		if (jtfUrlClassroom.getText().startsWith("http://") || jtfUrlClassroom.getText().startsWith("https://")) {
			JOptionPane.showMessageDialog(null, "La url de Classroom no empieza de forma adecuada");
			return;
		}

		try {
			Connection conn = ConnectionManager.getConexion();
			PreparedStatement ps = conn.prepareStatement(""
					+ "update materia set nombre=?, codigo=?, urlClassroom=?, admiteMatricula=?, fechaInicio=? where id=?");

			ps.setString(1, jtfNombre.getText());
			ps.setString(2, jtfCodigo.getText());
			ps.setString(3, jtfUrlClassroom.getText());
			ps.setBoolean(4, chkAdmiteMatricula.isSelected());
			ps.setString(5, jtfFecha.getText());
			ps.setInt(6, Integer.parseInt(jtfId.getText()));

			ps.execute();
			JOptionPane a = new JOptionPane();
			a.showMessageDialog(null, "Registro completado con éxito");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane b = new JOptionPane();
			b.showMessageDialog(null, "No se ha completado de forma satisfactoria");
		}

	}

	private boolean isCodigoValido() {
		String codigo = this.jtfCodigo.getText();
		int contLetras = 0;

		for (int i = 0; i < codigo.length(); i++) {
			if (Character.isLetter(codigo.charAt(i))) {
				contLetras++;
			}
		}

		if (contLetras > 2) {
			return true;
		}
		return false;
	}

	private void cargarMateria() {
		Materia o = (Materia) jcbMateria.getSelectedItem();

		jtfId.setText(String.valueOf(o.getId()));
		jtfNombre.setText(o.getNombre());
		jtfCodigo.setText(o.getCodigo());
		jtfUrlClassroom.setText(o.getUrlClassroom());
		jtfFecha.setText(o.getFechaInicio());

		if (o.isAdmiteMatricula()) {
			chkAdmiteMatricula.setSelected(true);
		} else
			chkAdmiteMatricula.setSelected(false);

	}

	private void cargarTodasMaterias() {
		Nivel c = (Nivel) this.jcbNivel.getSelectedItem();
		this.jcbMateria.removeAllItems();
		List<Materia> l = ControladorMateria.getTodos(c.getId());
		for (Materia o : l) {
			jcbMateria.addItem(o);
		}

	}

	private void cargarTodosNiveles() {
		CentroEducativo c = (CentroEducativo) this.jcbCentro.getSelectedItem();
		this.jcbNivel.removeAllItems();
		List<Nivel> l = ControladorNivel.getTodos(c.getId());
		for (Nivel o : l) {
			jcbNivel.addItem(o);
		}

	}

	private void cargarTodosCentros() {
		List<CentroEducativo> l = ControladorCentro.getTodos();
		for (CentroEducativo o : l) {
			jcbCentro.addItem(o);
		}

	}
	
	
	
	/**
     * Pasar la fecha del usuario en formato dd/MM/yyyy y parsearla para introducirla en la tabla
     * @param fechaUsuario
     * @return
     */
    public static String insertarFechaParseada(String fechaUsuario) {

        SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        try {
            date = sdfEntrada.parse(fechaUsuario);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return sdfSalida.format(date);
    }
    
    public static String obtenerFechaParseada(String fechaBaseDeDatos) {
        SimpleDateFormat sdfEntrada = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        Date date = new Date();
        try {
            date = sdfEntrada.parse(fechaBaseDeDatos);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        SimpleDateFormat sdfSalida = new SimpleDateFormat("dd/MM/yyyy");

        return sdfSalida.format(date);
    }

}
