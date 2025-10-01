public class ArrayTest3 {
    public static void main(String[] args) {
        // Initialize an array with predefined lotto numbers
        int[] lottoNumbers = {233, 444, 678, 675, 897, 678, 453, 567, 455, 456, 453};

        // Iterate through the array and print each index and its corresponding value
        for (int index = 0; index < lottoNumbers.length; index++) {
            System.out.println("Index = " + index + " | Value = " + lottoNumbers[index]);
        }
    }
}