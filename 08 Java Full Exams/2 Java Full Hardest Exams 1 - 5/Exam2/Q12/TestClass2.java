public class TestClass2 {
    public static void main(String[] args) throws Exception { // Declare the exception
        //Exception e = new Exception("An error occurred");
        Exception e = null;//causes NullPointerException
        throw e; // Now valid
    }
}
