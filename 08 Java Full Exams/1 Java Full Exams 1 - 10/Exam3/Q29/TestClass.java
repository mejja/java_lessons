public class TestClass {
	public static void main (String [] args) {
		Object t = new Integer(106);
		int k = ((Integer) t).intValue()/10;
		System.out.println(k);
		System.out.println(100/9.9);
		System.out.println(100/10.0);
		System.out.println(100/10);
		System.out.println(3+100/10*2-13);

	}
}