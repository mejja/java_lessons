import java.util.*;

public class Q12 {
    static boolean b = true;          // Static boolean variable initialized to true
    static int[] ai = new int[1];     // Static int array of size 1, default value at ai[0] is 0
    static char ch;                   // Static char variable, default value is '\u0000' (null character)
    static boolean[] ba = new boolean[1];  // Static boolean array of size 1, default value at ba[0] is false

    public static void main(String[] args) {
        boolean x = false;            // Local boolean variable initialized to false
        if (b) {
            x = (ch == ai[ch]);       // Check if ch is equal to ai[ch]
        } else {
            x = (ba[ch] = b);         // Assign b to ba[ch] and assign the result to x
        }

        System.out.println(x + " " + ba[ch]);
    }
}
