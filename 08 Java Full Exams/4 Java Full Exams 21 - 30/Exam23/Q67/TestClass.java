public class TestClass{
	public static void main(String args [] ){
		int a = 5, b = 7, k = 0;
		Integer m = null;
		System.out.println(k = new Integer(a) + new Integer(b)); //1
		System.out.println(k = new Integer(a) + b); //2
		System.out.println(k = a + new Integer(b)); //3
		System.out.println(m = new Integer(a) + new Integer(b)); //4
	}
}
/*Executed independent of each other, what will be the value of k (for //1, //2, and //3) and m (for //4)
after execution of each of these statements?*/