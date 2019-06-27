package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class DashboardFrame extends JFrame {

	private JPanel contentPane;
	private JTextField TFNombre;
	private JTextField TFTelefono;
	private JTextField TFEmail;
	
	/**
	 * Create the frame.
	 */
	public DashboardFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGrupos = new JMenu("Grupos");
		menuBar.add(mnGrupos);
		
		JMenu mnUsuario = new JMenu("Usuario");
		menuBar.add(mnUsuario);
		
		JMenu mnConfiguracion = new JMenu("Configuracion");
		menuBar.add(mnConfiguracion);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 11, 210, 218);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(238, 40, 57, 14);
		contentPane.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(238, 65, 57, 14);
		contentPane.add(lblTelefono);
		
		TFNombre = new JTextField();
		TFNombre.setBounds(294, 37, 130, 20);
		contentPane.add(TFNombre);
		TFNombre.setColumns(10);
		
		TFTelefono = new JTextField();
		TFTelefono.setBounds(294, 62, 130, 20);
		contentPane.add(TFTelefono);
		TFTelefono.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(238, 94, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblGupo = new JLabel("Gupo");
		lblGupo.setBounds(238, 119, 46, 14);
		contentPane.add(lblGupo);
		
		TFEmail = new JTextField();
		TFEmail.setBounds(294, 90, 130, 20);
		contentPane.add(TFEmail);
		TFEmail.setColumns(10);
		
		JComboBox CBXgrupo = new JComboBox();
		CBXgrupo.setModel(new DefaultComboBoxModel(new String[] {"Amigos", "Familiares", "WhastApp"}));
		CBXgrupo.setBounds(294, 116, 130, 20);
		contentPane.add(CBXgrupo);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(220, 172, 105, 23);
		contentPane.add(btnActualizar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(335, 172, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(278, 206, 89, 23);
		contentPane.add(btnBorrar);
	}
}
