package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Login {
	
	public boolean matchLogin(String usuario, String contrasenia){
		
		//if(usuario.equals(user)&&password.equals(contrasenia)){
		if(buscarUsuario(usuario,contrasenia)!=null){
			return true;
		}else{
			return false;
		}		
	}
	
	public String buscarUsuario(String usuario, String contrasenia){
		String linea=null;
		try{
			File file=new File("usuarios.txt");
			if(file.exists()){
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);					
				while((linea=br.readLine())!=null){
					String[]datos=linea.split(",");
					if(datos[0].equals(usuario)&&datos[1].equals(contrasenia)){
						return linea;
					}
					System.out.println("Usuario: "+datos[0]+"\nContaseña: "+datos[1]);
				}	
			}			
		}catch(Exception e){
			
		}			
		return linea;
	}
	
	

}
