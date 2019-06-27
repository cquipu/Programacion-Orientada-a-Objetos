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

import controllers.Login;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField TFUsuario;
	private JPasswordField PFContrasenia;

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(33, 45, 68, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(33, 84, 68, 14);
		contentPane.add(lblContrasea);
		
		TFUsuario = new JTextField();
		TFUsuario.setBounds(111, 42, 126, 20);
		contentPane.add(TFUsuario);
		TFUsuario.setColumns(10);
		
		PFContrasenia = new JPasswordField();
		PFContrasenia.setBounds(111, 81, 126, 20);
		contentPane.add(PFContrasenia);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(match()){
					JOptionPane.showMessageDialog(null, "Acceso exitoso!");
					limpiar();
				}else{
					JOptionPane.showMessageDialog(null, "Acceso denegado ...");
					limpiar();
				}
			}
		});
		btnIngresar.setBounds(148, 139, 89, 23);
		contentPane.add(btnIngresar);
	}
	
	public boolean match(){
		Login lusuario=new Login();
		return lusuario.matchLogin(TFUsuario.getText(),PFContrasenia.getText());
	}
	
	public void limpiar(){
		TFUsuario.setText("");
		PFContrasenia.setText("");
	}
}
