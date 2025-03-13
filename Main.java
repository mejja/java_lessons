import java.util.Scanner;

public class Main {
    // Function to find the maximum temperature
    static int findMaxTemperature(int n, int[] temperatureChange) {
        // Initialize currentTemp and maxtemp
        int currentTemp = 0;
        int maxtemp = Integer.MIN_VALUE;  // Set to the lowest possible integer

        for (int i = 0; i < n; i++) {
            currentTemp += temperatureChange[i];
            if (currentTemp > maxtemp) {
                maxtemp = currentTemp;
            }
        }
        
        return maxtemp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from stdin
        int n = scanner.nextInt();
        int[] temperatureChange = new int[n];
        for (int i = 0; i < n; i++) {
            temperatureChange[i] = scanner.nextInt();
        }

        // Call the function and display the result on stdout
        int result = findMaxTemperature(n, temperatureChange);
        System.out.println(result);
    }
}
