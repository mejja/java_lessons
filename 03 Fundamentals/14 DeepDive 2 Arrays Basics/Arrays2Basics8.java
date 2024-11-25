import java.util.Arrays;
public class Arrays2Basics8 {
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
         System.out.println("Array Values + 1 divisible by 2 & 11");
        for (int i=0; i < myNumbers.length; i++) {
            for (int j=0; j<myNumbers[i].length; j++) {
                int increment = myNumbers[i][j] + 1;
                if((increment % 2 == 0) && (increment % 11 == 0)) 
                    System.out.print(increment + " ");
            }
        }
  }
}

