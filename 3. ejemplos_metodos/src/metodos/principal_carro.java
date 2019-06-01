package metodos;

public class principal_carro {

	public static void main(String[] args) {
		
		//instanciamos un objeto de la clase Carro
		Carro auto=new Carro(); //
		
		System.out.println("Marca: " + auto.getMarca());
		auto.setColor("Rojo"); // Cambiamos el atributo color de nuestro objeto auto
		String color=auto.getColor();
		System.out.println(color);
		
		Carro auto2=new Carro("Ferrari","Formula",2019,1020.0f);
		System.out.println(auto2.getMarca());

	}

}
