public class Test {
	public static void main(String[] args) {
		Processor lambdaAdd = (x, y) -> x + y;
		Processor anonymousMultiply = new Processor() {
		public int process(int a, int b) {
			return a * b;
		}
	};
	System.out.println(lambdaAdd.process(5, 3));
	System.out.println(anonymousMultiply.process(5, 3));
	}
}
@FunctionalInterface
interface Processor {
	int process(int a, int b);
}