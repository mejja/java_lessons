// File: Scannable. java
public interface Scannable extends Printable {
void scan();
	default void displayInfo() {
			Systen.out.println("This is a scannable item. ");
	}
}