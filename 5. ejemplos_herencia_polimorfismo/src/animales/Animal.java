package animales;

public class Animal {
	
	private String nombre;
	protected int patas;
	private int edad;
	
	public Animal(String nombre,int edad,int patas){
		this.nombre=nombre;
		this.edad=edad;
		this.patas=patas;
	}
	
	public String getNombre() {
	 	 return nombre; 
	}
	
	public void setNombre(String nombre) { 
		 this.nombre = nombre; 
	}
	
	public int getPatas() {
	 	 return patas; 
	}
	
	public void setPatas(int patas) { 
		 this.patas = patas; 
	}
	
	public int getEdad() {
	 	 return edad; 
	}
	
	public void setEdad(int edad) { 
		 this.edad = edad; 
	}
	
	public String hablar(){
		return "----";
	}	

}
