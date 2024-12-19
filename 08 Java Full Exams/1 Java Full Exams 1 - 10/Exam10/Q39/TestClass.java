public class TestClass {
	public static void main(String[] args) {
		YYY obj = new YYY();//throw YYY's m1()
		obj.m();
	}
}
class XXX{
	public void m() throws Exception{
		throw new Exception();
	}
}
class YYY extends XXX{
	public void m(){
		System.out.println("Method m() in YYY, but no exception is thrown.");
	}
}