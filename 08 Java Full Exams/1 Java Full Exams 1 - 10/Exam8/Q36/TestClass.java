class TestClass {
	int i;
	public TestClass(int i) { this.i = i; }
	public String toString() {
	switch (i) {
		case 0: return null;
		default: return "" + i;
	}
}
	public static void main(String[] args) {
		TestClass t = new TestClass(0);
		TestClass t1 = new TestClass(2);
		TestClass t2 = new TestClass(3);
		System.out.println(t + " "+ t1 + " " +t2);
	}
}



