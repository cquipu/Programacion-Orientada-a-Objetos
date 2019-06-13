package animales;

//extends indica que la clase Gato hereda de la clase Animal
public class Gato extends Animal {

	public Gato(String nombre, int edad, int patas) {
		// Es necesario pasar los parametros al constructor de la superclase
		// para ello se usa => super
		super(nombre, edad, patas);
	}

	@Override
	public String hablar() {
		return "Miau Maiau";
	}

}
