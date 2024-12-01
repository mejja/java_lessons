public class Tester{
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			System. out. println("RuntimeException");
		} catch (ArithmeticException e) {
			System. out.println("ArithmeticException");
		} catch (Exception e) {
			System. out.println("Exception");
		}
	}
}