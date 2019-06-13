package animales;

//extends indica que la clase Hombre hereda de la clase Animal
public class Hombre extends Animal {

	private String dni;

	public Hombre(String nombre,String dni, int edad, int patas) {
		// Es necesario pasar los parametros al constructor de la superclase
		// para ello se usa => super
		super(nombre, edad, patas=2);
		this.dni=dni;
	}
		
	@Override
	public String hablar() { 
		return "Hola!";
	 } 
		
	public String getDni() {
	 	 return dni; 
	}
	
	public void setDni(String dni) { 
		 this.dni = dni; 
	}

}
