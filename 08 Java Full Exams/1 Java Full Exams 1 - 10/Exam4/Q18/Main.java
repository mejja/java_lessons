public class Main {
	public static void main(String[] args) {
		Truck t = new Truck();
		Vehicle v2 = new Truck(t);
	}
}

class Vehicle {
	static {
		Vehicle van_1 = new Vehicle();
		Vehicle van = new Vehicle(van_1){
			protected void drive(){
				System.out.println(" Vehicle: Accelerating.");
			}
		};
		van.drive();
	}
	Vehicle(Vehicle van) {
		van.drive();
	}
	Vehicle(){
	}
	void drive() {
		System.out.print("Vehicle: drive");
	}
	void drive(String message) {
		System.out.print(message);
	}
}

class Automobile extends Vehicle {
	Automobile(){
	}

	Automobile(Automobile obj) {
		super(obj);
		System.out.println("Automobile constructor");
	}
	void drive() {
		System.out.print("Automobile: drive");
	}
}

class Truck extends Automobile {
	Truck(){
	}
	Truck(Truck truck) {
		this("Truck constructor", truck);
	}
	Truck(String message, Truck truck) {
		super(truck);
		System.out.println(message);
	}
	void drive() {
		super.drive("Truck: drive");
	}
}
