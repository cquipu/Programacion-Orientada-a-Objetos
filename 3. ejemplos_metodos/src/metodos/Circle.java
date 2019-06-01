package metodos;

public class Circle {
	//Atributos
	private double radius;
	
	//Metodos
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return (Math.PI)*radius*radius;
	}

	public double getPerimeter() {
		return 2*(Math.PI)*radius;
	}

	public void setRadius(double radius) {
		this.radius=radius;
	}
}
