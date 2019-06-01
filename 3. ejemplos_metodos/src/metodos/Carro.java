package metodos;

public class Carro {
			
		// atributos publicos
		int numero_llantas;
		int velocidad;
		float peso;
		String color;
		
		// atributos privados
		private String marca; 
		private String modelo;
		private int anio_fabricacion;		
		private String placa_rodaje;
		private int acelerar;
		
		//Metodo Constructor con parametros
		public Carro(String marca, String modelo, int anio_fabricacion, float peso){
			this.marca=marca;
			this.modelo=modelo;
			this.anio_fabricacion=anio_fabricacion;
			this.peso=peso;
			this.velocidad=0;
		}
		//Sobrecarga de metodos
		//Metodo Constructor sin parametros
		public Carro(){
			this.marca="Anonimo";
			this.modelo="Anonimo";
			this.anio_fabricacion=0;
			this.peso=0;
			this.velocidad=0;
		}
		
		//Metodos set
		public void setColor(String color){
			this.color=color;
		}
		
		public void setPlaca_Rodaje(String placa_rodaje){
			this.placa_rodaje=placa_rodaje;
		}
		
		public void setNumero_Llantas(int numero_llantas){
			this.numero_llantas=numero_llantas;
		}
		
		private void incrementar(int valor){
			this.velocidad=this.acelerar+valor;
		}
		
		public void acelerar(int valor){
			this.incrementar(valor);
		}
		
		//Metodos get
		public String getMarca(){
			return this.marca;
		}
		
		public String getColor(){
			return this.color;
		}
		
		public String getPlaca_Rodaje(){
			return this.placa_rodaje;
		}
			
		public int getNumero_Llantas(){
			return this.numero_llantas;
		}			
		
		public String getModelo(){
			return this.modelo;
		}
		
		public int getAnio(){
			return this.anio_fabricacion;
		}
		public float getPeso(){
			return this.peso;
		}
		
		public int velocidad(int valor){		
			return this.velocidad;
		}
		
		//Metodos con la propiedad static
		public double Suma(int dato1, int dato2){		
			return (dato1+dato2);
		}

}
