class Animal {
	public Animal(int age) {
		System.out.print("Animal");
	}
}
public class Horse extends Animal {
	public Horse() {
		System.out.print("Horse");
	}
	public static void main(String[] args) {
		 new Animal(5);
 	}
}