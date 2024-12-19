public class Main {
	public static void main(String[] args) {
		Car car = new Car(2023);
		car.start();
		car.drive();

		Car.Wheel wheel = new Car.Wheel();
		wheel. rotate();

		Vehicle truck = new Vehicle() {
			@Override
			void start() {
				System.out.println("Truck starting");
			}
		};
		truck.start();
	}
}
abstract class Vehicle {
	abstract void start();

	class Engine {
		void rev() {
			System.out.println("Engine revving");
		}
	}
}


class Car extends Vehicle {
	private int year;

	Car(int year) {
		this.year = year;
	}


	@Override
	void start() {
		System.out.println("Car starting");
		Engine engine = new Engine();
		engine. rev();
	}

	static class Wheel {
		void rotate() {
			System.out.println("Wheel rotating");
	}
}

void drive() {
	class SteeringWheel {
		void turn() {
			System.out.println("Steering wheel turning");
		}
	}
	SteeringWheel wheel = new SteeringWheel();
	wheel.turn();
	}
}