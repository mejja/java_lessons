public class Test {
    public static void main(String[] args) {
        if (args[0].equals("open")) { // Outer if condition
            if (args[1].equals("someone")) { // Inner if condition
                System.out.println("Hello!"); // Executes if both conditions are true
            } else {
                System.out.println("Go away " + args[1]); // Executes if outer is true and inner is false
            }
        }
    }
}
