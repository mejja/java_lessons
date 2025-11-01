public class AssertTest {
    public static void main(String[] args) {
        boolean condition = true;

    // Assertion: will throw AssertionError with message if condition is false
        assert condition : "Expected true condition";

        System.out.println("Finished");
    }
}
