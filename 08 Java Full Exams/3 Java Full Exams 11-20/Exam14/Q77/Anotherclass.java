public class AnotherClass {
    public void go() {
        System.out.print("A"); // Step 1: Print "A"
        try {
            stop(); // Step 2: Call stop()
        } catch (ArithmeticException e) {
            System.out.print("B"); // This block won't be executed
        } finally {
            System.out.print("C"); // Step 5: Print "C"
        }
        System.out.print("D"); // Step 6: Print "D"
    }

    public void stop() {
        System.out.print("E"); // Step 3: Print "E"
        Object x = null; // Step 4: Create a null reference
        x.toString(); // Step 4: This will throw a NullPointerException
        System.out.print("F"); // This line will NOT be executed due to the exception
    }

    public static void main(String[] args) {
        new AnotherClass().go(); // Step 7: Call the go() method
    }
}
