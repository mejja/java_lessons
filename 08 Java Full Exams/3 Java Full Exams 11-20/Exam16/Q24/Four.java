class Four {
	static int x;
	public static void main(String [ ] args) {
		String ss = "aBc";
		String s = "ABC";
		switch(s) {
		case " ": x++;
		case "AbC" : x++;break;
		case "ABC" : x--;
		default : x++;
		case ss : x++;break;
	}
	System.out.print(x);
	}
}