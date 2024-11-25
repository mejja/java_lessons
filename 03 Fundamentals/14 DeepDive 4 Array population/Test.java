import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] evenArray = new int[50];
        int[] oddArray = new int[50]; 
        int[] primeArray = new int[100]; 

        int evenValue = 2; 
        int oddValue = 1;

        // Populate array with even integers
        for (int i = 0; i < evenArray.length; i++) {
            if (evenValue % 2 == 0) {
                evenArray[i] = evenValue;
            } else {
            }
            evenValue += 2; 
        }

         // Populate array with Odd integers
        for (int i = 0; i < oddArray.length; i++) {
            if (oddValue % 2 != 0) {
                oddArray[i] = oddValue;
            } else {
            }
            oddValue += 2; 
        }

        // Populate array with Prime integers
        for (int i = 0; i < primeArray.length; i++){
            if (isPrime(i))
                primeArray[i] =i;

        }

        // Print the array
        System.out.println("Array of even integers:");
        for (int number : evenArray) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
        System.out.println("Array of Odd integers:");
        for (int number : oddArray) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
        System.out.println("Array of Prime integers:");
        for (int number : primeArray) {
            if(number !=0)
            System.out.print(number + " ");
        }
    }

    //checking for prime numbers
    public static boolean isPrime(int n){
        if(n<=1){//check if number is 1 or <1
            return false;
        }
        for(int i=2;i<=Math.sqrt(n); i++){
            if(n%i ==0){
                return false; //check divisibility by any number which will  make it not prime
            }
        }
        return true;
    }
}
