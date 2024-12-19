class BlockLambda {
interface LambdaFunction {
String intKind(int a);
}
public static void main(String []args) {
LambdaFunction lambdaFunction =
(int i) -> { //#1
if((i % 2) == 0) return "even";
else return "odd";
};
System.out.println(lambdaFunction.intKind(10));
}
}