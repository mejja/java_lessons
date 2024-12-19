public class InitTest{
	public InitTest(){
		sl = sM1( "1");
	}
	static String sl = sM1("a");

	String s3 = sM1( "2"); {
		sl = sM1( "3");
	}
	static{
		sl = sM1("b");
	}
	static String s2 = sM1("c");
	
	String s4 = sM1("4");
	public static void main(String args[]){
		InitTest it = new InitTest();
	}
	private static String sM1(String s){
		System. out. println(s); return s;
	}
}