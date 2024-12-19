class MyClass{
	public static void main (String[] args) {
		int [ ] sample = new int[5];
		if (sample instanceof Object) {
			System.out.println("Sample is an Object");
		} else {
			System.out.println("Sample is not an Object");
		}
	}
}