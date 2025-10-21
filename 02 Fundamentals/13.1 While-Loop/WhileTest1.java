public class WhileTest1 {
    public static void main(String[] args) {
        int[] lottoNumbers = {233, 444, 678, 675, 897, 678, 453, 567, 455, 456, 453};
        int i = 0;

        // Use i < lottoNumbers.length to avoid out-of-bounds access
        while (i < lottoNumbers.length) {
            System.out.println("Index = " + i + " | Value = " + lottoNumbers[i]);
            i++;
        }
    }
}
