
public class TestClass {
	public static void main(String[] args) throws Exception {
		OverloadingTest ot = new OverloadingTest ( );
		ot.ml(1.0);
	}
}
class OverloadingTest{
	void ml(int x){
		System. out. println( "ml int");
	}
	void ml(double x){
		System. out. println( "ml double");
	}
	void ml(String x){
		System. out. println( "ml String");
	}
}