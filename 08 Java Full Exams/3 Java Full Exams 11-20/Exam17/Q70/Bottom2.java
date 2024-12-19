public class Bottom2 extends Top {
	public Bottom2(String s) {
		super(s); // Explicitly call the Top constructor with the string
		System.out.print("D");
	}
	public static void main(String [] args) {
		new Bottom2("C");
		System.out.println(" ");
	}
}
class Top {
	public Top(String s) {
		System.out.print("B");
	}
}