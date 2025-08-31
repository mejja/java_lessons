public class BlockTest4 {
    public static void main(String[] args) {
        // Start of the program
        System.out.println("Step 1");

        // Outer labeled block: label1
        label1: {
            System.out.println("Step 2");

            // Nested labeled block: label2
            label2: {
                System.out.println("Step 3");

                // Conditional break to exit label2 block
                if (true) {
                    break label2; // Skips the rest of label2 block
                }

                // This block and its contents are skipped due to the break above
                label3: {
                    System.out.println("Step 4");

                    label4: {
                        System.out.println("Step 5");
                    }

                    System.out.println("Step 6");
                }

                System.out.println("Step 7");
            }

            // Continues after label2 block
            System.out.println("Step 8");
        }

        // Final step after all blocks
        System.out.println("Step 9");
    }
}
