class App {
	public static void main(String [ ] args) {
		try {

			switch(Integer.parseInt(args[0])) {
				case 1:
				throw new IllegalStateException();
				case 2:
				throw new IllegalArgumentException();
				case 3:
				throw new RuntimeException();
			}
		} finally { }
	}
}