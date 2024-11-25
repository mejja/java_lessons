import java.util.Arrays;
public class ArraysMultiD {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7},{5, 6, 7} };
    System.out.println(Arrays.deepToString(myNumbers));
    for (int[] row : myNumbers) {
      for (int i : row) {
        System.out.println(i);
      }
    }
  }
}

