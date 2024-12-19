public class Test1 {
	public static void main(String[] args) {

	Rideable r1 = new Icelandic();
	Rideable r2 = new Horse();
	Horse h1 = new Icelandic();

	System.out.println(r1.ride()+r2.ride() +h1.ride());
	}
}

interface Rideable {
	String ride() ;
}
class Horse implements Rideable {
	String ride() { return "cantering "; }
}
class Icelandic extends Horse {
	String ride() { return "tolting "; }
}
