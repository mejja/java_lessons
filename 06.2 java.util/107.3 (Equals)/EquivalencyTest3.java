public class EquivalencyTest3 { // Declares the class EquivalencyTest3.
    public static void main(String[] args) { // Entry point of the application.
        // The 'new' keyword ensures three distinct objects are created in heap memory.
        String a = new String("a"); // Creates a new String object 'a' with value "a".
        String b = new String("a"); // Creates a second String object 'b' with value "a".
        String c = new String("a"); // Creates a third String object 'c' with value "a".
        
        // .equals() compares the sequence of characters, not memory addresses.
        boolean result1 = a.equals(b); // Compares "a" and "a" -> returns true.
        boolean result2 = c.equals(b); // Compares "a" and "a" -> returns true.
        boolean result3 = a.equals(c); // Compares "a" and "a" -> returns true.
        
        // Prints the results to the console.
        System.out.println("Result1 = "+result1); // Outputs Result1 = true
        System.out.println("Result2 = "+result2); // Outputs Result2 = true
        System.out.println("Result3 = "+result3); // Outputs Result3 = true
    }
}