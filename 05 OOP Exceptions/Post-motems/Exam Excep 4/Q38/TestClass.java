public class TestClass{

	static String m(){

		try{

		int i=10/0;

		}catch(ArithmeticException e){

		return "catch";

		}finally {

		return "finally";
		}
	}
	public static void main(String[] args) {
		System.out.println("method return -> "+m());
	}
}