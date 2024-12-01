public class CheckedTest {
    public static void main(String[] args) {
        try {
            throw new Exception("An error occurred.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
