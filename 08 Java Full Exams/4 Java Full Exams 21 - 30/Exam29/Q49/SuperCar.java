public class SuperCar {
	Car c = new BasicCar ();
	public void start() {
		c.start();
	}
}


interface Car {
	public void start();
}
class BasicCar implements Car {
	public void start() {}
}
/*
Which three are true?

A. BasicCar uses composition.

B. SuperCar uses composition.

C. BasicCar is-a Car.

D. SuperCar is-a Car.

E. SuperCar takes advantage of polymorphism
*/

