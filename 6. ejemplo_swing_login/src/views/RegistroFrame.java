package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroFrame extends JFrame {

	private JPanel contentPane;
	private JTextField TFNombre;
	private JTextField TFApellido;
	private JTextField TFDni;
	
	private ButtonGroup BGSexo;
	
	/**
	 * Create the frame.
	 */
	public RegistroFrame() {
		setTitle("Actualizar Datos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(39, 40, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(39, 65, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(39, 90, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(39, 115, 46, 14);
		contentPane.add(lblSexo);
		
		JLabel lblEscuelaAcademica = new JLabel("EAP");
		lblEscuelaAcademica.setBounds(39, 140, 46, 14);
		contentPane.add(lblEscuelaAcademica);
		
		TFNombre = new JTextField();
		TFNombre.setBounds(109, 37, 153, 20);
		contentPane.add(TFNombre);
		TFNombre.setColumns(10);
		
		TFApellido = new JTextField();
		TFApellido.setBounds(109, 62, 153, 20);
		contentPane.add(TFApellido);
		TFApellido.setColumns(10);
		
		TFDni = new JTextField();
		TFDni.setBounds(109, 87, 96, 20);
		contentPane.add(TFDni);
		TFDni.setColumns(10);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(109, 111, 109, 23);
		contentPane.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(214, 111, 109, 23);
		contentPane.add(rdbtnFemenino);
		
		BGSexo = new ButtonGroup();
		BGSexo.add(rdbtnMasculino);
		BGSexo.add(rdbtnFemenino);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Telecomunicaciones", "Electronica", "Electrica", "Biomedica"}));
		comboBox.setBounds(109, 137, 153, 20);
		contentPane.add(comboBox);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String datos;
				datos="Nombre: "+TFNombre.getText()+"\nApellidos: "+TFApellido.getText();
				JOptionPane.showMessageDialog(null, datos);
			}
		});
		btnActualizar.setBounds(198, 206, 89, 23);
		contentPane.add(btnActualizar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(99, 206, 89, 23);
		contentPane.add(btnSalir);
	}
}
