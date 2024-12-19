class SafeNumber {
	private int num;

	public SafeNumber(int num) { this.num = num; }

	public String toString() {
		try {
		if (num == 0) throw new IllegalArgumentException("Number is zero");
			return String.valueOf(num);
		} catch (IllegalArgumentException e) {
			return e.getMessage();
		}
	}
	public static void main(String[] args) {
		SafeNumber first = new SafeNumber(0);
		SafeNumber second = new SafeNumber(2);

		System.out.println(second + " " + first);
	}
}