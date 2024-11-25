public class ArrayPopulation1b {
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

        //populating the array with values
        for(int i=0; i<arrayInt.length; i++){
            arrayByte[i]   =(byte)i;
            arrayShort[i]  =(short)i;
            arrayChar[i]   =(char)(i+65);
            arrayInt[i]    =i;
            arrayLong[i]   =i;
            arrayFloat[i]  =i;
            arrayDouble[i] =i;
            arrayString[i] =String.valueOf(i);   
        }

        //Populating boolean values to array
        for(int i=0; i<arrayBol.length; i++)
            if(i%2==0)
                arrayBol[i]=true;
            else//not necessay as default value is false but for formality
                arrayBol[i]= false;
            
            

        // Default Values printing
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