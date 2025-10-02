public class ArrayTest3b {
    public static void main(String[] args) {
        // Initialize an array with predefined lotto numbers
        int[] lottoNumbers = {233, 444, 678, 675, 897, 678, 453, 567, 455, 456, 453};

        // Iterate through every second element in the array (i.e., even indices)
        for (int index = 0; index < lottoNumbers.length; index += 2) {
            System.out.println("Index = " + index + " | Value = " + lottoNumbers[index]);
        }
    }
}
