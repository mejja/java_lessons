public class TestClass {
	public static void main(String[] args) throws Exception {
		Square mysq = new Square(10);
		mysq.color = "red";

		//set mysq's side to 20
		mysq.setSide(20);
		
	}
}

class Square {
	private double side = 0;
	String color;
	public Square(double length) {
		this. side = length;
	}
	public double getSide() { return side;}

	public void setSide(double side) { this.side = side;}

}

