import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {10, 7, 2, 8, 9, 1, 5};
        System.out.print("Array before sorting: ");
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        QuickSort ob = new QuickSort(); // Corrected class name
        ob.sort(arr, 0, n - 1);

        // Printing sorted array
        System.out.println("Sorted array");
        printArray(arr);
    }

    // Sorting using last element as pivot
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // smaller element index
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // The main function that implements QuickSort
    void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            // Recursively sort elements before partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    // Print function
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
