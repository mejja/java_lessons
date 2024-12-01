class TestClass {
	public static void main(String[] args) {
		try{
			int a, b;
			b= 1;
			a = 5/b;
		System.out.println("A");
		}catch (ArithmeticException e) {
			System.out.println("B");
		}
	}
}