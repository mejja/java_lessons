public class Test {
	public static void main(String[] args) {
		FunInter lambdaAdd = (int x, int y) -> {
			return x + y;
	};
	FunInter lambdaAdd2 = () -> System.out.println("Hello");
	int a = lambdaAdd.process(5, 3);

	lambdaAdd2.process2();
	System.out.println(a);
	}
}

interface FunInter{
	void process2();
	int process(int a, int b);
}