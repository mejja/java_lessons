import java.util.*;
public class TestClass{
    public static void main (String args [ ] ) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);       // Adds 4 to the list
        nums.add(5);       // Adds 5 to the list
        nums.set(1, 6);    // Replaces the element at index 1 (which is 5) with 6
        nums.remove(0);    // Removes the element at index 0 (which is 4)
        for (Integer v : nums) System.out.print(v);  // Iterates through the list and prints the elements
    }
}
