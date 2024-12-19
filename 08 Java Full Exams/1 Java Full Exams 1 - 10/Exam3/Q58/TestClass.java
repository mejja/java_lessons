public class TestClass {
	public static void main (String [] args) {
		Flyer f = new Eagle () ;
		Eagle e = new Eagle () ;
		Bat b = new Bat () ;

		if (f instanceof Bird) System.out.println ("f is a Bird");
		if (e instanceof Flyer) System.out.println ("e is a Flyer");
		if (b instanceof Flyer) System.out.println ("f is a Bird");
	}
}

interface Flyer{ }
class Bird implements Flyer { }
class Eagle extends Bird { }
class Bat { }