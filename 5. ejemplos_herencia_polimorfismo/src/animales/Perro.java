package animales;

// extends indica que la clase Perro hereda de la clase Animal
public class Perro extends Animal {

	public Perro(String nombre, int edad, int patas) {
		// Es necesario pasar los parametros al constructor de la superclase
		// para ello se usa => super
		super(nombre, edad, patas);
	}
	
	@Override
	public String hablar() { 
		return "Guau Guau";
	 } 

}
