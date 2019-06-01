package agenda;

public class Agenda {	
	//Atributos
	Contacto[] lista;	
	
	//Metodos Constructores
	public Agenda(int tamanio_agenda){
		this.lista= new Contacto[tamanio_agenda]; 
	}
	
	public Agenda(){
		this.lista= new Contacto[10]; 
	}	
	
	//Metodos
	
	//Metodo insertar contactos
	public void setContacto(Contacto c){		
		int indice=buscar_indice_vacio();
		
		if(indice<0){
			System.out.println("");
			System.out.println("Importante: Agenda llena!");
		}else{
			this.lista[indice]=c;	
		}								
	}
	
	private int buscar_indice_vacio() {		
		int indice=0;		
		while(this.lista[indice]!=null){			
			indice++;
			if(indice > (this.lista).length-1){
				return -1;
			}				
		}		
		return indice;				
	}
	
	public void listarContactos(){
		System.out.println("");
		System.out.println("Lista de contactos");
		for(int i=0;i<(this.lista).length;i++){
			if(this.lista[i]==null){
				
			}else{
				System.out.println("");
				System.out.println("Contacto: "+(i+1));
				(this.lista[i]).DatosContacto();
			}
		}			
	}
	
	

}
