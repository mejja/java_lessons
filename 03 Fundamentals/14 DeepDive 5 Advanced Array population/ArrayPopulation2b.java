import java.util.Arrays;

public class ArrayPopulation1b {

    public static void main(String[] args) {
        // Initialize arrays of various primitive types and String
        boolean[] arrayBol   = new boolean[10];
        byte[] arrayByte     = new byte[10];
        short[] arrayShort   = new short[10];
        char[] arrayChar     = new char[10];
        int[] arrayInt       = new int[10];
        float[] arrayFloat   = new float[10];
        long[] arrayLong     = new long[10];
        double[] arrayDouble = new double[10];
        String[] arrayString = new String[10];

        // Assign values to the last index of each array
        arrayBol[9]     = true;
        arrayByte[9]    = (byte)127;
        arrayShort[9]   = 50;
        arrayChar[9]    = 'z';
        arrayInt[9]     = 99;
        arrayFloat[9]   = 100.99f;
        arrayLong[9]    = 200L;
        arrayDouble[9]  = 200.99;
        arrayString[9]  = "final";

        // Print default and assigned values of each array
        System.out.println("Printing Default Arrays values:");
        printArray("Boolean: ", arrayBol);
        printArray("Byte: ", arrayByte);
        printArray("Short: ", arrayShort);
        printArray("Char: ", arrayChar);
        printArray("Integer: ", arrayInt);
        printArray("Float: ", arrayFloat);
        printArray("Double: ", arrayDouble);
        printArray("Long: ", arrayLong);
        printArray("String: ", arrayString);
    }

    // Generic print method for boolean arrays
    public static void printArray(String prefix, boolean[] array) {
        System.out.println(prefix + Arrays.toString(array));
    }

    // Generic print method for byte arrays
    public static void printArray(String prefix, byte[] array) {
        System.out.println(prefix + Arrays.toString(array));
    }

    // Generic print method for short arrays
    public static void printArray(String prefix, short[] array) {
        System.out.println(prefix + Arrays.toString(array));
    }

    // Generic print method for char arrays
    public static void printArray(String prefix, char[] array) {
        System.out.println(prefix + Arrays.toString(array));
    }

    // Generic print method for int arrays
    public static void printArray(String prefix, int[] array) {
        System.out.println(prefix + Arrays.toString(array));
    }

    // Generic print method for float arrays
    public static void printArray(String prefix, float[] array) {
        System.out.println(prefix + Arrays.toString(array));
    }

    // Generic print method for long arrays
    public static void printArray(String prefix, long[] array) {
        System.out.println(prefix + Arrays.toString(array));
    }

    // Generic print method for double arrays
    public static void printArray(String prefix, double[] array) {
        System.out.println(prefix + Arrays.toString(array));
    }

    // Generic print method for String arrays
    public static void printArray(String prefix, String[] array) {
        System.out.println(prefix + Arrays.toString(array));
    }
}