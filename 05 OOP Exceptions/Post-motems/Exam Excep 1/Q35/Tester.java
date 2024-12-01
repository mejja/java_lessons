public class Tester {
	public static void main(String[] args) {
		Vehicle a = new Car();
		Colorable i = (Colorable) a;
		Vehicle b = new Vehicle();
		Colorable j = (Colorable) b;
	}
}

interface Colorable {}
class Vehicle {}
class Car extends Vehicle implements Colorable {}
