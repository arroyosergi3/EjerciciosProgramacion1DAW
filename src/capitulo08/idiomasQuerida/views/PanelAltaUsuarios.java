package capitulo08.idiomasQuerida.views;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import capitulo08.centroEducativo.controladores.ConnectionManager;
import capitulo08.idiomasQuerida.controlelrs.ControladorIdioma;
import capitulo08.idiomasQuerida.controlelrs.ControladorPais;
import capitulo08.idiomasQuerida.controlelrs.ControladorUsuario;
import capitulo08.idiomasQuerida.entities.Acuerdo;
import capitulo08.idiomasQuerida.entities.Idioma;
import capitulo08.idiomasQuerida.entities.Pais;
import capitulo08.idiomasQuerida.entities.Usuario;


import java.awt.Insets;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class PanelAltaUsuarios extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtfEmail;
	private JTextField jtfUsuario;
	private JTextField jtfPassword;
	private JTextField jtfConfirmPassword;
	private JComboBox<Pais> jcbPais;
	private JComboBox<Idioma> jcbIdioma;
	private List<Acuerdo> acuerdos;
	JCheckBox chkAcepta;

	/**
	 * Create the panel.
	 */
	public PanelAltaUsuarios() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblEmail = new JLabel("Email:");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 1;
		add(lblEmail, gbc_lblEmail);

		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 2;
		gbc_jtfEmail.gridy = 1;
		add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);

		JLabel lblNewLabel = new JLabel("Usuario:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);

		jtfUsuario = new JTextField();
		GridBagConstraints gbc_jtfUsuario = new GridBagConstraints();
		gbc_jtfUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtfUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfUsuario.gridx = 2;
		gbc_jtfUsuario.gridy = 2;
		add(jtfUsuario, gbc_jtfUsuario);
		jtfUsuario.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 3;
		add(lblPassword, gbc_lblPassword);

		jtfPassword = new JTextField();
		GridBagConstraints gbc_jtfPassword = new GridBagConstraints();
		gbc_jtfPassword.insets = new Insets(0, 0, 5, 0);
		gbc_jtfPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfPassword.gridx = 2;
		gbc_jtfPassword.gridy = 3;
		add(jtfPassword, gbc_jtfPassword);
		jtfPassword.setColumns(10);

		JLabel lblConfirmarPassword = new JLabel("Confirmar Password:");
		GridBagConstraints gbc_lblConfirmarPassword = new GridBagConstraints();
		gbc_lblConfirmarPassword.anchor = GridBagConstraints.EAST;
		gbc_lblConfirmarPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmarPassword.gridx = 1;
		gbc_lblConfirmarPassword.gridy = 4;
		add(lblConfirmarPassword, gbc_lblConfirmarPassword);

		jtfConfirmPassword = new JTextField();
		GridBagConstraints gbc_jtfConfirmPassword = new GridBagConstraints();
		gbc_jtfConfirmPassword.insets = new Insets(0, 0, 5, 0);
		gbc_jtfConfirmPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfConfirmPassword.gridx = 2;
		gbc_jtfConfirmPassword.gridy = 4;
		add(jtfConfirmPassword, gbc_jtfConfirmPassword);
		jtfConfirmPassword.setColumns(10);

		JLabel lblPais = new JLabel("Pais:");
		GridBagConstraints gbc_lblPais = new GridBagConstraints();
		gbc_lblPais.anchor = GridBagConstraints.EAST;
		gbc_lblPais.insets = new Insets(0, 0, 5, 5);
		gbc_lblPais.gridx = 1;
		gbc_lblPais.gridy = 5;
		add(lblPais, gbc_lblPais);

		jcbPais = new JComboBox <Pais>();
		jcbPais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarTodosIdiomas();
			}
		});
		GridBagConstraints gbc_jcbPais = new GridBagConstraints();
		gbc_jcbPais.insets = new Insets(0, 0, 5, 0);
		gbc_jcbPais.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbPais.gridx = 2;
		gbc_jcbPais.gridy = 5;
		add(jcbPais, gbc_jcbPais);

		JLabel lblIdioma = new JLabel("Idioma:");
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.anchor = GridBagConstraints.EAST;
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.gridx = 1;
		gbc_lblIdioma.gridy = 6;
		add(lblIdioma, gbc_lblIdioma);

		jcbIdioma = new JComboBox<Idioma>();
		GridBagConstraints gbc_jcbIdioma = new GridBagConstraints();
		gbc_jcbIdioma.insets = new Insets(0, 0, 5, 0);
		gbc_jcbIdioma.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbIdioma.gridx = 2;
		gbc_jcbIdioma.gridy = 6;
		add(jcbIdioma, gbc_jcbIdioma);

		chkAcepta = new JCheckBox("Acepta los terminos del alta de usuario");
		GridBagConstraints gbc_chkAcepta = new GridBagConstraints();
		gbc_chkAcepta.insets = new Insets(0, 0, 5, 0);
		gbc_chkAcepta.gridwidth = 2;
		gbc_chkAcepta.gridx = 1;
		gbc_chkAcepta.gridy = 7;
		add(chkAcepta, gbc_chkAcepta);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridx = 2;
		gbc_btnGuardar.gridy = 8;
		add(btnGuardar, gbc_btnGuardar);
		cargarTodosPaises();

	}

	private void cargarTodosPaises() {
		List<Pais> l = ControladorPais.getTodos();
		for (Pais o : l) {
			jcbPais.addItem(o);
		}
//	Expresión regular de correo electrónico	\w+@\w+.\w+.

	}

	private void cargarTodosIdiomas() {
		jcbIdioma.removeAllItems();
		Pais p = (Pais) jcbPais.getSelectedItem();
		List<Idioma> l = ControladorIdioma.getTodos(p.getId());
		for (Idioma o : l) {
			jcbIdioma.addItem(o);
		}

	}
	
	private void listarTodosAcuerdos() {
		try {
			ResultSet rs =  ConnectionManager.getConexion().createStatement().executeQuery("select * from acuerdo");
			while(rs.next()) {
				Acuerdo o = getEntidadFromResulSet(rs);
				acuerdos.add(o);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private static Acuerdo getEntidadFromResulSet(ResultSet rs) throws SQLException {
		Acuerdo o = null;


			o = new Acuerdo();
			o.setId(rs.getInt("id"));
			o.setDescripcion(rs.getString("descripcion"));
			o.setIdIdioma(rs.getInt("idIdioma"));
			

		
		
		return o;
	}
	
	
	

	private void guardar() {
		if (!isEmailValido()) {
			JOptionPane.showMessageDialog(null, "Error, el email no es válido");
			return;
		}
		if (!isUserValido()) {
			JOptionPane.showMessageDialog(null, "Errorr, el usuario tiene que tener 8 carácteres como mínimo");
			return;
		}
		if(!isPasswordValida()) {
			JOptionPane.showMessageDialog(null, "Error, la contraseña debe tener como mínimo una mayuscula, una minúscula y un número");
			return;
		}
		if (!isSamePassword()) {
			JOptionPane.showMessageDialog(null, "Error, las contraseñas no coinciden");
			return;
		}
		
		try {
			Idioma i = (Idioma) this.jcbIdioma.getSelectedItem();
			Usuario o = new Usuario();
			o.setEmail(this.jtfEmail.getText());
			o.setUsuario(this.jtfUsuario.getText());
			o.setIdIdioma(i.getId());
			o.setId(ControladorUsuario.maxIdEnTabla("usuario"));
			
			Connection conn = ConnectionManager.getConexion();
			
			JOptionPane.showMessageDialog(null, "Registro nuevo guardado con éxito");

			ControladorUsuario.insercion(o, conn);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean isEmailValido() {
		return this.jtfEmail.getText().matches("[a-Z]{1,}[@][a-Z]{1,}[.][a-Z]{1,}");
	}

	private boolean isUserValido() {
		return this.jtfUsuario.getText().matches("[a-Z]{8,}");
	}

	private boolean isPasswordValida() {
		String codigo = this.jtfPassword.getText();
		int contMinus = 0, contMayus = 0, contNum = 0;

		for (int i = 0; i < codigo.length(); i++) {
			if (Character.isLetter(codigo.charAt(i)) && Character.isUpperCase(codigo.charAt(i))) {
				contMayus++;
			}
			if (Character.isLetter(codigo.charAt(i)) && Character.isLowerCase(codigo.charAt(i))) {
				contMinus++;
			}

			if (Character.isDigit(codigo.charAt(i))) {
				contNum++;
			}
		}

		if (contMayus > 0 && contMinus > 0 && contNum > 0) {
			return true;
		}
		return false;
	}

	private boolean isSamePassword() {
		if (this.jtfConfirmPassword.getText().equals(this.jtfPassword.getText())) {
			return true;
		}
		return false;
	}
	
	private void seleccionarIdiomaCheckBox() {
		
		for (int i = 0; i < this.jcbIdioma.getItemCount(); i++) {
			if (this.jcbIdioma.getItemAt(i).getId() == acuerdos.get(i).getIdIdioma()) {
			this.chkAcepta.setText(acuerdos.get(i).getDescripcion());		}
			}
	}
	
	

}
