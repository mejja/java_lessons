public class Main {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();

		animal1.makeSound ();
		animal2.makeSound();
		animal1.move();

		Dog dog = (Dog) animal1;
		dog. fetch("ball");
		dog. fetch("stick", 3);
	}
}

abstract class Animal {
	abstract void makeSound();
	void move() { System.out.println("Animal moves"); }
}

class Dog extends Animal {
	@Override
	void makeSound() { System.out.println("Dog barks"); }

	@Override
	void move() {
		super.move () ;
		System.out.println("Dog runs");
	}
	void fetch(String item) { System.out.println("Dog fetches " + item); }
	void fetch(String item, int times) { System.out.println("Dog fetches " + item + " " + times + " times"); }
}

class Cat extends Animal {
	@Override
	void makeSound() { System.out.println("Cat meows"); }
}
