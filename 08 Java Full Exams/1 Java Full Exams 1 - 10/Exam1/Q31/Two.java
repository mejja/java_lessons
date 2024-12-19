class Two {
	static int y = 12;

	public static void main(String [ ] args) {
		Two tw = new Two();
		float f=tw.math(3);
		System.out.print(f);
	}

	static int math(final int y) {
		y /= 2;
		return y;
	}
}