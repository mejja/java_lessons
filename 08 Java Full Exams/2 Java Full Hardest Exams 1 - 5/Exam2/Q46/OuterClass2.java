class OuterClass2 {

    // Functional interface embedded within a class
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);  // Single abstract method
    }
    // Static method for addition (to be used as a method reference)
    public static int add(int a, int b) {
        return a + b;
    }
    // Static method for multiplication (to be used as a method reference)
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        // Method reference for static methods
        MathOperation addition = OuterClass2::add;
        MathOperation multiplication = OuterClass2::multiply;

        // Using the method references
        System.out.println("Addition: " + addition.operate(5, 3));// Output: 8
        System.out.println("Multiplication: " + multiplication.operate(5, 3)); // Output: 15
    }
}
