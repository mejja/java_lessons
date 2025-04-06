import java.util.LinkedList;

public class TestLinkedListAddAll {
    public static void main(String[] args) {
        // Create LinkedList instances
        LinkedList<String> c = new LinkedList<>();
        LinkedList<String> stack = new LinkedList<>();
        
        // Adding elements to 'c'
        c.push("Zero");
        c.push("First");
        c.push("Second");
        
        // Adding elements from 'c' to 'stack'
        stack.addAll(c);
        
        // Getting and printing stack elements
        System.out.println("Stack after addition: " + stack);
    }
}
