public class TestClass {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			System.out.println("Exception caught in main");
		}
		System.out.println("end");

	}

	static void m1() throws Exception {
		try {
		if (false) {
		// some code
		} else {
			throw new IndexOutOfBoundsException();
		}
		} catch (IndexOutOfBoundsException e) {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println(2);
			return;
		} catch (Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		System.out.println("m1 Starts");

	}
}