public class TestClass{
	public static void main (String args [ ] ) {
		int i = 0 ;
		boolean booll = true ;
		boolean bool2 = false;
		boolean bool = false;
		bool = ( bool2 & method1 (i++) ) ; //1
		bool = ( bool2 && method1 (i++) ); //2
		bool = ( booll | method1 (i++) ) ; //3
		bool = ( booll || method1 (i++) ) ; //4
		System.out.println (i) ;
	}
	public static boolean method1 (int i) {
		return i>0 ? true : false;
	}
}