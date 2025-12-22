public class CompEg3b { // Declares the class CompEg3b.
    public static void main(String[] args) { // Entry point of the program.
        // Creates a new String object in the heap memory with the value "1".
        String a = new String("1"); 
        // Creates a second, distinct String object in the heap memory with the same value "1".
        String b = new String("1"); 
        
        // The .equals() method is designed to look inside the objects and compare their character sequences.
        // Since both objects contain the character '1', this returns true.
        boolean result = a.equals(b); 
        
        // Prints "result = true".
        System.out.println("result = "+result); 
    }
}