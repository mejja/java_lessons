public class BlockTest2 {
    public static void main(String[] args) {

        // Labeled block: label1
        label1: {
            int i = 1; // Local variable scoped to label1 block
            System.out.println("Block 1 i = " + i);
        }

        // Labeled block: label2
        label2: {
            int i = 1; // Separate local variable scoped to label2 block
            System.out.println("Block 2 i = " + i);
        }
    }
}