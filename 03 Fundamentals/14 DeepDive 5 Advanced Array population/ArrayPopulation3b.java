public class ArrayPopulation1b {

    public static void main(String[] args) {
        // Declare arrays of various types, each with 10 elements
        boolean[] booleanArray   = new boolean[10];
        byte[] byteArray         = new byte[10];
        short[] shortArray       = new short[10];
        char[] charArray         = new char[10];
        int[] intArray           = new int[10];
        float[] floatArray       = new float[10];
        long[] longArray         = new long[10];
        double[] doubleArray     = new double[10];
        String[] stringArray     = new String[10];

        // Populate arrays with values based on index
        for (int index = 0; index < intArray.length; index++) {
            byteArray[index]   = (byte) index;               // Cast index to byte
            shortArray[index]  = (short) index;              // Cast index to short
            charArray[index]   = (char) (index + 65);        // ASCII uppercase letters (A–J)
            intArray[index]    = index;                      // Direct assignment
            longArray[index]   = index;                      // Implicit widening
            floatArray[index]  = index;                      // Implicit widening
            doubleArray[index] = index;                      // Implicit widening
            stringArray[index] = String.valueOf(index);      // Convert index to String
        }

        // Populate boolean array: true for even indices, false for odd
        for (int index = 0; index < booleanArray.length; index++) {
            booleanArray[index] = (index % 2 == 0); // true if even, false if odd
        }

        // Print all arrays with labels
        System.out.println("Printing Populated Array Values:");
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

    /**
     * Prints a boolean array with a label.
     * Example: Boolean : [true, false, true, ...]
     */
    public static void printArray(String label, boolean[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    /**
     * Prints a byte array with a label.
     * Example: Byte : [0, 1, 2, ...]
     */
    public static void printArray(String label, byte[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    /**
     * Prints a short array with a label.
     * Example: Short : [0, 1, 2, ...]
     */
    public static void printArray(String label, short[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    /**
     * Prints a char array with a label.
     * Example: Char : [A, B, C, ...]
     */
    public static void printArray(String label, char[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    /**
     * Prints an int array with a label.
     * Example: Integer : [0, 1, 2, ...]
     */
    public static void printArray(String label, int[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    /**
     * Prints a float array with a label.
     * Example: Float : [0.0, 1.0, 2.0, ...]
     */
    public static void printArray(String label, float[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    /**
     * Prints a long array with a label.
     * Example: Long : [0, 1, 2, ...]
     */
    public static void printArray(String label, long[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    /**
     * Prints a double array with a label.
     * Example: Double : [0.0, 1.0, 2.0, ...]
     */
    public static void printArray(String label, double[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    /**
     * Prints a String array with a label.
     * Example: String : ["0", "1", "2", ...]
     */
    public static void printArray(String label, String[] array) {
        System.out.print(label + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"" + array[i] + "\"");
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}