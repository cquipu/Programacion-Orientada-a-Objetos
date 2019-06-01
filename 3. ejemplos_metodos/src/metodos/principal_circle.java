package metodos;

public class principal_circle {
	
	public static void main(String[] args) {
		
		Circle figura = new Circle(); // instanciamos un objeto de la clase Circle
		
		figura.setRadius(5);// ingresamos el radio del circulo
		System.out.println("Radio del circulo: " + figura.getRadius());
		System.out.println("Area del circulo:" + figura.getArea());	
		System.out.println("Perimetro del circulo: " + figura.getPerimeter());

	}
}
