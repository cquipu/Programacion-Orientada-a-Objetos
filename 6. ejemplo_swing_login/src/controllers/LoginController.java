package controllers;

public class LoginController {
	
	public boolean matchLogin(String usuario, String contrasenia){		
		if(usuario.equals("admin") && contrasenia.equals("123")){
			return true;
		}else{
			return false;
		}		
	}
}
