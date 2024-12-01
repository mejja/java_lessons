public class Test2 {
    public static void main(String[] args) {
        int[] a = new int[10]; 
        try {
            int i = a[m1()]; //
            e.printStackTrace(); // Handle the exception thrown by m1()
        }
    }

    public static int m1() throws Exception {
        throw new Exception("Some Exception");
    }
}
