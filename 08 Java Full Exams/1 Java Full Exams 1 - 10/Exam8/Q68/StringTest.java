class StringTest {
	public static void main(String[] args) {
		String[] words = {"Java", "is", "fun"};
		StringBuilder result = new StringBuilder();
		for (String w : words) {
			result.append(w.substring(0, 1).toUpperCase())
				.append(w.substring(1))
				.append(" ");
		}
		System.out.println(result.toString().trim());
	}
}