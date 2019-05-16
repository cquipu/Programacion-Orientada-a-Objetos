package strings;

public class buscar_ocurrencias_strings {

	public static void main(String[] args) {
		
		// MANEJO DE CADENAS

		String frase="La decana de America, rumbo a 505 años.....505.....505.....505.....505.....505";

		//Mostramos la primera ocurrencia del texto "505" en la variable textual frase
		int ocurrencia=frase.indexOf("505",0); // almacenamos el indice del primer caracter de la primera ocurrencia

		System.out.println("Indice de la primera ocurrencia: "+ocurrencia);
        System.out.println(frase.substring(ocurrencia, ocurrencia+3)); // mostramos el texto de la primera ocurrencia

        //---------------------------------------------------------------------------
        //Mostramos la segunda ocurrencia ocurrencia del texto "505" en la variable textual frase
        ocurrencia=frase.indexOf("505",ocurrencia+3);

        System.out.println("Indice de la segunda ocurrencia: "+ocurrencia);
        System.out.println(frase.substring(ocurrencia, ocurrencia+3)); // mostramos el texto de la segunda ocurrencia


        //Reto: implementar un metodo para contar todas las ocurrecias del texto "505" en la variable textual frase
      

		// Para conocer la documentacion completa de la Clase String
		// Visitar -> https://docs.oracle.com/javase/8/docs/api/index.html		
		
		
	}

}
