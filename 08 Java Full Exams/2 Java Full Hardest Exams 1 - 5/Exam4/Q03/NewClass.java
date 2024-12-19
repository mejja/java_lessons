public class NewClass{
	private Object o;
	void doSomething (Object s) { o = s; }
	public static void main (String args []) {
		Object obj = new Object (); // 1
		NewClass tc = new NewClass () ; //2
		tc.doSomething (obj); //3
		obj = new Object () ;//4
		obj = null;//5
		tc.doSomething (obj); //6
	}
}
//Which is the earliest line in the following code after which the object created on line
// 1 can be garbage collected, assuming no compiler optimizations are done?




