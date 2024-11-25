import java.util.Arrays;
public class ArraysBasics7 {
  public static void main(String[] args) {

  	// Declare a 100X30 multidimensional array
        int[][] myNumbers = new int[100][30];

        // Array Population
        int value = 1;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                myNumbers[i][j] = value;
                value++;
                if (value > 3000) {
                    break;
                }
            }
            if (value > 3000) {
                break;
            }
        }
        System.out.println("Array Values + 1");
		for(int[] row : myNumbers){
			for(int i : row){
			int	increment= i+1;
			System.out.print(increment + " ");
			}
		}
  }
}

