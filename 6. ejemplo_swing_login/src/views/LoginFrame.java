package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import controllers.DatosUsuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	public static JTextField TFUsuario;
	public static JPasswordField PSWContrasenia;

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(45, 41, 64, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(45, 66, 64, 14);
		contentPane.add(lblContrasea);
		
		TFUsuario = new JTextField();
		TFUsuario.setBounds(119, 38, 122, 20);
		contentPane.add(TFUsuario);
		TFUsuario.setColumns(10);
		
		PSWContrasenia = new JPasswordField();
		PSWContrasenia.setBounds(119, 63, 122, 20);
		contentPane.add(PSWContrasenia);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				LoginController dusuario=new LoginController();
				if(dusuario.matchLogin(TFUsuario.getText(), PSWContrasenia.getText())){
					
					JOptionPane.showMessageDialog(null, "Acceso exitoso!");
					RegistroFrame registroF=new RegistroFrame();
					registroF.setVisible(true);
					dispose();//Terminar la ejecucion del LoginFrame
				}else{
					JOptionPane.showMessageDialog(null, "Acceso denegado, vuelva a escribir sus datos...");
				}
				
			}
		});
		btnIngresar.setBounds(159, 107, 82, 23);
		contentPane.add(btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(60, 107, 89, 23);
		contentPane.add(btnSalir);
	}

}
