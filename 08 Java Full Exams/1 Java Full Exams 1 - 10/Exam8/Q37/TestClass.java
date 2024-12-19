class TestClass {
	int i;
	public TestClass(int i) { this.i = i; }
	public String toString() {
		if (i == 0) return "";
		else return "" + i;
	}
	public static void main(String[] args) {
		TestClass t1 = new TestClass(0);
		TestClass t2 = new TestClass(5);
		// System.out.println();
		System.out.println(t2 + " "+ t1);
	}
}