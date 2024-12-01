public class ClassCastTest {
    public static void main(String[] args) {
        
        Exception exception = new Exception();
        
        System.out.println("Step 1");
        
        Exception exception2 = (Exception) exception; // This cast is now safe
        
        System.out.println("Step 2");
    }
}
