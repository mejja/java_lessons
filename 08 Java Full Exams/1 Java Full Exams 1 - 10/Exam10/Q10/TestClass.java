public class TestClass{
	public static void main(String[] args){}

	Object m1(){
		return new Object();
	}
	void m2(){
		String s = (String) m1();//assuming that method m2 is invoked
	}
}