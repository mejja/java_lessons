import java.util.*;
public class Q09 {
    int a;      // Instance variable, default value is 0
    int b = 0;  // Instance variable with explicit initialization to 0
    static int c;  // Static variable, shared among all instances of Q09, default value is 0

    public void m() {
        int d;      // Local variable, not initialized
        int e = 0;  // Local variable initialized to 0
        a++;        // Increments instance variable a
        b++;        // Increments instance variable b
        c++;        // Increments static variable c
        d++;        // Uninitialized local variable, causes a compilation error
        e++;        // Increments local variable e
    }

    public static void main(String[] args) {
  
    }
}
