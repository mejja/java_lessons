class FirstLambda{
	public static void main(String[] args){
		LambdaFunction lambdaFunction=()-> System.out.println("Hello world");
		lambdaFunction.call();
	}
}
interface LambdaFunction{
	void call();
}
