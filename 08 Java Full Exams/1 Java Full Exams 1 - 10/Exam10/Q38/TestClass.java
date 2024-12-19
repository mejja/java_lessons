public class TestClass implements T3 {
	public void m1(int x){
    		System.out.println(x);
    	}
    public void m1(){
    		System.out.println("Hello There");
    	}
    public static void main(String[] args) {
    	TestClass tc = new TestClass();
    	tc.m1();
    	tc.m1(10);
    }
}
interface T1{
}
interface T2{
	int VALUE = 10;
	void m1();
}
interface T3 extends T1, T2{
	public void m1();
	public void m1(int x);
}