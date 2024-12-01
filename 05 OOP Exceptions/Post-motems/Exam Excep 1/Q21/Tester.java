public class Tester {
	public static void main(String[] args) {
		Double d = -4.0;
		try {
			d/= 0;
		} catch (ArithmeticException e) {
			System. out. println ("EXCEPTION!") ;
		} finally {
			System.out.println(d);
		}
	}
}