class Test {
	public static void main(String[] args) {
		int x = 25, y = 0;
		do {
				while (true) {
					if (++y >= x) break;
				}
		} while (y < x -- );
		System.out.println(x);
	}
}