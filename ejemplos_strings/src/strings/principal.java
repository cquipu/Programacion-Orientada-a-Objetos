package strings;

public class principal {

	public static void main(String[] args) {
		
		// MANEJO DE CADENAS
		String alumna="Riana Avila";
		String texto="Mi nombre es: ";
		
		System.out.println("Mi nombre es: " + alumna);
		
		// Metodo: concat(String)
		System.out.println(texto.concat(alumna)); // Mi nombre es: Riana Avila
		
		// Metodo: length()
		System.out.println("Mi nombre tiene: " + alumna.length() + " caracteres"); // 11
		
		// Metodo: charAt(int)
		System.out.println("El primer caracter de mi nombre es: " + alumna.charAt(0)); // R
		System.out.println("El ultimo caracter de mi nombre es: " + alumna.charAt(alumna.length()-1)); // a
		
		// Metodo: substring(int, int)
		String frase="La Decana de America, rumbo al bicentenario...";
		String fragmento=frase.substring(3,20);
		
		System.out.println(fragmento); // Decana de America
		
		// Metodo: equals(Object)
		String texto1="Telecomunicaciones";
		String texto2="telecomunicaciones";
		String texto3=texto1;
		
		System.out.println(texto1.equals(texto2)); // false
		System.out.println(texto1.equals(texto3)); // true
		
		// Metodo: equalsIgnoreCase(Object)
		System.out.println(texto1.equalsIgnoreCase(texto2)); // true
		
		// Metodo: trim()
		String texto4=" Telecomunicaciones        ";
		System.out.println(texto4.trim()); // Telecomunicaciones
		
		// Metodo: toLowerCase()
		System.out.println(texto1.toLowerCase()); // telecomunicaciones
		
		// Metodo: toUpperCase()
		System.out.println(texto1.toUpperCase()); // TELECOMUNICACIONES
		
		// Metodo: indexOf(String, int) 
		System.out.println(frase.indexOf("na",0)); // 7
		
		// Metodo: compareTo(String) 
		System.out.println(texto1.compareTo(texto2)); // -32
		System.out.println(texto1.compareTo(texto3)); // 0
		
		// Metodo: compareToIgnoreCase(String) 
		System.out.println(texto1.compareToIgnoreCase(texto3)); // 0

		// Para conocer la documentacion completa de la Clase String
		// Visitar -> https://docs.oracle.com/javase/8/docs/api/index.html		
		
		
	}

}
