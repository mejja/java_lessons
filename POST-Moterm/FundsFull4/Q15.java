import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        // Initialize a String variable with value "123"
        String mStr = "123";
        
        // Convert the String "123" to a long using constructor of Long class
        long m = new Long(mStr);  // Deprecated, use Long.valueOf(mStr) instead
        
        // Convert mStr to a long using parseLong method of Long class
        long m2 = Long.parseLong(mStr);
        
        // Convert mStr to a long using valueOf method of Long class 
        long m3 = Long.valueOf(mStr);  
        
        // Print the values of m, m2, and m3
        System.out.println(m);   
        System.out.println(m2);  
        System.out.println(m3);  
    }
}
