public class ArrayTest {
	public static void main(String[] args) {
		Animal[] animals = {new Animal(), new Dog(), null};
			for (Animal a : animals) {
				try {
					System.out.println(a.sound("Dog"));
					break;
				} catch (NullPointerException e) {
					System.out.println("Silent");
					continue;
			}
		}
	}
}

class Animal {
		protected String sound(String b) { return "Animal sound" + " " + b; }
}
class Dog extends Animal {
		protected String sound(String a) { return (new Animal()).sound(a) + " " + "Woof" + a; }
}

