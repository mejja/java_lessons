public class TestClass {
	public static int ml(int i) {
		return ++i;
	}
	public static void main(String[] args) {

		int k = ml(args.length) ;
		k += 3 + ++k;
		System.out.println(k) ;
	}
}