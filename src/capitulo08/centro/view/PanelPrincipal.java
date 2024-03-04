package capitulo08.centro.view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class PanelPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelPrincipal() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
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
		gbc_lblCentro.insets = new Insets(0, 0, 0, 5);
		gbc_lblCentro.gridx = 0;
		gbc_lblCentro.gridy = 1;
		panel.add(lblCentro, gbc_lblCentro);
		
		JComboBox jcbCentro = new JComboBox();
		GridBagConstraints gbc_jcbCentro = new GridBagConstraints();
		gbc_jcbCentro.insets = new Insets(0, 0, 0, 5);
		gbc_jcbCentro.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbCentro.gridx = 1;
		gbc_jcbCentro.gridy = 1;
		panel.add(jcbCentro, gbc_jcbCentro);
		
		JButton btnNiveles = new JButton("Cargar Niveles");
		GridBagConstraints gbc_btnNiveles = new GridBagConstraints();
		gbc_btnNiveles.gridx = 2;
		gbc_btnNiveles.gridy = 1;
		panel.add(btnNiveles, gbc_btnNiveles);

	}

}
