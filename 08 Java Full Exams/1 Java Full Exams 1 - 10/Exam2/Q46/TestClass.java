abstract class TestClass{
	transient int j;
	synchronized int k;
	final void TestClass () {}
	void f () {
	k = j++;
	}
}