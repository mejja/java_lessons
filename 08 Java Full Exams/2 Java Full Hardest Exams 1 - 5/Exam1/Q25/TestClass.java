abstract class TestClass{
	transient int j;
	synchronized int k;
	final void TestClass () {}
	static void f () {
		k = j++;
	}
}