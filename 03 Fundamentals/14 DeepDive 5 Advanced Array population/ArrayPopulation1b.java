public class ArrayPopulation1b {
    public static void main(String[] args) {
        // Declare and initialize arrays of various data types with default size 10
        boolean[] booleanArray   = new boolean[10];
        byte[] byteArray         = new byte[10];
        short[] shortArray       = new short[10];
        char[] charArray         = new char[10];
        int[] intArray           = new int[10];
        float[] floatArray       = new float[10];
        long[] longArray         = new long[10];
        double[] doubleArray     = new double[10];
        String[] stringArray     = new String[10];

        // Print default values of each array type
        System.out.println("Printing Default Array Values:");
        printArray("Boolean   : ", booleanArray);
        printArray("Byte      : ", byteArray);
        printArray("Short     : ", shortArray);
        printArray("Char      : ", charArray);
        printArray("Integer   : ", intArray);
        printArray("Float     : ", floatArray);
        printArray("Double    : ", doubleArray);
        printArray("Long      : ", longArray);
        printArray("String    : ", stringArray);
    }

    // Overloaded methods to print arrays of different types with a label prefix

    public static void printArray(String label, boolean[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void printArray(String label, byte[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void printArray(String label, short[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void printArray(String label, char[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            // Print Unicode null character explicitly
            System.out.print(array[i] == '\u0000' ? "\\u0000" : array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void printArray(String label, int[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void printArray(String label, float[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void printArray(String label, long[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void printArray(String label, double[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void printArray(String label, String[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            // Print nulls explicitly for clarity
            System.out.print(array[i] == null ? "null" : "\"" + array[i] + "\"");
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}