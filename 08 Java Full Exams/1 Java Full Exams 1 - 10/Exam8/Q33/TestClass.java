class TestClass implements Comparable<TestClass> {
	int i;
	public TestClass(int i) { this.i = i; }
	public String toString() {
		if (i == 0) return null;
		else return "" + i;
}
public int compareTo(TestClass other) {
	return Integer.compare(this.i, other.i);
}
public static void main(String[] args) {
	TestClass t1 = new TestClass(0);
	TestClass t2 = new TestClass(2);
	System.out.println(t1.compareTo(t2));
	System.out.println(t2 +""+t1);
	}
}