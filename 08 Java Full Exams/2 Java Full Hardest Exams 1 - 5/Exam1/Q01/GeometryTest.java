abstract class Shape{
	protected double area;
	double calculateArea();
	public void diplayArea(){
		System.out.println("Area: "+ area);
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(double radius){
		this.radius=radius;
	}
	@Override
	public double calculateArea(){
		area = Math.PI* radius *radius;
		return area;
	}
}
class Rectangle extends Shape{
	private double length;
	private double width;
	public Rectangle(double length, double width){
		this.length= length;
		this.width= width;
	}
	@Override
	public double calculateArea(){
		area=length*width;
		return area;
	}
}

public class GeometryTest{
	public static void main(String[] args){
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(4,6);
		System.out.println("Circle area: "+ circle.calculateArea());
		circle.displayArea();
		System.out.println("Rectangle area: "+ rectangle.calculateArea());
		rectangle.displayArea();
	}
	
}