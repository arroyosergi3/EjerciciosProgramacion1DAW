package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Grafica1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblCif = new JLabel("CIF:");
		GridBagConstraints gbc_lblCif = new GridBagConstraints();
		gbc_lblCif.insets = new Insets(0, 0, 5, 5);
		gbc_lblCif.anchor = GridBagConstraints.EAST;
		gbc_lblCif.gridx = 0;
		gbc_lblCif.gridy = 2;
		contentPane.add(lblCif, gbc_lblCif);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 3;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		contentPane.add(panel, gbc_panel);
		
		JButton btnInicio = new JButton("");
		btnInicio.setIcon(new ImageIcon(Grafica1.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/gotostart.png")));
		panel.add(btnInicio);
		
		JButton btnAtras = new JButton("");
		btnAtras.setIcon(new ImageIcon(Grafica1.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/previous.png")));
		panel.add(btnAtras);
		
		JButton btnAlante = new JButton("");
		btnAlante.setIcon(new ImageIcon(Grafica1.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/next.png")));
		panel.add(btnAlante);
		
		JButton btnFin = new JButton("");
		btnFin.setIcon(new ImageIcon(Grafica1.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/gotoend.png")));
		panel.add(btnFin);
	}

}
