package controllers;

import views.LoginFrame;

public class DatosUsuario {
	
	private String usuario;
	private String contrasenia;
	
	public boolean matchLogin(){
		usuario=LoginFrame.TFUsuario.getText();
		contrasenia=LoginFrame.PSWContrasenia.getText();
		
		if(usuario.equals("admin") && contrasenia.equals("123")){
			return true;
		}else{
			return false;
		}		
	}

}
