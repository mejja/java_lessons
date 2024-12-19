public class TestClass {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        SuperClass subClassAsSuper = new SubClass(); // Upcasting
        SubClass subClass = new SubClass();

        // Calling static methods
        superClass.display();        // Calls SuperClass.display()
        subClassAsSuper.display();  // Calls SuperClass.display() due to method hiding
        subClass.display();        // Calls SubClass.display()
    }
}
class SuperClass {
    // Static method in the superclass
    static void display() {
        System.out.println("Static method in SuperClass");
    }
}

class SubClass extends SuperClass {
    // Static method in the subclass hiding the superclass method
    static void display() {
        System.out.println("Static method in SubClass");
    }
}

