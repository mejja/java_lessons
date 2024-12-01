public class ClassCastTest2 {
    public static void main(String[] args) {
        
        Object exception = new Object();
        
        System.out.println("Step 1");
        
        try {
            Exception exception2 = (Exception) exception;
            System.out.println("Step 2");
        } catch (ClassCastException e) {
            System.out.println("Caught a ClassCastException: " + e.getMessage());
        }
    }
}

