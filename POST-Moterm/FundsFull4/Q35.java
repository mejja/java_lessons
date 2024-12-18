import java.util.*;

class Test {}
public class Q35 {
    public static int main(String[] args) {//passing a string array to int method
        double x = 10, double y;  // Error: double should types once or sepate with ;
        System.out.print();  // Error: Missing argument inside print statement 
        System.out.print[];  // Error: square brackets instead of brackets
        
        for(int k=0; k<x; k++){}  
        
        return 0;  // Error: main method should have void return type in Java, not int
    }
}
