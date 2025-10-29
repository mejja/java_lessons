public class MultiTest1 {
    public static void main(String[] args) {
        // Initialize a 2D array representing lotto number groups
        int[][] lottoGroups = {
            {1111, 2222, 3333, 4444},
            {6666, 7777, 8888, 9999},
            {11111, 121212, 131313}
        };

        // Traverse each group (row)
        for (int groupIndex = 0; groupIndex < lottoGroups.length; groupIndex++) {
            System.out.println("Group: " + groupIndex);

            // Traverse each value within the group (column)
            for (int valueIndex = 0; valueIndex < lottoGroups[groupIndex].length; valueIndex++) {
                System.out.println("  Value " + valueIndex + " = " + lottoGroups[groupIndex][valueIndex]);
            }
        }
    }
}
