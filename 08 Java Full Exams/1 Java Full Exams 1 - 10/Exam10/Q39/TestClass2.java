public class TestClass2 {
    public static void main(String[] args) {
        XXX obj = new XXX(); // To throw XXX's m1() which throw an exception.
        try {//m1() should be placed inside a try & catch block to throw Exception or error.
            obj.m();  // This will call XXX's m() method and throw an Exception.
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }
    }
}
class XXX {
    public void m() throws Exception {
        throw new Exception("Exception from XXX");
    }
}
class YYY extends XXX {
    @Override
    public void m() {
        System.out.println("Method m() in YYY, but no exception is thrown.");
    }
}
