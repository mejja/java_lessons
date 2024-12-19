public class TestClass {
	public static void main (String [] args) throws Exception {
		Integer i1 = 1;
		Integer i2 = new Integer (1) ;
		int i3 = 1;
		Byte b1 = 1;
		Long g1 = 1L;

		boolean test1 = i1.equals(i2);
		boolean test2 = i1.equals(b1);
		boolean test3 = i1.equals(g1);
		boolean test4 = i1==i3;

		System.out.println(test1);
		System.out.println(test4);
	}
}