public class Main {
		public static void main(String[] args) {
		Dog dog1 = new Dog();
		System.out.println(" --- ");
		Dog dog2 = new Dog("Buddy", 3, "Labrador");
	}
}
class Animal {
	protected String name;
	protected int age;

	{
		System.out.println("Animal instance initializer");
	}
	public Animal() {
		this("Unknown");
		System.out.println("Animal no-arg constructor");
	}
	public Animal(String name) {
		this(name, 0);
		System.out.println("Animal single-arg constructor");
	}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Animal two-arg constructor");
	}
}
class Dog extends Animal {
	private String breed;

	{
		System.out.println("Dog instance initializer");
	}

	public Dog() {
		super();
		this.breed = "Mixed";
		System.out.println("Dog no-arg constructor");
	}

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
		System.out.println("Dog three-arg constructor");
	}
	static{
		System.out.println("Dog Static initializer");
	}

}

