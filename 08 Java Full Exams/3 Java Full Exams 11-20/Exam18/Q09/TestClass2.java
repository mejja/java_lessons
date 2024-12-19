import java.util.*;
public class TestClass2 {
    public static void main(String args[]) {
        Stack[] stacks = { new Stack(), new Stack() }; // Use an array to wrap s1 and s2
        processStacks(stacks);
        System.out.println(stacks[0] + " " + stacks[1]); // Both s1 and s2 will now reference the same stack
    }

    public static void processStacks(Stack[] stacks) {
        stacks[0].push(new Integer("100")); // Add 100 to s1
        stacks[1] = stacks[0]; // Now s2 references the same object as s1
    }
}
