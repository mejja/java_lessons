import java.util.Arrays;
public class Arrays2Basics10 {
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
        //Printing Arrays values on screen
        System.out.println("Array Values");
        for ( int i=0; i < myNumbers.length; i++) //outer loop
        { 
            for ( int j=0; j< myNumbers[i].length; j++) //inner loop
            {
                if((myNumbers[i][j] % 2 != 0) && (myNumbers[i][j] % 8 == 0))
                System.out.print(myNumbers[i][j] + " ");

            }
        }
         System.out.println(" ");
         System.out.println(" ");
         System.out.println("Array Values + 1");
        for ( int i=0; i < myNumbers.length; i++) //outer loop
        { 
            for ( int j=0; j< myNumbers[i].length; j++) //inner loop
            {
                int increment = myNumbers[i][j] + 1;
                if((increment % 2 != 0) && (increment % 8 == 0))
                    System.out.print(increment + " ");

            }
        }
  }
}
