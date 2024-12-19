public class TestClass {
    char c;  // Instance variable 'c', default value will be '\u0000' (the null character)

    public void m1() {
        char[] cA = { 'a', 'b' };  // Array 'cA' with elements 'a' and 'b'
        m2(c, cA);  // Call m2, passing 'c' (the instance variable) and the array 'cA'
        System.out.println(((int) c) + ", " + cA[1]);
    }

    public void m2(char c, char[] cA) {
        c = 'b';  // This modifies the local copy of 'c', not the instance variable
        cA[1] = cA[0] = 'm';  // This modifies the contents of the array 'cA'
    }

    public static void main(String args[]) {
        new TestClass().m1();  // Create a new instance of TestClass and call m1
    }
}
