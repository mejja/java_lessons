public class ArrayPopulation4b {
    public static void main(String[] args) {
        boolean[] arrayBol   = new boolean[10];
        byte[] arrayByte     = new byte[10];
        short[] arrayShort   = new short[10];
        char[] arrayChar     = new char[10];
        int[] arrayInt       = new int[10];
        float[] arrayFloat   = new float[10];
        long[] arrayLong     = new long[10];
        double[] arrayDouble = new double[10];
        String[] arrayString = new String[10];

        //Write a for loop that populates -1 into the array.
        for(int index=0; index<arrayInt.length; index++){
            arrayByte[index]   =(byte)-1;
            arrayShort[index]  =(short)-1;
            arrayInt[index]    =-1;
            arrayLong[index]   =-1;
            arrayFloat[index]  =-1;
            arrayDouble[index] =-1;
        }
        //populating non-integer values to arrays
        for(int i=0;i<arrayBol.length;i++)
            arrayBol[i]= true;
        for(int i=0;i<arrayChar.length; i++)
            arrayChar[i]='a';
        for(int i=0; i<arrayString.length; i++)
            arrayString[i]=" ";

        // Default Values printing
        System.out.println("Printing Populated Arrays values:");
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

    public static void printArray(String prefix, boolean[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, byte[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, short[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, char[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, int[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, float[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, long[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, double[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, String[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }
}