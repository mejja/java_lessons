public class VehicleDemo extends Car{
	public String getInfo(){
		System.out.println("Tesla Model 2");
	}
	public static void main(String[] args) {
	Vehicle myCar = new Car("Tesla Model 3"){
		public String getInfo(){
			myCar.start();
		}
	};
	myCar .start();
	}
}

interface Vehicle {
	void start();
	String getInfo();
}

abstract class Car implements Vehicle {
	private String model;

	public Car(String model) {
		this.model = model;
	}
	public void start() {
		System.out.println(model + " has started.");
	}
}

