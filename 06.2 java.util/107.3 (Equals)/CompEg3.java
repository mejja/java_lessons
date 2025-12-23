public class CompEg3 { // Declares the class CompEg3.
    public static void main(String[] args) { // Entry point of the program.
        // Forces the creation of a new String object in the heap memory, even if "1" already exists.
        String a = new String("1"); 
        // Forces the creation of another distinct String object in the heap memory.
        String b = new String("1"); 

        // The '==' operator compares the memory addresses (references) of the two objects.
        // Since 'a' and 'b' are two different objects in memory, this returns false.
        boolean result = a == b;

        // Prints "result = false".
        System.out.println("result = "+result); 
    }
}