public class TestClass3 {
    public static void main(String[] args) {
        try {
            //Exception e = new Exception("An error occurred"); // Create a valid exception
            Exception e = null;//causes NullPointerException
            throw e; 
        } catch (Exception ex) {
            ex.printStackTrace(); // Handle the exception here
        }
    }
}
