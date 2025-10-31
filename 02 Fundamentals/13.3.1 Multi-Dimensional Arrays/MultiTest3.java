public class MultiTest3 {
    public static void main(String[] args) {
        // Initialize a 2D array representing lotto number groups
        int[][] lottoGroups = {
            {1111, 2222, 3333, 4444},
            {6666, 7777, 8888, 9999},
            {11111, 121212, 131313}
        };

        int groupIndex = 0;

        // Enhanced for-each loop to iterate over each group
        for (int[] group : lottoGroups) {
            System.out.println("Group: " + groupIndex++); // Increment inside print

            int valueIndex = 0;

            // Enhanced for-each loop to iterate over each value in the group
            for (int value : group) {
                if (value % 2 == 0) {
                    System.out.println("  Value " + valueIndex++ + " = " + value); // Increment inside print
                }
            }
        }
    }
}
