public class TestClass {
	((AA)a).doStuff();
    public static void main(String[] args) {
		A a = null;
		AA aa = null;
		//aa = a;
		
	}
}
class A {
	public int getCode() { return 2;}
}
class AA extends A {
	public void doStuff() {}
}
