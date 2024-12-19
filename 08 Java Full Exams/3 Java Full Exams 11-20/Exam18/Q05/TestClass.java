public class TestClass {
    public static void main(String[] args) {
        String mStr = "123";
       // Long m = new Long(mStr); // Use Long.valueOf() instead of the constructor
        Long m = Long.valueOf(mStr);
        System.out.println(m.getClass().getName()); // Get the class name
        System.out.println(m); 
    }
}
