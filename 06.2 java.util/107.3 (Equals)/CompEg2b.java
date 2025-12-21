public class CompEg2b { // Declares the main class for this example.
    public static void main(String[] args) { // The entry point where the program starts.
        String a = "1"; // Assigns the string literal "1" to variable 'a'.
        String b = "1"; // Assigns the string literal "1" to variable 'b'.

        // Compares the actual text content of 'a' and 'b'.
        // Unlike '==', which checks memory locations, .equals() checks if the characters match.
        boolean result = a.equals(b); 

        // Prints the result, which will be 'true' because "1" is content-equal to "1".
        System.out.println("result = "+result); 
    }
}