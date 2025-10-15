public class ArrayTest3 {
    public static void main(String[] args) {
        // Initialize an array with lotto numbers
        int[] lottoNumbers = {233, 444, 678, 675, 897, 678, 453, 567, 455, 456, 453};

        // Use a for-each loop with an external index to print each value
        int index = 0;
        for (int number : lottoNumbers) {
            System.out.println("Index = " + index + " | Value = " + number);
            index++;
        }
    }
}