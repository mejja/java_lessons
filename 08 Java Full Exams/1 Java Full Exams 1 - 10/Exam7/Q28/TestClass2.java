public class TestClass2 {
    public static void main(String[] args) {
        XXX obj = new YYY(); // line 4
        try {
            obj.m(); // Call the method that can throw an exception
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception
        }
    }
}

class XXX {
    public void m() throws Exception {
        throw new Exception();
    }
}

class YYY extends XXX {
    @Override
    public void m() {
        // Implementation of m() in YYY
    }
}
