// File: Printable. java
public interface Printable {
	void print ();
	default void displayInfo() {
			System.out.println("This is a printable iten.");
	}
}