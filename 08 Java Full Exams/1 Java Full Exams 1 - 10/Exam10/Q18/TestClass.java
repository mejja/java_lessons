import java.util.List;

public class TestClass {
    private Object prevObject;
    private int i = 0;

    public void saveObject(List e) {
        prevObject = e;
        i++;
    }

    public static void main(String[] args) {
        TestClass test = new TestClass();
        // The test code will go here
    }
}
