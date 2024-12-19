public class TestClass2 {
    public static void main(String[] args) { 
        new TestClass2().sayHello(); // Calls the instance method
    }

    public static void sayHello() { 
        System.out.println("Static Hello World"); // Static method
    }

    public void sayHello() { 
        System.out.println("Hello World"); // Instance method
    }
}
