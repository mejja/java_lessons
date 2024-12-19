public class TestClass {
	enum Season {SUMMER, WINTER, SPRING, FALL}
	public static void main (String [] args) throws Exception {
		Season s = Season.SPRING;
		switch (s) {
			case SUMMER : System.out.println ("SUMMER");
			default : System. out.println ("SEASON");
			case WINTER : System. out.println ("WINTER");
		}
	}
}