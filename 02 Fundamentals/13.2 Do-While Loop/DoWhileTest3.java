public class DoWhileTest3 {
    public static void main(String[] args) {
        // Initialize an array with lotto numbers
        int[] lottoNumbers = {233, 444, 678, 675, 897, 678, 453, 567, 455, 456, 453};

        int index = 0;

        // Use a do-while loop to print each element with its index
        do {
            System.out.println("Index = " + index + " | Value = " + lottoNumbers[index]);
            index++;
        } while (index < lottoNumbers.length); // Loop until all elements are printed
    }
}