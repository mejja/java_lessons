public class AnimalTest {
	public static void main(String[] args) throws Exception {
		Describable d = new Cat("Siamese Cat");
		// PRINT DESCRIPTION HERE
	}
}
interface Describable {
String describe();

class Animal implements Describable {
	public String species;
	public Animal(String species) {
		this.species = species;
	}
public String describe() { return species; }
}
class Cat extends Animal {
	public Cat(String species) {
		super (species) ;
	}
}
