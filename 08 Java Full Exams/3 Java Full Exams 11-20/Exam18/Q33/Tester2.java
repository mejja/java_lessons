public class Tester2 {
    public static void main(String[] args) {
        StringWrapper sw = new StringWrapper("How are you?");
        StringBuilder sb = new StringBuilder("How are you?");
        System.out.println("Hello, " + sw);
        System.out.println("Hello, " + sb);
    }
}

class StringWrapper {
    private String theVal;

    public StringWrapper(String str) {
        this.theVal = str; // Correct assignment
    }

    @Override
    public String toString() {
        return theVal; // Provide a meaningful string representation
    }
}
