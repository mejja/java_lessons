class OuterClass {
    // Functional interface embedded within a class
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);  // Single abstract method
    }
    public static void main(String[] args) {
        // Lambda expression implementing the MathOperation interface
        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;

        // Using the lambda expressions
        System.out.println("Addition: " + addition.operate(5, 3));         // Output: 8
        System.out.println("Multiplication: " + multiplication.operate(5, 3)); // Output: 15
    }
}
