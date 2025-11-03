public class AssertTest2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;

        // This assertion passes since a > 0
        assert a > 0 : "Assertion failed: a should be greater than 0";

        // This assertion fails since b is not greater than 10
        assert b > 10 : "Assertion failed: b should be greater than 10";

        System.out.println("Finished");
    }
}
