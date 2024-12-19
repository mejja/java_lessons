public class Test {
	public static void main(String[] args) {
		FunInter lambdaAdd = new FunInter (){

		lambdaAdd = (int x, int y) -> {
			return x + y;
		};
	};
	int a = lambdaAdd.process(5, 3);

	System.out.println(a);
	}
}

interface FunInter{
	int process(int a, int b);
}