public class TestClass {

	public static void main(String args[]) {

		try {

		int a[] = {1, 2,3, 4, 5};
		for (int i =0; i<7; ++i)
			System.out.print(a(i));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("0");
		}
	}
}