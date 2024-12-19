public class MyTest{
	public static void main (String[] args) {
		MySub ms = new MySub () {
		public void m1 () { System.out.println ("In MySub.ml () "); 
		};
		ms.m1();
	}
}

class MySuper{
public MySuper (int i) { }

}

abstract class MySub extends MySuper{
	public MySub (int i) { super (i); }
	public abstract void m1();
}

