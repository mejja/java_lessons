public class Lambdas4 {
	public static void main(String... args) {
		Something s = (Integer i) -> { return i.toString(); };
	    System.out.println(s.doit(4));
	}
}
@FunctionalInterface
interface Something {
    String doit(Integer i);
}
