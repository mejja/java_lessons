class LambdaFunctionTest {
    @FunctionalInterface
    interface LambdaFunction {
        int apply(int j); // Single abstract method
        boolean equals(java.lang.Object arg0); // This is inherited from Object
    }

    public static void main(String []args) {
        LambdaFunction lambdaFunction = i -> i * i; // #1
        System.out.println(lambdaFunction.apply(10)); // Will print 100
    }
}
