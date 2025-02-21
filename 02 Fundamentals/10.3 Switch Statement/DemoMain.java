public class DemoMain {  
    public static void main(String[] args) {
    
        // Check if the variable 'x' is less than 0 (the variable 'x' is not defined in the code)
        // This will result in a compilation error because 'x' is undeclared
        if (x < 0); // <-- Unnecessary semicolon here, it makes the 'if' condition do nothing.

        else
            // If 'x' is not less than 0, print "positive"
            System.out.println("positive");  

        // Regardless of the 'if' condition, this line will always execute, printing "negative"
        // However, this will cause confusion due to the missing braces for the 'if-else' block
        System.out.println("negative");
    }
}
