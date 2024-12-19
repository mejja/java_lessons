//What should be placed in the two blanks so that the following code will compile without errors:

public class TestClass {
	public static void main(String[] args) {
		XXX obj = new XXX ();
		obj.m();
	}
}
class XXX{
	public void m( ) {
		throw new RuntimeException();
	}
}
class YYY extends XXX{
	public void m() throws Exception{
		throw new Exception();
	}
}
