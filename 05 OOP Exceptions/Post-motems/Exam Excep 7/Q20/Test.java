public class Test{
	public static void main(String[] args){
		int[] a= null;
		int i = a[m1()];
	}
	public static int m1() throws Exception{
		throw new Exception("Some Exception");
	}
}