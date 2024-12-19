public class TestClass {//corrected code
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1Z0");
        sb.append("-808"); // StringBuilder uses append, not concat
        System.out.println(sb);
    }
}
