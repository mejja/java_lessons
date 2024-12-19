public class InitTest{
	static String sl = sM1( "a");{
		sl = sM1("b");
	}
	static{
		sl = sM1("c");
	}
	public static void main(String args[]){
		InitTest it = new InitTest();
	}
	private static String sM1(String s){
		System. out. println(s); return s;
	}
}