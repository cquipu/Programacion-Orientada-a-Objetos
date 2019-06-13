package animales;

public class principal {

	public static void main(String[] args) {

		Hombre usuario=new Hombre("Pedrito","16163516",40,4);	
		// En la superclase nombre tiene modificardor de acceso private
		// para acceder al contenido de este atributo usaremos el metodo getNombre
		System.out.println("Nombre: "+usuario.getNombre());
		
		usuario.setNombre("Juanito");
		System.out.println("Nombre: "+usuario.getNombre());	
		
		// En la superclase patas tiene modificardor de acceso protected 
		// para acceder al contenido de este atributo usaremos el nombre del atributo
		System.out.println("Nombre: "+usuario.patas); 
		
				
		Animal[] animales= new Animal[3];	
		
		//Uso de Polimorfismo => Principio de sustitucion
		animales[0]= new Gato("Gato",10,4);
		animales[1]= new Perro("Perro",10,4);
		animales[2]= new Hombre("Hombre","34534523",10,4);
		
		System.out.println(" ");
		for(int i=0; i<animales.length;i++){
			System.out.println("El "+animales[i].getNombre()+" dice: "+animales[i].hablar());
		}
		// En adelante usaremos foreach para recorrer los arrays
		System.out.println(" ");
		for(Animal ani: animales){
			System.out.println("El "+ani.getNombre()+" dice: "+ani.hablar());
		}
		
		// otro ejemplo del uso de foreach
		float[] numeros={1,3,-2,4,42};
		for (float numero: numeros){
			System.out.println(numero);
		}
		
		
		
		

	}

}
